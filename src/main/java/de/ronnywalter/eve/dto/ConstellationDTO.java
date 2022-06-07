package de.ronnywalter.eve.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConstellationDTO {
    private Integer id;
    private int regionId;
    private String name;
}
