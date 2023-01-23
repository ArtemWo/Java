package HW_Java.HW23_1_23;

import KW_Java.KW23_1_23.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
/*todo
    Создать класс Emploee
    Сгрупировать сотрудников по должности
    Вычислить среднюю зарплату всех сотрудников
    Получить список сотрудников с зп > 10 000
    Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
    Получить сотрудника с самой низкой зп
    Получите сотрудников из всех отделов с максимальной зп*/

        Employee e1 = new Employee("Olga", "finance", "accountant", 12_000);
        Employee e2 = new Employee("Petr", "security ", "security", 7_000);
        Employee e3 = new Employee("Sofia", "marketing", "manager", 9_000);
        Employee e4 = new Employee("Jack", "it", "programmer", 11_000);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        //1.  Сгрупировать сотрудников по должности
        Map<String, List<Employee>> res1 = employees.stream().collect(Collectors.groupingBy(Employee::getPosition));
        System.out.println(" //1.  Сгрупировать сотрудников по должности  " + res1);

        //2. Вычислить среднюю зарплату всех сотрудников
        OptionalDouble res2 = employees.stream().mapToDouble(Employee::getSalary).average();
        System.out.println(" //2. Вычислить среднюю зарплату всех сотрудников  " + res2);

        //3. Получить список сотрудников с зп > 10 000
        List<Employee> res3 = employees.stream().filter(x -> x.getSalary() > 10_000).collect(Collectors.toList());
        System.out.println("  //3. Получить список сотрудников с зп > 10 000  " + "\n" + res3);


        //4. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
        List<Employee> res4 = employees.stream().filter(x -> x.getDepartment().equals("marketing"))
                .peek(x -> x.setSalary(x.getSalary() * 15 / 100)).collect(Collectors.toList());
        System.out.println(" //4. Получить список сотрудников из отдела маркетинг и увеличить зп на 15% " + "\n" + res4);

        //5. Получить сотрудника с самой низкой зп
        Optional<Employee> res5 = employees.stream().sorted(((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))).findFirst();
        System.out.println("Получить сотрудника с самой низкой зп " + "\n" + res5);

        //6.Получите сотрудников из всех отделов с максимальной зп
        Optional<Employee> res6 = employees.stream().sorted(((o1, o2) -> (int) (o1.getSalary() + o2.getSalary()))).findFirst();
        System.out.println("Получите сотрудников из всех отделов с максимальной зп " + "\n" + res6);
    }
}