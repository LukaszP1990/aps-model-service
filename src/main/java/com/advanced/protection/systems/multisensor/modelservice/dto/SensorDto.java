package com.advanced.protection.systems.multisensor.modelservice.dto;

import com.advanced.protection.systems.multisensor.modelservice.constant.SensorType;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@EqualsAndHashCode
public class SensorDto {

    private String name;
    private boolean configured;
    private SensorType sensorType;
}
