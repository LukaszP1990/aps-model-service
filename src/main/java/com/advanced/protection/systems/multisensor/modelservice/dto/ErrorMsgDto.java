package com.advanced.protection.systems.multisensor.modelservice.dto;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@EqualsAndHashCode
public class ErrorMsgDto {

    private String text;
}
