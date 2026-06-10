package com.takeout.takeout_system.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FindStoreResponse {
    private Long id;
    private String name;
    private String address;
    private boolean isOpened;
}
