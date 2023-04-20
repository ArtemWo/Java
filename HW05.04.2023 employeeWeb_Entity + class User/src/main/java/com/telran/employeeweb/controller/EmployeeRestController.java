package org.example.HW05;

import com.telran.employeeweb.model.entity.Employee;
import com.telran.employeeweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employeesRest")
public class EmployeeRestController {

    private final EmployeeService service;

    @Autowired
    public EmployeeRestController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return service.getEmployees();
    }

    @GetMapping(value = "/find")
    public Optional<Employee>findEmployee(@RequestParam(required = false) String id,
                                          @RequestParam(required = false) String name){
        return service.findEmployeeByIdAndName(id, name);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        service.add(employee);
        return employee;
    }

    @PutMapping
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        boolean isUpdated = service.updateEmployee(employee);
        if (isUpdated){
            return new ResponseEntity<>(employee, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(employee, HttpStatus.CREATED);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Employee> updateEmployeeSurnameAndAge(@PathVariable String id,
                                                                @RequestParam String surname,
                                                                @RequestParam int age){
        Employee employee = service.updateEmployeeSurnameAndAge(id, surname, age);
        if (employee != null) {
            return new ResponseEntity<>(employee, HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/{id}")
    public void deleteEmployee(@PathVariable String id){
        System.out.println("Deleting:" + id);
        service.deleteEmployee(id);
    }
}
