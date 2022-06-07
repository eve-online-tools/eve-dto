package de.ronnywalter.eve.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class CreateEveCharacterDTO {
    private Integer id;
    private String apiToken;
    private String refreshToken;
    private LocalDateTime expiryDate;
}
