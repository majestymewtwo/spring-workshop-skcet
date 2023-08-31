package com.example.springworkshopskcet;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MainController {
    private final EmployeeRepo repo;
    @GetMapping("/allEmployees")
    public List<Employee> getEmployees(){
        return repo.findAll();
    }
    @PostMapping("/newEmployee")
    public Employee newEmployee(@RequestBody Employee newEmployee){
        return repo.save(newEmployee);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        repo.deleteById(id);
        return "Deleted Employee";
    }
    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return repo.save(employee);
    }
}
