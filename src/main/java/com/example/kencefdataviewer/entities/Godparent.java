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
    List<Child> childs;

    /**
     * Sets list of childs and sets their id to godparent which adds the childs
     * @param childs list of childs
     */
    public void setGodchilds(List<Child> childs) {
        for(Child child :childs){
            child.setGodparent(this);
        }
        this.childs = childs;
    }
}
