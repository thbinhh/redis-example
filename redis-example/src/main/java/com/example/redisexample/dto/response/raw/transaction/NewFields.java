package com.example.redisexample.dto.response.raw.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NewFields {
    @JsonProperty(value = "Account")
    private String Account;
    @JsonProperty(value = "BookDirectory")
    private String BookDirectory;
    @JsonProperty(value = "Sequence")
    private Double Sequence;
    @JsonProperty(value = "TakerGets")
    private Object TakerGets;
    @JsonProperty(value = "ExchangeRate")
    private String ExchangeRate;
    @JsonProperty(value = "RootIndex")
    private String RootIndex;
    @JsonProperty(value = "TakerGetsCurrency")
    private String TakerGetsCurrency;
    @JsonProperty(value = "TakerGetsIssuer")
    private String TakerGetsIssuer;
}
