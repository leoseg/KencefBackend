package com.example.kencefdataviewer.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name= "child")
public class Child {

    @Id
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private LocalDate birthdate;

    @Getter
    @Setter
    private String godparentName;

    @Getter
    @Setter
    private String address;

    public Child(){};


//    public Child(String name,LocalDate birthdate, String address){
//        this.name = name;
//        this.birthdate = birthdate;
//        this.address = address;
//    }


//    public Child(String name,LocalDate birthdate, String address, String godparentName){
//        this.name = name;
//        this.birthdate = birthdate;
//        this.address = address;
//        this.godparentName = godparentName;
//    }


}
