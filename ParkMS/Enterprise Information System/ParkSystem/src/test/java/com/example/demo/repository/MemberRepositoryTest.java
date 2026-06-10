package com.example.demo.repository;

import com.example.demo.model.Member;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataMongoTest
public class MemberRepositoryTest {


    @Autowired
    private MemberRepository memberRepository;


    @Before
    public void setUp(){

        Member member = Member.builder().id(1L).name("test").build();

        memberRepository.save(member);
    }

    @Test
    public void findById() {
        Optional<Member> result = memberRepository.findById(1L);

        assertThat(result.isPresent()).isEqualTo(true);
    }

}
