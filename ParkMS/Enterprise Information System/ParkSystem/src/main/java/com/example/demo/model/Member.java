package com.example.demo.model;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection="Members")
@Builder
public class Member {
    @Id
    private Long id;

    private String name;
    private Double balance;

    @DBRef
    private List<Vehicle> owningVehicles;
}
