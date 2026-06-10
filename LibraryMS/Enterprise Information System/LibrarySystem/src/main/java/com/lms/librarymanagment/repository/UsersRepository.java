package com.lms.librarymanagment.repository;

import com.lms.librarymanagment.domain.UsersDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersDomain, Long> {
}
