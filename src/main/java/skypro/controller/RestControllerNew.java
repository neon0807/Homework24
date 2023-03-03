package skypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import skypro.entity.Employee;
import skypro.srvice.EmployeeService;

import java.util.List;
@Controller
@RequestMapping("skypro")
public class RestControllerNew {
    private EmployeeService employeeService;

    public RestControllerNew(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getPersonById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }
}
