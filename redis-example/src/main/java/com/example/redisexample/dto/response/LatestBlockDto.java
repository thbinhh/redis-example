package com.example.redisexample.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LatestBlockDto {
    @JsonProperty(value = "ledger_current_index")
    private Long latestHeight;
    @JsonProperty(value = "status")
    private String status;
}
