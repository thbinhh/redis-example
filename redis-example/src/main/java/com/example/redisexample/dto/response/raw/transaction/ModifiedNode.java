package com.example.redisexample.dto.response.raw.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ModifiedNode {
    @JsonProperty(value = "FinalFields")
    private FinalFields FinalFields;
    @JsonProperty(value = "LedgerEntryType")
    private String LedgerEntryType;
    @JsonProperty(value = "LedgerIndex")
    private String LedgerIndex;
    @JsonProperty(value = "PreviousFields")
    private Object PreviousFields;
    @JsonProperty(value = "PreviousTxnID")
    private String PreviousTxnID;
    @JsonProperty(value = "PreviousTxnLgrSeq")
    private Integer PreviousTxnLgrSeq;
}
