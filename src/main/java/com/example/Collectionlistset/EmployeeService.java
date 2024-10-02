package com.example.Collectionlistset;

import com.example.Collectionlistset.Exception.EmployeeAlreadyAddedException;
import com.example.Collectionlistset.Exception.EmployeeNotFoundException;
import com.example.Collectionlistset.Exception.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    //Добавить сотрудника
    public String employeeAdd(String firstName, String lastName) throws EmployeeStorageIsFullException, EmployeeAlreadyAddedException {
        employees.add(new Employee(firstName, lastName));

        for (Employee employee : employees) {
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                System.out.println("Сотрудник " + firstName + " " + lastName + " добавлен");
                throw new EmployeeAlreadyAddedException("Сотрудник " + firstName + " " + lastName + " уже есть в коллекции");
            } else if (employees.size() > 30) {
                throw new EmployeeStorageIsFullException("Превышен лимит сотрудников");
            }
        }
        return firstName + " " + lastName;
    }

    //Удалить сотрудника
    public String employeeRemove(String firstName, String lastName) throws EmployeeNotFoundException {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(firstName) && employees.get(i).getLastName().equals(lastName)) {
                employees.remove(employees.get(i));
                System.out.println("Сотрудник удален");
                return firstName + " " + lastName;
            }
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    //Найти сотрудника
    public String employeeFind(String firstName, String lastName) throws EmployeeNotFoundException {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(firstName) && employees.get(i).getLastName().equals(lastName)) {
                System.out.println(employees.get(i) + " сотрудник найден");
                return firstName + " " + lastName;
            }
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    public String employeeAll(){
        return "Cписок всех сотрудников " + employees;
    }
}
