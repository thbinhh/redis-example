package com.example.redisexample.dto.response.raw.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Meta {
    @JsonProperty(value = "AffectedNodes")
    private List<AffectedNodes> AffectedNodes;
    @JsonProperty(value = "TransactionIndex")
    private Integer TransactionIndex;
    @JsonProperty(value = "TransactionResult")
    private String TransactionResult;
    @JsonProperty(value = "delivered_amount")
    private Object delivered_amount;
}
