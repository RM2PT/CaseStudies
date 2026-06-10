package com.example.dlmodelsystemservice.dataset;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSetRepository extends JpaRepository<DataSet, Long> {

    @Query("select ds from DataSet ds where ds.uuid =:uuid")
    DataSet getDsByUuid(@Param("uuid") String uuid);

}
