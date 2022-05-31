package com.example.kencefdataviewer.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "child")
public class Child {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private LocalDate birthdate;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name= "godparent_id", referencedColumnName = "id")
    private Godparent godparent;

    @Getter
    @Setter
    private String address;

    public Child(){}

}
