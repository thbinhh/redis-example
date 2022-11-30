package com.example.redisexample.dto.response.raw.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AffectedNodes {
    @JsonProperty(value = "DeletedNode")
    private DeletedNode DeletedNode;
    @JsonProperty(value = "CreatedNode")
    private CreatedNode CreatedNode;
    @JsonProperty(value = "ModifiedNode")
    private Object ModifiedNode;
    @JsonProperty(value = "PreviousFields")
    private Object PreviousFields;
}
