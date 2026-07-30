package View;

import Controller.DeleteJobPostingController;
import Controller.EditJobPostingController;

import java.util.Scanner;

public class DeleteJobPostingView {

    private Scanner scanner;

    public DeleteJobPostingView() {

        this.scanner = new Scanner(System.in);
    }

    public int show()
    {
        int id;
        System.out.println("Id:");

        while (true){
            if (scanner.hasNextInt()){
                id= scanner.nextInt();
                scanner.nextLine();
                break;
            }
            System.out.println("Type a valid integer number for the job posting id.");
            scanner.nextLine();
        }

        return id;

    }
    public boolean confirmDelete()
    {
        int choice; 

        System.out.println("Are you sure you want to delete this job posting?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");

        int choice = scanner.nextInt();
        scanner.nextLine();
        
        return choice == 1;
    }
    public void showSuccess() {
        System.out.println("Job Posting deleted successfully!");
    }

    public void showFail() {
        System.out.println("Job Posting Does Not Exist!");
    }
}
