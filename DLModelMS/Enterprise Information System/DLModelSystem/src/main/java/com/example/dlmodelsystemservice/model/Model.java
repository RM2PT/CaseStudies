package com.example.dlmodelsystemservice.model;

import com.example.dlmodelsystemservice.attachment.Attachment;
import com.example.dlmodelsystemservice.dataset.DataSet;
import com.example.dlmodelsystemservice.runningmodel.RunningModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor

public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String version;
    private String description;
    private String keyword;
    private String uuid;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "model")
    private Set<RunningModel> containedRunningModel;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "model")
    private Set<DataSet> containedDataSet;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "model")
    private Attachment modelToAttachment;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "runningmodel_id")
    private RunningModel runningModel;


}
