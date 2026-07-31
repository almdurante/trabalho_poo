package View;

import Model.Application;
import Model.Employee;

import java.util.List;

public class ListEmployeesView {

    public void show(List<Employee> employeeList)
    {
        System.out.println("Employees List:");

        for(Employee employee : employeeList)
        {
            System.out.println("====================================");
            System.out.println("Employee Id: " + employee.getId());
            System.out.println("Name: " + employee.getCandidate().getName());
            System.out.println("CPF: " + employee.getCandidate().getCpf());
            System.out.println("Department: " + employee.getJobPosting().getDepartment());
            System.out.println("Role: " + employee.getJobPosting().getRole());
            System.out.println("Salary: " + employee.getJobPosting().getSalary());
            System.out.println("Work Mode: " + employee.getJobPosting().getWorkMode());
            System.out.println("Employee Type: " + employee.getJobPosting().getEmployeetype());
            System.out.println("====================================");


        }

    }

    public void showNoEmployees()
    {
        System.out.println("No Employeees Found!");
    }
}

