package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmoloyeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<Employee> findByNameAndLastName(String name, String lastName);

    List<Employee> findByNameStartsWith(String name);

    List<Employee> findByNameEndingWith(String name);

    @Query(value = "select * from clen_code where lastName between S and B", nativeQuery = true)
    List<Employee> findByLastNameBetween(String lastName);

    @Query(value = "select * from clen_code where id between ?1 and ?2", nativeQuery = true)
    List<Employee> findByIdBetween(Long start, Long end);
}
