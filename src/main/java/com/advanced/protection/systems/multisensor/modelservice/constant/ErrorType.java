package com.advanced.protection.systems.multisensor.modelservice.constant;

import lombok.Getter;

public enum ErrorType {

    NOT_FOUND_DATA_ERROR("Data not found by params"),
    NOT_FOUND_ERROR("Error not found by params"),
    NOT_FOUND_POSITION_DATA_ERROR("PositionData not found by params"),
    NULL_FIELD_POSITION_DATA_ERROR("Error while saving because not all positionData field has been set"),
    SENSOR_TYPE_POSITION_DATA_ERROR("Error while saving because sensor has wrong type to save positionData"),
    SENSOR_UNIQUE_NAME_ERROR("Error while saving because sensor name in not unique"),
    NOT_FOUND_POSITION_ERRORS("Position errors not found by params"),
    NOT_FOUND_RF_DATA_ERROR("RfData not found by params"),
    NULL_FIELD_RF_DATA_ERROR("Error while saving because not all RfData field has been set"),
    SENSOR_TYPE_RF_DATA_ERROR("Error while saving because sensor has wrong type to save rfData"),
    NOT_FOUND_RF_ERRORS("Rf errors not found by params"),
    DATA_SAVE_ERROR("Error while saving data");

    @Getter
    private final String text;

    ErrorType(String text) {
        this.text = text;
    }
}
