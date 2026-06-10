package com.example.dlmodelsystemservice.model;

import org.bouncycastle.math.raw.Mod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {

    @Query("select model from Model model where model.keyword like :keyword")
    List<Model> getModelsByKeyword(@Param("keyword") String keyword);

    @Query("select model from Model model where model.uuid like :uuid")
    Model getModelsId(@Param("uuid") String uuid);

}
