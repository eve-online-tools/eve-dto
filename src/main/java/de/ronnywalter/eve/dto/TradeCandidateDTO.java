package de.ronnywalter.eve.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TradeCandidateDTO {

    private TypeDTO type;

    private double currentSellPrice;
    private double currentBuyPrice;
    private double currentProfitPct;
    private double currentProfitPerItem;
    private double maxBuyPrice;
    private int possibleVolume;
    private double averageBuyPrice;
    private double averageSellPrice;
    private double averageProfit;
    private double averageProfitPct;
    private double averageProfitPerItem;
    private double averageProfitAtCurrentSellPrices;
    private double averageProfitPctAtCurrentSellPrices;
    private int modifiedOrdersInSellRegion;
    private double averageVolumeSellRegion;
    private double cargo;


}
