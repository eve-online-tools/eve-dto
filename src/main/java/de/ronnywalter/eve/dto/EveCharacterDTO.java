package de.ronnywalter.eve.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EveCharacterDTO {

    private Integer id;
    private String name;

    private Integer allianceId;
    private Integer corporationId;
    private String corporationName;
    private String corporationTicker;
    private String corpLogo;

    private Float securityStatus;

    private String portrait64;
    private String portrait128;
    private String portrait256;
    private String portrait512;

    private String solarSystemName;
    private String locationName;

}
