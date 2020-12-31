package com.example.mystartertest;

import org.example1.VeryBestCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * MyTestService
 *
 * @author "Andrei Prokofiev"
 */

@Service
public class MyTestService {

    @Autowired
    VeryBestCompanyService service;

    @EventListener(ContextRefreshedEvent.class)
    void contextRefreshedEvent() throws SQLException {

        service.getAllDB().forEach(System.out::println);
    }

    public MyTestService() {
    }
}
