package com.example.kencefdataviewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;


@SpringBootApplication
public class KencefDataViewerApplication implements RepositoryRestConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(KencefDataViewerApplication.class, args);
    }

}
