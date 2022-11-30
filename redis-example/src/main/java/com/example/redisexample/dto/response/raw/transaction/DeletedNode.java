package com.example.redisexample.dto.response.raw.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DeletedNode {
    @JsonProperty(value = "FinalFields")
    private FinalFields FinalFields;
    @JsonProperty(value = "LedgerEntryType")
    private String LedgerEntryType;
    @JsonProperty(value = "LedgerIndex")
    private String LedgerIndex;
}
