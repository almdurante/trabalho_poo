package Controller;

import Model.Application;
import Model.Employee;
import Repository.EmployeeRepository;
import View.Views;

import java.util.List;

public class ListEmployeesController {

    private final EmployeeRepository employeeRepository;
    private final Views views;

    public ListEmployeesController(EmployeeRepository employeeRepository, Views views) {
        this.employeeRepository = employeeRepository;
        this.views = views;
    }

    public void listAll()
    {
        List<Employee> employees = employeeRepository.findAll();
        if(employees.isEmpty())
        {
            views.listEmployeesView.showNoEmployees();
            return;
        }
        views.listEmployeesView.show(employees);
    }
}
