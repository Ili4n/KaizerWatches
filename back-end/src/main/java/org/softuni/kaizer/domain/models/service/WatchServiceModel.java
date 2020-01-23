package org.softuni.kaizer.domain.models.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class WatchServiceModel {
    private String id;

    private String name;

    private String image;

    private BigDecimal price;

    private String description;

    private long views;
}
