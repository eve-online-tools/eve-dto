package de.ronnywalter.eve.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarketDataDTO {

    //private List<MarketOrderDTO> buyOrders;
    //private List<MarketOrderDTO> sellOrders;

    private long buyOrderCount;
    private long buyVolumeRemain;

    private long sellOrderCount;
    private long sellVolumeRemain;

    private double sellPrice;
    private double buyPrice;

    private double averageVolume5d;
    private double averagePrice5d;

    private double averageVolume20d;
    private double averagePrice20d;


    private int numberOfSellOrderUpdates;
    private int numberOfBuyOrderUpdates;

}
