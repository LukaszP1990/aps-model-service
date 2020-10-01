package com.advanced.protection.systems.multisensor.modelservice.domain;

import com.advanced.protection.systems.multisensor.modelservice.constant.SensorType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@EqualsAndHashCode
public class Sensor {

    private Long id;
    private String name;
    private boolean configured;
    private SensorType sensorType;

}
