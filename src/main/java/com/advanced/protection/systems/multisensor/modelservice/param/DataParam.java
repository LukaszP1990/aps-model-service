package com.advanced.protection.systems.multisensor.modelservice.param;

import java.beans.ConstructorProperties;
import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@ToString
public class DataParam {

    private final double lon;
    private final double lat;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private final Date timeAddedFrom;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private final Date timeAddedTo;
    private final double rssi;
    private final String sensorName;

    @Builder
    @ConstructorProperties({"lon", "lat", "timeAddedFrom", "timeAddedTo", "rssi", "sensorName"})
    public DataParam(double lon,
                     double lat,
                     Date timeAddedFrom,
                     Date timeAddedTo,
                     double rssi,
                     String sensorName) {
        this.lon = lon;
        this.lat = lat;
        this.timeAddedFrom = timeAddedFrom;
        this.timeAddedTo = timeAddedTo;
        this.rssi = rssi;
        this.sensorName = sensorName;
    }
}