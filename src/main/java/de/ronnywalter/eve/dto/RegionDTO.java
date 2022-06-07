package de.ronnywalter.eve.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegionDTO {
    private Integer id;
    private String name;
    private String description;
}
