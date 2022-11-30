package com.example.redisexample.dto.response;

import com.example.redisexample.dto.response.raw.transaction.Amount;
import com.example.redisexample.dto.response.raw.transaction.Memos;
import com.example.redisexample.dto.response.raw.transaction.Meta;
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
public class TransactionDto {
    @JsonProperty(value = "Account")
    private String Account;
    @JsonProperty(value = "Amount")
    private Amount Amount;
    @JsonProperty(value = "Expiration")
    private Double Expiration;
    @JsonProperty(value = "Fee")
    private String Fee;
    @JsonProperty(value = "Destination")
    private String Destination;
    @JsonProperty(value = "Flags")
    private Double Flags;
    @JsonProperty(value = "LastLedgerSequence")
    private Integer LastLedgerSequence;
    @JsonProperty(value = "Memos")
    private List<Memos> Memos;
    @JsonProperty(value = "Paths")
    private Object Paths;
    @JsonProperty(value = "OfferSequence")
    private Integer OfferSequence;
    @JsonProperty(value = "SendMax")
    private String SendMax;
    @JsonProperty(value = "Sequence")
    private Integer Sequence;
    @JsonProperty(value = "SigningPubKey")
    private String SigningPubKey;
    @JsonProperty(value = "TakerGets")
    private Object TakerGets;
    @JsonProperty(value = "TakerPays")
    private Object TakerPays;
    @JsonProperty(value = "TransactionType")
    private String TransactionType;
    @JsonProperty(value = "TxnSignature")
    private String TxnSignature;
    @JsonProperty(value = "date")
    private Integer date;
    @JsonProperty(value = "hash")
    private String hash;
    @JsonProperty(value = "inLedger")
    private Integer inLedger;
    @JsonProperty(value = "ledger_index")
    private Integer ledger_index;
    @JsonProperty(value = "meta")
    private Meta meta;
    @JsonProperty(value = "status")
    private String status;
    @JsonProperty(value = "validated")
    private Boolean validated;
}
