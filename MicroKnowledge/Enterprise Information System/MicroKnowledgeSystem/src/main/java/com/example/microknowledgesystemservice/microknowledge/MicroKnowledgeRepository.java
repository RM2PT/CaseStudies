package com.example.microknowledgesystemservice.microknowledge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MicroKnowledgeRepository extends JpaRepository<MicroKnowledge, Long> {

    @Query("SELECT mk from MicroKnowledge mk where mk.uuid =:uuid")
    MicroKnowledge getMicroKnowledgeByUUid(@Param("uuid") String uuid);

    @Query("SELECT mk from MicroKnowledge mk where mk.containedUser.uuid =:uuid")
    List<MicroKnowledge> getMicroKnowledgeByContainedUser(@Param("uuid") String uuid);

    @Query("SELECT mk from MicroKnowledge mk where mk.keywords =:keywords")
    List<MicroKnowledge> getMicroKnowledgeByKeywords(@Param("keywords") String keywords);


}
