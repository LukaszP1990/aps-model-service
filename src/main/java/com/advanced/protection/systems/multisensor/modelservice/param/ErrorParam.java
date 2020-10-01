package com.advanced.protection.systems.multisensor.modelservice.param;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.beans.ConstructorProperties;
import java.util.Date;

@Getter
@ToString
public class ErrorParam {

    private final String type;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private final Date timeAddedFrom;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private final Date timeAddedTo;

    @Builder
    @ConstructorProperties({"type", "timeAddedFrom", "timeAddedTo"})
    public ErrorParam(String type,
                      Date timeAddedFrom,
                      Date timeAddedTo) {
        this.type = type;
        this.timeAddedFrom = timeAddedFrom;
        this.timeAddedTo = timeAddedTo;
    }
}
