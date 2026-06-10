package com.example.demo.service;

import com.example.demo.model.Member;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class ParkMSSystem {

    private Member currentMember;

    @Autowired
    public ParkMSSystem() {
        this.currentMember = null;
    }
}
