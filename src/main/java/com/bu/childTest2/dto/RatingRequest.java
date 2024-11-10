package com.bu.childTest2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor


@NoArgsConstructor

public class RatingRequest {
    private Integer childId;
    private List<RatingDto> ratings;
}
