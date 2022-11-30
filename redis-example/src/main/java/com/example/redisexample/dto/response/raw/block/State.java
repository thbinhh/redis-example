package com.example.redisexample.dto.response.raw.block;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class State {
    @JsonProperty(value = "Balance")
    private Object Balance;
    @JsonProperty(value = "Flags")
    private Double Flags;
    @JsonProperty(value = "HighLimit")
    private HighLimit HighLimit;
    @JsonProperty(value = "HighNode")
    private String HighNode;
    @JsonProperty(value = "LedgerEntryType")
    private String LedgerEntryType;
    @JsonProperty(value = "LowLimit")
    private LowLimit LowLimit;
    @JsonProperty(value = "LowNode")
    private String LowNode;
    @JsonProperty(value = "PreviousTxnID")
    private String PreviousTxnID;
    @JsonProperty(value = "PreviousTxnLgrSeq")
    private Double PreviousTxnLgrSeq;
    @JsonProperty(value = "index")
    private String index;
    @JsonProperty(value = "Account")
    private String Account;
    @JsonProperty(value = "OwnerCount")
    private Double OwnerCount;
    @JsonProperty(value = "Sequence")
    private Double Sequence;
    @JsonProperty(value = "IndexNext")
    private String IndexNext;
    @JsonProperty(value = "IndexPrevious")
    private String IndexPrevious;
    @JsonProperty(value = "Indexes")
    private List<String> Indexes;
    @JsonProperty(value = "Owner")
    private String Owner;
    @JsonProperty(value = "RootIndex")
    private String RootIndex;
}
