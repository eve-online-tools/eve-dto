package de.ronnywalter.eve.dto;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
public class ApiTokenDTO {
    private String apiToken;
    private ZonedDateTime expiryDate;
}
