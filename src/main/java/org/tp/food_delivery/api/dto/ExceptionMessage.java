package org.tp.food_delivery.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class ExceptionMessage {

    String errorId;

}
