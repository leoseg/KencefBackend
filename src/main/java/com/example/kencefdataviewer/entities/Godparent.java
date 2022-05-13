package com.example.kencefdataviewer.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="godparent")
public class Godparent {

    @Id
    @GeneratedValue
    Long id;

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    String email;

    @Getter
    @Setter
    float donationAmount;

    @Getter
    @Setter
    LocalDate dueDate;
}
