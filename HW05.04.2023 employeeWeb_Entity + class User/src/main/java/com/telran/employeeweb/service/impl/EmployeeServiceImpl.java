package org.example.HW05;

import com.telran.employeeweb.model.entity.Employee;
import com.telran.employeeweb.repository.EmployeeRepository;
import com.telran.employeeweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> getEmployees() {
        return repository.getAll();
    }

    @Override
    public Optional<Employee> findEmployeeByIdAndName(String id, String name) {
        List<Employee> employees = repository.getAll();
        Optional<Employee> found = employees.stream().filter(employee -> {
            if (id != null) {
                if (name != null) {
                    return employee.getId().equals(id) && employee.getName().equals(name);
                } else {
                    return employee.getId().equals(id);
                }
            }
            return employee.getName().equals(name);
        }).findAny();
        return found;
    }

    @Override
    public void add(Employee employee) {
        repository.add(employee);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        List<Employee> employees = repository.getAll();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(employee.getId())){
                repository.updateById(employee);
                return true;
            }
        }
        repository.add(employee);
        return false;
    }

    @Override
    public Employee updateEmployeeSurnameAndAge(String id, String surname, int age) {
        Employee employee = repository.getById(id);
        if (employee != null) {
            employee.setSurname(surname);
            employee.setAge(age);
        }
        return employee;
    }

    @Override
    public void deleteEmployee(String id) {
        repository.deleteEmployee(id);
    }
}
