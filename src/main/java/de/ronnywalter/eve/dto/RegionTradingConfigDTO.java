package de.ronnywalter.eve.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegionTradingConfigDTO {

        private String name;

        private int buyRegionId;
        private int sellRegionId;

        private double minMargin;

        private int minVolumeBuyRegion;
        private int minVolumeSellRegion;

        private int daysModifiedOrders;

        private int maxModifiedOrdersWithinDays;

}
