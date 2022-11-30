package com.example.redisexample.service;

import com.example.redisexample.constant.GetBlockConstant;
import com.example.redisexample.dto.request.XrpRequestDto;
import com.example.redisexample.dto.response.XrpRawResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@Component
@Slf4j
public class RestTemplateService<T> {
    @Value("${api.url-base.xrp}")
    private String api;

    @Value("${api.url-base.key}")
    private String apiKey;


    public XrpRawResponse<T> callExchange(ParameterizedTypeReference<XrpRawResponse<T>> responseType, XrpRequestDto xrpRequestDto) {
        log.info("Start call method exchange");
        HttpHeaders headers = this.createHeader();
        Map<String, Object> body = this.createBody(xrpRequestDto);
        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(body, headers);
        RestTemplate restTemplate = new RestTemplate();
        XrpRawResponse<T> exchange = restTemplate.exchange(api, HttpMethod.POST, entity, responseType).getBody();
        log.info("Response call method post {}", exchange);
        return exchange;
    }

    private HttpHeaders createHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-api-key", apiKey);
        return headers;
    }

    private Map<String, Object> createBody(XrpRequestDto xrpRequestDto) {
        Map<String, Object> body = new HashMap<>();
        body.put(GetBlockConstant.JSON_RPC_KEY, xrpRequestDto.getJsonrpc());
        body.put(GetBlockConstant.METHOD_KEY, xrpRequestDto.getMethod());
        body.put(GetBlockConstant.PARAMS_KEY, xrpRequestDto.getParams());
        return body;
    }

}
