package de.ronnywalter.eve.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MarketOrderUpdateRequestDTO {
    private Integer regionId;
    private Integer typeId;
}
