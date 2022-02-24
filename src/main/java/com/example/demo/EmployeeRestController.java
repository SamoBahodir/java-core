package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity create(@RequestBody Employee employee) {
        Employee employee1 = employeeService.save(employee);
        return ResponseEntity.ok(employee1);
    }

    @GetMapping("/employees")
    public ResponseEntity getAll() {
        List<Employee> getAll = employeeService.findAll();
        return ResponseEntity.ok(getAll);
    }

    @GetMapping("/employees/{name}")
    public ResponseEntity findByName(@PathVariable String name) {
        List<Employee> getAll = employeeService.findByName(name);
        return ResponseEntity.ok(getAll);
    }

    @GetMapping("/employee/{name}/{lastName}")
    public ResponseEntity findByNameAndLastName(@PathVariable String name,
                                                @PathVariable String lastName) {
        List<Employee> getAll = employeeService.findByNameAndLastName(name, lastName);
        return ResponseEntity.ok(getAll);
    }

    @GetMapping("/employees1/{name}")
    public ResponseEntity findByNameStartsWith(@PathVariable String name) {
        List<Employee> getAll = employeeService.findByNameStartsWith(name);
        return ResponseEntity.ok(getAll);
    }

    @GetMapping("/employees2/{name}")
    public ResponseEntity findByNameEndingWith(@PathVariable String name) {
        List<Employee> findByNameEndingWith = employeeService.findByNameEndingWith(name);
        return ResponseEntity.ok(findByNameEndingWith);
    }

    @DeleteMapping("/employees2/{id}")
    public ResponseEntity delete1(@PathVariable Long id) {
        employeeService.delete1(id);
        return ResponseEntity.ok(id + " ma'lumot o'chirildi");
    }

    @GetMapping("/{start}/{end}")
    public ResponseEntity between(@PathVariable Long start, @PathVariable Long end) {
        List<Employee> between = employeeService.between(start, end);
        return ResponseEntity.ok(between);
    }
}
