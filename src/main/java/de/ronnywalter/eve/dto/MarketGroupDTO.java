package de.ronnywalter.eve.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class MarketGroupDTO{

    private int id;
    private String description;
    private String name;

    private Integer parentId;

    private List<MarketGroupDTO> children;

    private boolean hasTypes;

    private Integer iconId;
    private String icon;

}
