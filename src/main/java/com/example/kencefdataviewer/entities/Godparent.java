package com.example.kencefdataviewer.entities;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="godparent")
public class Godparent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    Long id;

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    String email;

    @Getter
    @Setter
    String amount_to_pay;

    @Getter
    @Setter
    LocalDate paydate;

    @Getter
    @OneToMany(mappedBy = "godparent", cascade = {CascadeType.MERGE})
    List<Child> godchilds;

    public void setGodchilds(List<Child> godchilds) {
        for(Child child :godchilds){
            child.setGodparent(this);
        }
        this.godchilds = godchilds;
    }
}
