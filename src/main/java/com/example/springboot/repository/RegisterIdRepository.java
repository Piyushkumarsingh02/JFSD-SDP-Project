package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.RegisterId;

@Repository
public interface RegisterIdRepository extends JpaRepository<RegisterId, Long> {

}
