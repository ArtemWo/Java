package org.example.HW05;

import com.telran.employeeweb.model.entity.Employee;
import com.telran.employeeweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    @Value("${employeeNotPresentMessage}")
    private String employeeNotPresentMessage;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public String getEmployees(Model model){
        List<Employee> employees = service.getEmployees();
        model.addAttribute("employees", employees);
        return "employees";
    }

    @GetMapping("/find")
    public String findEmployee(@RequestParam(required = false) String id,
                               @RequestParam(required = false) String name,
                               Model model){
        Optional<Employee> employeeByIdAndName = service.findEmployeeByIdAndName(id, name);
        if (employeeByIdAndName.isPresent()) {
            model.addAttribute("employeeToFind", employeeByIdAndName.get());
        } else {
            model.addAttribute("notPresentMessage", employeeNotPresentMessage);
        }
        return "findPage";
    }

    @PostMapping
    public String addEmployee(@ModelAttribute Employee employeeToAdd, RedirectAttributes attributes) {
        service.add(employeeToAdd);
        attributes.addFlashAttribute("added", employeeToAdd.getId());
        return "redirect:/employees";
    }

    @PostMapping(value = "/delete")
    public String deleteEmployee(@RequestParam String employeeId, RedirectAttributes attributes){
        System.out.println("Delete " + employeeId);
        service.deleteEmployee(employeeId);
        attributes.addFlashAttribute("deleted", employeeId);
        return "redirect:/employees";
    }

    @ModelAttribute("employeeToAdd")
    public Employee getEmployee(){
        return new Employee();
    }

}
