package com.example.redisexample.dto.response.raw.block;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HighLimit {
    @JsonProperty(value = "currency")
    private String currency;
    @JsonProperty(value = "issuer")
    private String issuer;
    @JsonProperty(value = "value")
    private String value;
}
