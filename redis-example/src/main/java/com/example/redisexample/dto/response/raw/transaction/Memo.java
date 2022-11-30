package com.example.redisexample.dto.response.raw.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Memo {
    @JsonProperty(value = "MemoData")
    private String MemoData;
    @JsonProperty(value = "MemoType")
    private String MemoType;
}
