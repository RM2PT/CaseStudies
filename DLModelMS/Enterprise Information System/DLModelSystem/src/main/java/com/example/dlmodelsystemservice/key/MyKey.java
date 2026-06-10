package com.example.dlmodelsystemservice.key;

import com.example.dlmodelsystemservice.runningmodel.RunningModel;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
public class MyKey {    //Name change due to keyword of 'key' in mysql
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String uuid;
    private boolean isValid;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "myKey")
    @JoinColumn(name = "belong_runningmodel_id")
    private RunningModel belongedRunningModel;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "key_runningmodel_id")
    private RunningModel keyRunningModel;

}
