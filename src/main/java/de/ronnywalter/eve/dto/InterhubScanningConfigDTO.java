package de.ronnywalter.eve.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class InterhubScanningConfigDTO {

//List<Type> types, Location from, Location to, int daysVolume, double minMargin, int minVolumeBuyRegion, int minVolumeSellRegion, int ordersModifyDays, int maxModifiedOrders

        private String name;

        private long fromLocationId;
        private long toLocationId;

        private int daysVolume;

        private double minMargin;

        private int minVolumeBuyRegion;
        private int minVolumeSellRegion;

        private int daysModifiedOrders;

        private int maxModifiedOrdersWithinDays;

}
