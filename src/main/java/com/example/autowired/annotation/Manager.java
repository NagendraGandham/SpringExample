package com.example.autowired.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Manager {
    private Employee employee;

    @Autowired

    public Manager(@Qualifier("employee") Employee employee) {//qualifier is used if there are beans with multiple employee types
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
