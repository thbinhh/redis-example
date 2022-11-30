package com.example.redisexample.service;

import com.example.redisexample.constant.GetBlockConstant;
import com.example.redisexample.dto.request.XrpRequestDto;
import com.example.redisexample.dto.response.BlockDto;
import com.example.redisexample.dto.response.LatestBlockDto;
import com.example.redisexample.dto.response.TransactionDto;
import com.example.redisexample.dto.response.XrpRawResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Service
public class XrpService {
    @Autowired
    private RestTemplateService<LatestBlockDto> latestBlockService;

    @Autowired
    private RestTemplateService<TransactionDto> rawTransactionService;

    @Autowired
    private RestTemplateService<BlockDto> blockDtoRestTemplateService;


    public Long getLatestBlockHeight() {
        XrpRequestDto request = this.createXrpRequest(GetBlockConstant.JSON_RPC_VER_2, GetBlockConstant.METHOD_GET_LATEST_BLOCK_HEIGHT, Collections.emptyList());
        XrpRawResponse<LatestBlockDto> response = latestBlockService.callExchange(new ParameterizedTypeReference<>() {}, request);
        return response.getResult().getLatestHeight();
    }

    public TransactionDto getTransactionDetail(String txId) {
        HashMap<String, Object> transaction = new HashMap<String, Object>();
        transaction.put("transaction", txId);
        List<Object> params = Arrays.asList(transaction);
        XrpRequestDto request = this.createXrpRequest(GetBlockConstant.JSON_RPC_VER_2, GetBlockConstant.METHOD_GET_TRANSACTION_BY_HASH, params);
        try {
            XrpRawResponse<TransactionDto> response = rawTransactionService.callExchange(new ParameterizedTypeReference<>() {}, request);
            return response.getResult();
        } catch (Exception e) {
            throw new RuntimeException(String.format(e.toString()));
        }
    }

    public BlockDto getBlockDetailByBlockNumber(String blockNumber) {
        HashMap<String, Object> transaction = new HashMap<String, Object>();
        transaction.put("ledger", blockNumber);
        List<Object> params = Arrays.asList(transaction);
        XrpRequestDto request = this.createXrpRequest(GetBlockConstant.JSON_RPC_VER_2, GetBlockConstant.METHOD_GET_BLOCK, params);
        try {
            XrpRawResponse<BlockDto> response = blockDtoRestTemplateService.callExchange(new ParameterizedTypeReference<>() {}, request);
            return response.getResult();
        } catch (Exception e) {
            throw new RuntimeException(String.format(e.toString()));
        }
    }

//    public BlockDto getBlockDetailByBlockHash(String blockHash) {
//        HashMap<String, Object> block = new HashMap<String, Object>();
//        block.put("hash", blockHash);
//        List<Object> params = Arrays.asList(block);
//        XrpRequestDto request = this.createBtcRequest(GetBlockConstant.JSON_RPC_VER_2, GetBlockConstant.METHOD_GET_BLOCK, params);
//        try {
//            XrpRawResponse<BlockDto> response = blockDtoRestTemplateService.callExchange(new ParameterizedTypeReference<>() {}, request);
//            return response.getResult();
//        } catch (Exception e) {
//            throw new RuntimeException(String.format(e.toString()));
//        }
//    }


    private XrpRequestDto createXrpRequest(String rpcVersion, String method, List<Object> params) {
        return XrpRequestDto.builder()
                .jsonrpc(rpcVersion)
                .method(method)
                .params(params)
                .build();
    }
}
