package org.softuni.kaizer.domain.models.view;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class TopWatchesWatchViewModel {

    private String id;
    private String name;
    private String image;
    private BigDecimal price;
}
