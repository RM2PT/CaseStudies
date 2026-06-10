package com.example.microknowledgesystemservice.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select user from User user where user.uuid =:uuid")
    User getUserByUuid(@Param("uuid") String uuid);

    @Query("select user from User user where user.userId =:userId and user.password =:password ")
    User getUserByCredentials(@Param("userId") String userId, @Param("password") String password);

    @Query("select user from User user where user.userId =:userId")
    User getUserByUserId(@Param("userId") String userId);

    @Query("select user from User user where user.name =:name")
    List<User> getUserByName(@Param("name") String name);

}
