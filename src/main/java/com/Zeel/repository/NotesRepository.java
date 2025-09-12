package com.Zeel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Zeel.entity.NotesEntity;

@Repository

public interface NotesRepository extends JpaRepository<NotesEntity, Integer> {

}
