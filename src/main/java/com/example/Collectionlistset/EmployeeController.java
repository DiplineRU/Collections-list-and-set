package com.example.Collectionlistset;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
//server.port = 8090 (application.properties)
public class EmployeeController {
    public final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String employeeAdd(@RequestParam(value = "firstName") String firstname,
                              @RequestParam(value = "lastName") String lastname) {
        return employeeService.employeeAdd(firstname, lastname);
    }

    @GetMapping("/remove")

    public String employeeRemove(@RequestParam(value = "firstName") String firstname,
                                 @RequestParam(value = "lastName") String lastname) {
        return employeeService.employeeRemove(firstname, lastname);
    }

    @GetMapping("/find")
    public String employeeFind(@RequestParam(value = "firstName") String firstname,
                               @RequestParam(value = "lastName") String lastname) {
        return employeeService.employeeFind(firstname, lastname);
    }

    @GetMapping("/all")
    public String employeeAll() {
        return employeeService.employeeAll();
    }
}
