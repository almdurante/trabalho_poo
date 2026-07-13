package View;


import Controller.CreateJobPostingController;
import Model.EmployeeEnum;
import Model.WorkModeEnum;

import java.util.Scanner;

public class CreateJobPostingView {


    private CreateJobPostingController controller;
    private Scanner scanner;

    public CreateJobPostingView(CreateJobPostingController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void show()
    {

        WorkModeEnum work = null;
        EmployeeEnum type = null;


        System.out.println("Criar vaga");
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
        System.out.println("Id:");
        int id = scanner.nextInt();
        scanner.nextLine();

        controller.create(id,type,dep,role,salary,att,ed,ben,work);
    }

}
