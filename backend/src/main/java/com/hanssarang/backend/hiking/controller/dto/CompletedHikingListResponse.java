package com.hanssarang.backend.hiking.controller.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CompletedHikingListResponse {

    private String mountainName;
    private LocalDate lastHikingDate;
    private String lastHikingTrailName;
    private double x;
    private double y;
}
