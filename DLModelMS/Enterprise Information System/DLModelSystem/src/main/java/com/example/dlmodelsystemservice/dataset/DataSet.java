package com.example.dlmodelsystemservice.dataset;

import com.example.dlmodelsystemservice.model.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor @Getter @Setter @AllArgsConstructor
public class DataSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String uuid;

    @JsonIgnore
    @UpdateTimestamp
    private LocalDate lastUpdatedAt;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "dsmodel_id")
    @JsonIgnore
    private Model model;
}
