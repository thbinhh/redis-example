package com.example.redisexample.dto.response.raw.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TakerGets {
    @JsonProperty(value = "currency")
    private String currency;
    @JsonProperty(value = "issuer")
    private String issuer;
    @JsonProperty(value = "value")
    private String value;
    @JsonProperty(value = "TakerGets")
    private String TakerGets;
}
