package org.example.Hw_employeecontroller;
/*todo Через контроллер EmployeeController (см. код в репозитории) реализовать:
       1.REST запрос на вывод списка всех Employee, чье имя начинается на определенные буквы.
       2.REST запрос на вывод общего количества сотрудников.
       3.REST запрос на заполнение всех пустых полей surname у списка Employee значением "Not provided".
       4.REST запрос на удаление из списка Employee всех сотрудников, у которых age < 18.
          Проверить работу запросов через Postman.*/

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/controllerEmployee")

public class EmployeeControler{

	private final List<Employee> employeeList = new ArrayList<>();


	public EmployeeControler() {
		employeeList.addAll(Arrays.asList(
				new Employee("Liam"),
				new Employee("Oliver"),
				new Employee("William"),
				new Employee("James"),
				new Employee("Lucas")));

	}

	@GetMapping("/find_letter")
	public List<Employee> findEmplByLetter(@RequestParam char letter){
       List<Employee> filtredEmpl = new ArrayList<>();
	   for(Employee e : employeeList){
		   if(e.getName().charAt(0) == letter){
			   filtredEmpl.add(e);
		   }
	   }
	   return filtredEmpl;
	}

	@GetMapping
	public List<Employee> getEmployeeListCount() {
		return employeeList;
	}

 @PutMapping(value = "/surnameEmployee")
	public void emtySurnames(@RequestParam String surname){
		for(Employee e : employeeList){
			if(e.getSurname()==null||e.getSurname().isEmpty()){
				e.setSurname("Not provided");
			}
		}
	}
	@DeleteMapping(value = "{id}")
	public void deletEmloyee(@PathVariable String id) {
		Employee employeeFromList = employeeList.stream()
				.filter(e -> id.equals(e.getId())).findAny().get();
	employeeList.remove(employeeFromList);

	}
}
