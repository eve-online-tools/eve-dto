package de.ronnywalter.eve.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MyOrderDTO {

    private long id;

    private int duration;
    private String durationAsString;

    private boolean isBuyOrder;
    private LocalDateTime issuedDate;

    private int minVolume;
    private double price;
    private int volumeTotal;
    private int volumeRemain;

    private String range;

    private int typeId;
    private String type;

    private long locationId;
    private String location;

    private int characterId;
    private String characterName;
    private Integer corpId;
    private String corpName;
    private String corpTicker;
    private Integer wallet_division;
    private Double escrow;
    private boolean corpOrder;
    private String state;


}
