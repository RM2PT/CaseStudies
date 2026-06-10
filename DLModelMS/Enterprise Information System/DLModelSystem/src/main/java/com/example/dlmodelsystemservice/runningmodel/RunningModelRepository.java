package com.example.dlmodelsystemservice.runningmodel;


import com.example.dlmodelsystemservice.dataset.DataSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RunningModelRepository extends JpaRepository<RunningModel, Long> {

    @Query("select rm from RunningModel rm where rm.uuid =:uuid")
    RunningModel getRunningModelByUuid(@Param("uuid") String uuid);
}
