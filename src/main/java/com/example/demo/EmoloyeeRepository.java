package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmoloyeeRepository extends JpaRepository<Employee,Long> {

    List<Employee> findByName(String name);


}
