package com.takeout.takeout_system.data.dto;

import com.takeout.takeout_system.data.models.Store;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemRequest {
    private String name;
    private BigDecimal price;
    private Integer stockNumber;
    private BigDecimal orderPrice;
    private Store store;
}
