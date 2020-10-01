package com.advanced.protection.systems.multisensor.modelservice.constant;

import lombok.Getter;

public enum SensorType {

	RF("R"),
	POSITION("P");

	@Getter
	private final String shortName;

	SensorType(String shortName) {
		this.shortName = shortName;
	}

}

