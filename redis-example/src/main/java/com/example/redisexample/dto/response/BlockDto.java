package com.example.redisexample.dto.response;

import com.example.redisexample.dto.response.raw.block.Ledger;
import com.example.redisexample.dto.response.raw.block.State;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlockDto {
    @JsonProperty(value = "ledger")
    private Ledger ledger;
    @JsonProperty(value = "ledger_hash")
    private String ledger_hash;
    @JsonProperty(value = "ledger_index")
    private String ledger_index;
    @JsonProperty(value = "marker")
    private String marker;
    @JsonProperty(value = "state")
    private List<State> state;
    @JsonProperty(value = "status")
    private String status;
    @JsonProperty(value = "validated")
    private Boolean validated;
}
