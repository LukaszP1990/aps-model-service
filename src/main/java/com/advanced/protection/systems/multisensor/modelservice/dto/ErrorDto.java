package com.advanced.protection.systems.multisensor.modelservice.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@EqualsAndHashCode
public class ErrorDto {

    private String text;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date timeAdded;
}
