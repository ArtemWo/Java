package org.example.HW05;

import com.telran.employeeweb.model.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeRepository() {
        employees.addAll(Arrays.asList(
                new Employee("Tom"),
                new Employee("Jane"),
                new Employee("Mary"),
                new Employee("Mark")
        ));
    }

    public List<Employee> getAll(){
        return employees;
    }

    public Employee getById(String id) {
        return employees.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(String id) {
        employees.removeIf(employee -> employee.getId().equals(id));
    }

    public void updateById(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(employee.getId())){
                employees.set(i, employee);
            }
        }
    }
}
