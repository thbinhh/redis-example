package com.example.redisexample.dto.response.raw.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Memos {
    @JsonProperty(value = "Memo")
    private Memo Memo;
}
