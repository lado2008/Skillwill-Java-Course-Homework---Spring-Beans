package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.models.AppModel;

import jakarta.annotation.PostConstruct;

@Service
public class AppService {
    private String someMassage;
    private final AppModel testAppModel;

    public AppService(String someMassage, AppModel testAppModel) {
        this.someMassage = someMassage;
        this.testAppModel = testAppModel;
    }

    @PostConstruct
    public void run() {
        System.out.println(someMassage + " " + testAppModel.getName("Lado"));
    }

}
