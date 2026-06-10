package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="Vehicles")
@Builder
public class Vehicle {

    @Id
    private Long id;


    private String plateNumber;
    private Type type;

    @DBRef
    private Member ownedMember;
}
