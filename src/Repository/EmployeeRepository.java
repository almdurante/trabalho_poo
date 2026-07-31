package Repository;

import Model.Candidate;
import Model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public void save(Employee employee)
    {
        employees.add(employee);
    }

    public List<Employee> findAll() {
        return employees;
    }

    public Employee findByCandidate(Candidate candidate) {
        for (Employee employee : employees) {
            if (employee.getCandidate().equals(candidate)) {
                return employee;
            }
        }
        return null;
    }
}
