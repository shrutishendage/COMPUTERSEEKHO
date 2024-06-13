package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.entities.Payment_Info;

public interface Payment_InfoRepository extends JpaRepository<Payment_Info,Integer>{
}