package com.satyam.springjdbc;

import com.satyam.dao.EmployeeDaoImpl;
import com.satyam.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.satyam")
public class SpringJdbcApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext Con = SpringApplication.run(SpringJdbcApplication.class, args);
        EmployeeDaoImpl dao = Con.getBean(EmployeeDaoImpl.class);


        List<Employee> list = dao.getEmployeeInfo();
        for (Employee e : list) {
            System.out.println(e);

        }
    }

}
