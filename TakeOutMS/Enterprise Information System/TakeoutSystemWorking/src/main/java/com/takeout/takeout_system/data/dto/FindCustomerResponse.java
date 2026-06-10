package com.takeout.takeout_system.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FindCustomerResponse {
    private Long id;
    private String name;
    private String address;
}
