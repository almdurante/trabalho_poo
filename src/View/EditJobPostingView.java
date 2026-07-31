package View;

import Controller.EditJobPostingController;
import Model.EmployeeEnum;
import Model.JobPosting;
import Model.JobPostingStatusEnum;
import Model.WorkModeEnum;

import java.util.Scanner;

public class EditJobPostingView {

    private Scanner scanner;

    public EditJobPostingView() {
        this.scanner = new Scanner(System.in);
    }

    public JobPosting show() {
        Colors.showHeader("EDIT JOB POSTING");

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

        WorkModeEnum work = null;
        EmployeeEnum type = null;

        System.out.println();
        System.out.println(Colors.WHITE + Colors.BOLD + " Please enter the updated details:" + Colors.RESET);

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

        System.out.print(Colors.BOLD + " Type (CLT/PJ): " + Colors.RESET);
        String t = scanner.nextLine();
        switch (t) {
            case "CLT" -> type = EmployeeEnum.CLT;
            case "PJ" -> type = EmployeeEnum.PJ;
        }

        System.out.print(Colors.BOLD + " Work Mode (HYBRID/ON SITE/REMOTE): " + Colors.RESET);
        String w = scanner.nextLine();
        switch (w) {
            case "HYBRID" -> work = WorkModeEnum.HYBRID;
            case "ON SITE" -> work = WorkModeEnum.ON_SITE;
            case "REMOTE" -> work = WorkModeEnum.REMOTE;
        }

        Colors.showDivider();

        return new JobPosting(id, type, dep, role, salary, att, ed, ben, work, JobPostingStatusEnum.OPEN);
    }

    public void showSuccess() {
        Colors.success("Job posting edited successfully!");
        Colors.showDivider();
    }

    public void showFail() {
        Colors.error("Job Posting Does Not Exist!");
        Colors.showDivider();
    }
}