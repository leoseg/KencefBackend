package com.example.kencefdataviewer.repositories;

import com.example.kencefdataviewer.entities.Godparent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GodparentRepository extends JpaRepository<Godparent,Long> {
}
