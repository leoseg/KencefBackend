package com.example.kencefdataviewer.entities;

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

    private String name;

    private LocalDate birthdate;

    private String godparentName;

    private String address;

    public Child(){};

    public Child(String name, LocalDate birthdate, String adress){
        this.name = name;
        this.birthdate = birthdate;
        this.address = adress;
    }

    public Child(String name, LocalDate birthdate, String adress, String godparentName){
        this.name = name;
        this.birthdate = birthdate;
        this.address = adress;
        this.godparentName = godparentName;
    }


}
