package View;

import Controller.CreateJobPostingController;
import Model.EmployeeEnum;
import Model.JobPosting;
import Model.JobPostingStatusEnum;
import Model.WorkModeEnum;

import java.util.Scanner;

public class CreateJobPostingView {

    private Scanner scanner;

    public CreateJobPostingView() {
        this.scanner = new Scanner(System.in);
    }

    public JobPosting readJobPosting() {
        WorkModeEnum work = null;
        EmployeeEnum type = null;

        Colors.showHeader("CREATE JOB POSTING");

        System.out.println(Colors.WHITE + Colors.BOLD + " Please fill in the job posting details:" + Colors.RESET);
        System.out.println();

        System.out.print(Colors.BOLD + " Department: " + Colors.RESET);
        String dep = scanner.nextLine();
        while (dep.isEmpty()) {
            Colors.error("Department cannot be empty. Please enter a valid department:");
            System.out.print(Colors.BOLD + " Department: " + Colors.RESET);
            dep = scanner.nextLine();
        }

        System.out.print(Colors.BOLD + " Role: " + Colors.RESET);
        String role = scanner.nextLine();
        while (role.isEmpty()) {
            Colors.error("Role cannot be empty. Please enter a valid role:");
            System.out.print(Colors.BOLD + " Role: " + Colors.RESET);
            role = scanner.nextLine();
        }

        System.out.print(Colors.BOLD + " Salary: " + Colors.RESET);
        double salary;
        while (true) {
            if (!scanner.hasNextDouble()) {
                Colors.error("Type a valid number for the salary.");
                System.out.print(Colors.BOLD + " Salary: " + Colors.RESET);
                scanner.nextLine();
                continue;
            }
            salary = scanner.nextDouble();
            scanner.nextLine();

            if (salary <= 0) {
                Colors.error("Salary must be greater than zero. Please enter a valid salary:");
                System.out.print(Colors.BOLD + " Salary: " + Colors.RESET);
                continue;
            }

            break;
        }

        System.out.print(Colors.BOLD + " Benefits: " + Colors.RESET);
        String ben = scanner.nextLine();

        System.out.print(Colors.BOLD + " Attendance: " + Colors.RESET);
        String att = scanner.nextLine();

        System.out.print(Colors.BOLD + " Educational Level: " + Colors.RESET);
        String ed = scanner.nextLine();

        System.out.println();
        System.out.println(Colors.WHITE + Colors.BOLD + " Employee Type:" + Colors.RESET);
        System.out.println(Colors.CYAN + "  [1]" + Colors.RESET + " CLT");
        System.out.println(Colors.CYAN + "  [2]" + Colors.RESET + " PJ");
        System.out.print(Colors.BOLD + " Select type: " + Colors.RESET);

        int option;
        do {
            while (!scanner.hasNextInt()) {
                Colors.error("Type a valid integer number for the employee type.");
                System.out.print(Colors.BOLD + " Select type: " + Colors.RESET);
                scanner.nextLine();
            }

            option = scanner.nextInt();
            scanner.nextLine();

            if (option < 1 || option > 2) {
                Colors.error("Invalid Option!");
                System.out.print(Colors.BOLD + " Select type: " + Colors.RESET);
            }

        } while (option < 1 || option > 2);
        type = (option == 1) ? EmployeeEnum.CLT : EmployeeEnum.PJ;

        System.out.println();
        System.out.println(Colors.WHITE + Colors.BOLD + " Work Mode:" + Colors.RESET);
        System.out.println(Colors.CYAN + "  [1]" + Colors.RESET + " HYBRID");
        System.out.println(Colors.CYAN + "  [2]" + Colors.RESET + " REMOTE");
        System.out.println(Colors.CYAN + "  [3]" + Colors.RESET + " ONSITE");
        System.out.print(Colors.BOLD + " Select work mode: " + Colors.RESET);

        int option2;
        do {
            while (!scanner.hasNextInt()) {
                Colors.error("Type a valid integer number for the work mode.");
                System.out.print(Colors.BOLD + " Select work mode: " + Colors.RESET);
                scanner.nextLine();
            }

            option2 = scanner.nextInt();
            scanner.nextLine();

            if (option2 < 1 || option2 > 3) {
                Colors.error("Invalid Option!");
                System.out.print(Colors.BOLD + " Select work mode: " + Colors.RESET);
            }

        } while (option2 < 1 || option2 > 3);
        work = (option2 == 1) ? WorkModeEnum.HYBRID : (option2 == 2) ? WorkModeEnum.REMOTE : WorkModeEnum.ON_SITE;

        System.out.println();
        System.out.print(Colors.BOLD + " Id: " + Colors.RESET);
        int id;
        while (true) {
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            }

            Colors.error("Type a valid integer number for the job posting id.");
            System.out.print(Colors.BOLD + " Id: " + Colors.RESET);
            scanner.nextLine();
        }

        Colors.showDivider();

        return new JobPosting(id, type, dep, role, salary, att, ed, ben, work, JobPostingStatusEnum.OPEN);
    }

    public void showSuccess() {
        Colors.success("Job posting created successfully!");
        Colors.showDivider();
    }

    public void showAlreadyExists() {
        Colors.warning("Job posting with this ID already exists!");
        Colors.showDivider();
    }
}