package de.ronnywalter.eve.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TypeDTO {

    private Integer id;

    private String name;
    private double volume;
    private double packagedVolume;
    private double capacity;

    private String description;
    private Integer graphicId;
    private Integer iconId;

    private Integer marketGroupId;
    private String marketGroup;
    private double mass;
    private int portionSize;
    private boolean published;
    private double radius;

    private int groupId;
    private int categoryId;

}
