package com.example.demo.repository;

import com.example.demo.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository<Member, Long> {
}
