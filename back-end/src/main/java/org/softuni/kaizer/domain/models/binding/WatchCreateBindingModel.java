package org.softuni.kaizer.domain.models.binding;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class WatchCreateBindingModel {

    private String name;
    private String image;
    private BigDecimal price;
    private String description;
}
