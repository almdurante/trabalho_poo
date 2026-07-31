package Repository;

import Model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    
    private List<Employee> employees;

    public EmployeeRepository() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public boolean cpfExists(String cpf) {
        for (Employee emp : employees) {
            if (emp.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }
}