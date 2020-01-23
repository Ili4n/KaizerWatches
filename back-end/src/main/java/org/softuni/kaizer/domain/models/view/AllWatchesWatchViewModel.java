package org.softuni.kaizer.domain.models.view;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class AllWatchesWatchViewModel {

    private String id;
    private String name;
    private BigDecimal price;
}

