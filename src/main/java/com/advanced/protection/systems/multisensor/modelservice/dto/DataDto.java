package com.advanced.protection.systems.multisensor.modelservice.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.advanced.protection.systems.multisensor.modelservice.constant.DataType;

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
public class DataDto {

	private Long targetId;
	private DataType dataType;
	private double rssi;
	private Double altitude;
	private double middleFrequency;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date timeAdded;
	private SensorDto sensorDto;
	private String clientIpAddress;
	private double lat;
	private double lon;
}
