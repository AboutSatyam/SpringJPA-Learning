package com.satyam.springdatajdbc;

import com.satyam.springdatajdbc.dao.EmpolyeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcRunner implements CommandLineRunner {
    @Autowired
    private EmpolyeeDao dao;

    @Override
    public void run(String... args) throws Exception {
        dao.input(new Empolyee(2, "Virat", "Delhi"));
    }
}
