package com.example.redisexample.dto.response.raw.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FinalFields {
    @JsonProperty(value = "Account")
    private String Account;
    @JsonProperty(value = "AccountTxnID")
    private String AccountTxnID;
    @JsonProperty(value = "Balance")
    private String Balance;
    @JsonProperty(value = "MessageKey")
    private String MessageKey;
    @JsonProperty(value = "OwnerCount")
    private Double OwnerCount;
    @JsonProperty(value = "BookDirectory")
    private String BookDirectory;
    @JsonProperty(value = "BookNode")
    private String BookNode;
    @JsonProperty(value = "Flags")
    private String Flags;
    @JsonProperty(value = "OwnerNode")
    private String OwnerNode;
    @JsonProperty(value = "PreviousTxnID")
    private String PreviousTxnID;
    @JsonProperty(value = "PreviousTxnLgrSeq")
    private Integer PreviousTxnLgrSeq;
    @JsonProperty(value = "Sequence")
    private Double Sequence;
    @JsonProperty(value = "TakerGets")
    private Object TakerGets;
    @JsonProperty(value = "TakerPays")
    private Object TakerPays;
    @JsonProperty(value = "ExchangeRate")
    private String ExchangeRate;
    @JsonProperty(value = "RootIndex")
    private String RootIndex;
    @JsonProperty(value = "TakerGetsCurrency")
    private String TakerGetsCurrency;
    @JsonProperty(value = "TakerGetsIssuer")
    private String TakerGetsIssuer;
    @JsonProperty(value = "TakerPaysCurrency")
    private String TakerPaysCurrency;
    @JsonProperty(value = "TakerPaysIssuer")
    private String TakerPaysIssuer;
}
