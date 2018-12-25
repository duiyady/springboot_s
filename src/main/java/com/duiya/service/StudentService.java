package com.duiya.service;

import org.springframework.stereotype.Service;


@Service
public class StudentService {


    public long test(){
        return this.hashCode();
    }
}
