package de.ronnywalter.eve.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionDTO {

    private long transactionId;

    private double unitPrice;
    private int quantity;

    private long clientId;
    private String clientName;
    private LocalDateTime date;

    private boolean buy;
    private boolean personal;

    private long journalRefId;
    private long locationId;

    private int typeId;
    private String type;

    private Integer characterId;
    private String characterName;
    private Integer corpId;
    private String corpName;
    public String corpTicker;
    private Integer division;
}
