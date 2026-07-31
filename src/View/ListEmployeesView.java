package View;

import Model.Application;
import Model.Employee;

import java.util.List;

public class ListEmployeesView {

    public void show(List<Employee> employeeList)
    {
        Colors.showHeader("EMPLOYEES LIST");

        for (Employee employee : employeeList)
        {
            System.out.println(Colors.GRAY + "┌────────────────────────────────────────────────────────────┐" + Colors.RESET);

            System.out.printf(
                    Colors.GRAY + "│ " + Colors.BOLD + Colors.CYAN + "%-18s " + Colors.GRAY + ": " +
                    Colors.WHITE + Colors.BOLD + "%-37s " + Colors.GRAY + "│\n" + Colors.RESET,
                    "Employee Id", employee.getId());

            System.out.println(Colors.GRAY + "├────────────────────────────────────────────────────────────┤" + Colors.RESET);

            printField("Name", employee.getCandidate().getName());
            printField("CPF", employee.getCandidate().getCpf());
            printField("Department", employee.getJobPosting().getDepartment());
            printField("Role", employee.getJobPosting().getRole());
            printField("Salary", employee.getJobPosting().getSalary());
            printField("Work Mode", employee.getJobPosting().getWorkMode());
            printField("Employee Type", employee.getJobPosting().getEmployeetype());

            System.out.println(Colors.GRAY + "└────────────────────────────────────────────────────────────┘" + Colors.RESET);
            System.out.println();
        }

        Colors.showDivider();
    }

    public void showNoEmployees()
    {
        Colors.showHeader("EMPLOYEES LIST");
        Colors.warning("No Employeees Found!");
        Colors.showDivider();
    }

    private void printField(String label, Object value)
    {
        String strVal = (value != null) ? value.toString() : "N/A";
        System.out.printf(
                Colors.GRAY + "│ " + Colors.WHITE + "%-18s " + Colors.GRAY + ": " +
                Colors.RESET + "%-37s " + Colors.GRAY + "│\n" + Colors.RESET,
                label, strVal);
    }
}

