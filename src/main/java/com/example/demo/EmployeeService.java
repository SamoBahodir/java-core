package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmoloyeeRepository emoloyeeRepository;

    public EmployeeService(EmoloyeeRepository emoloyeeRepository) {
        this.emoloyeeRepository = emoloyeeRepository;
    }
    public Employee save(Employee employee) {
        return emoloyeeRepository.save(employee);
    }
    public List<Employee> findAll() {
        return emoloyeeRepository.findAll();
    }
    public Employee findById(Long id){
        return emoloyeeRepository.findById(id).get();
    }
    public List<Employee> findByName(String name){
        return emoloyeeRepository.findByName(name);
    }
    public List<Employee> findByNameAndLastName(String name,String lastName){
        return emoloyeeRepository.findByNameAndLastName(name, lastName);
    }
}
