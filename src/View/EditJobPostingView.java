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

    public JobPosting show()
    {
        System.out.println("Id:");
        int id = scanner.nextInt();

        WorkModeEnum work = null;
        EmployeeEnum type = null;

        scanner.nextLine();
        System.out.println("Editar vaga");
        System.out.println("Department:");
        String dep = scanner.nextLine();
        System.out.println("Role:");
        String role = scanner.nextLine();
        System.out.println("Salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Benefits:");
        String ben = scanner.nextLine();
        System.out.println("Attendance:");
        String att = scanner.nextLine();
        System.out.println("Educational Level:");
        String ed = scanner.nextLine();
        System.out.println("Type");
        String t = scanner.nextLine();
        switch (t) {
            case "CLT" -> type = EmployeeEnum.CLT;
            case "PJ" -> type = EmployeeEnum.PJ;
        }
        System.out.println("Work Mode:");
        String w = scanner.nextLine();
        switch (w) {
            case "HYBRID" -> work = WorkModeEnum.HYBRID;
            case "ON SITE" -> work = WorkModeEnum.ON_SITE;
            case "REMOTE" -> work = WorkModeEnum.REMOTE;
        }

        return new JobPosting(id,type,dep,role,salary,att,ed,ben,work,JobPostingStatusEnum.OPEN);
    }

    public void showSuccess() {
        System.out.println("Job posting edited successfully!");
    }

    public void showFail() {
        System.out.println("Job Posting Does Not Exist!");
    }
}
