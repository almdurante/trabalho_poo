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

    public JobPosting readJobPosting()
    {

        WorkModeEnum work = null;
        EmployeeEnum type = null;


        System.out.println("Create Job Posting");
        System.out.println("Department:");
        String dep = scanner.nextLine();
        while (dep.isEmpty()){
            System.out.println("Department cannot be empty. Please enter a valid department:");
            dep = scanner.nextLine();
        }
        System.out.println("Role:");
        String role = scanner.nextLine();
        while (role.isEmpty()){
            System.out.println("Role cannot be empty. Please enter a valid role:");
            role = scanner.nextLine();
        }
        System.out.println("Salary:");

        double salary;
        while(true){    
            if(scanner.hasNextDouble()){
                System.out.println("Type a valid number for the salary.");
                scanner.nextLine();
                continue;
            }
            salary = scanner.nextDouble();
            scanner.nextLine();

            if(salary <= 0){
                System.out.println("Salary must be greater than zero. Please enter a valid salary:");
                continue;
            }
            
            break;
        }
        System.out.println("Benefits:");
        String ben = scanner.nextLine();
        System.out.println("Attendance:");
        String att = scanner.nextLine();
        System.out.println("Educational Level:");
        String ed = scanner.nextLine();
        System.out.println(" Employee Type");
        System.out.println("[1] CLT ");
        System.out.println("[2] PJ");
        
        int option;
        do{
            while (!scanner.hasNextInt())
            {
                System.out.println("Type a valid integer number for the employee type.");
                scanner.nextLine();
            }

            option = scanner.nextInt();
            scanner.nextLine();

        }while (option<1 || option>2);
        type = (option == 1) ? EmployeeEnum.CLT : EmployeeEnum.PJ;

        System.out.println("Work Mode:");
        System.out.println("[1] HYBRID");
        System.out.println("[2] REMOTE");
        System.out.println("[3] ONSITE");

        int option2;
        do{
            while (!scanner.hasNextInt())
            {
                System.out.println("Type a valid integer number for the work mode.");
                scanner.nextLine();
            }

            option2 = scanner.nextInt();
            scanner.nextLine();

        }while (option2<1 || option2>3);
        work = (option2 == 1) ? WorkModeEnum.HYBRID : (option2 == 2) ? WorkModeEnum.REMOTE : WorkModeEnum.ON_SITE;

        System.out.println("Id:");
        int id;
        while (true){
            if (scanner.hasNextInt()){
                id= scanner.nextInt();
                scanner.nextLine();
                break;
            }

            System.out.println("Type a valid integer number for the job posting id.");
            scanner.nextLine();
        }

        return new JobPosting(id,type,dep,role,salary,att,ed,ben,work, JobPostingStatusEnum.OPEN);
    }

    public void showSuccess() {
        System.out.println("Job posting created successfully!");
    }

    public void showAlreadyExists() {
        System.out.println("Job posting with this ID already exists!");
    }
}
