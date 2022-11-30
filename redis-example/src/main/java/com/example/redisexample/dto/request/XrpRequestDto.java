package com.example.redisexample.dto.request;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class XrpRequestDto {
    private String jsonrpc;
    private String method;
    private List<Object> params;
}
