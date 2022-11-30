package com.example.redisexample.dto.response.raw.block;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Ledger {
    @JsonProperty(value = "accepted")
    private Boolean accepted;
    @JsonProperty(value = "account_hash")
    private String account_hash;
    @JsonProperty(value = "close_flags")
    private String close_flags;
    @JsonProperty(value = "close_time")
    private Double close_time;
//    @JsonProperty(value = "close_time_human")
//    private Date close_time_human;
    @JsonProperty(value = "close_time_resolution")
    private Double close_time_resolution;
    @JsonProperty(value = "closed")
    private Boolean closed;
    @JsonProperty(value = "hash")
    private String hash;
    @JsonProperty(value = "ledger_hash")
    private String ledger_hash;
    @JsonProperty(value = "ledger_index")
    private String ledger_index;
    @JsonProperty(value = "parent_close_time")
    private Double parent_close_time;
    @JsonProperty(value = "parent_hash")
    private String parent_hash;
    @JsonProperty(value = "seqNum")
    private String seqNum;
    @JsonProperty(value = "totalCoins")
    private String totalCoins;
    @JsonProperty(value = "total_coins")
    private String total_coins;
    @JsonProperty(value = "transaction_hash")
    private String transaction_hash;
}
