package com.example.dlmodelsystemservice.runningmodel;


import com.example.dlmodelsystemservice.key.MyKey;
import com.example.dlmodelsystemservice.model.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor

@Entity
public class RunningModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;
    private String assignedResource;
    private String api;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "keyRunningModel")
    private Set<MyKey> containedKey;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "runningModel")
    @JsonIgnore
    private Model belongedModel;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private MyKey myKey;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id")
    @JsonIgnore
    private Model model;
}
