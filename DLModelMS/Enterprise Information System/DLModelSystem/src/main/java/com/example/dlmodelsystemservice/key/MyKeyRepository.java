package com.example.dlmodelsystemservice.key;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MyKeyRepository extends JpaRepository<MyKey, Long> {

    @Query("select myKey from MyKey myKey where myKey.uuid =:uuid")
    MyKey getKeyByUuid(@Param("uuid") String uuid);

}
