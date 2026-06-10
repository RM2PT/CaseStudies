package com.takeout.takeout_system.data.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ModifyItemRequest {
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;
    private Integer stockNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal orderPrice;
}
