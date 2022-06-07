package de.ronnywalter.eve.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CorpDTO {

    private int id;

    private String name;
    private String ticker;
    private int memberCount;

    private int ceoId;
    private String ceoName;

    private String logo;

}
