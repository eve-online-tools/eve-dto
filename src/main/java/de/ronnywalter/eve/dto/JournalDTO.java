package de.ronnywalter.eve.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JournalDTO {

    private long id;

    private double amount;
    private double balance;
    private Long contextId;
    private String contextType;
    private LocalDateTime date;
    private String description;
    private int party1;
    private String party1Name;
    private String reason;
    private String refType;
    private int party2;
    private String party2Name;

    private Double tax;
    private Integer tax_receiver_id;

    private Integer characterId;
    private String characterName;
    private Integer corpId;
    private String corpName;
    private String corpTicker;
    private Integer division;
}
