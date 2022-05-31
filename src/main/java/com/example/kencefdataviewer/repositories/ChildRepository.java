package com.example.kencefdataviewer.repositories;


import com.example.kencefdataviewer.entities.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChildRepository  extends JpaRepository<Child,Long> {

    List<Child> findByGodparentIsNull();
}
