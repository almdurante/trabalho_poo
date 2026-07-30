package View;

import java.util.Scanner;

public class HireCandidateView {


    private Scanner scanner;

    public HireCandidateView() {
        this.scanner = new Scanner(System.in);
    }

    public void showNoApprovedApplications()
    {
        System.out.println("There are no Approved Applications!");
    }

    public int readId()
    {
        System.out.println("========================================");
        System.out.println("Application Id:");
        int id;
        while (true){
            if (scanner.hasNextInt()){
                id= scanner.nextInt();
                scanner.nextLine();
                break;
            }
            System.out.println("Type a valid integer number for the application id.");
            scanner.nextLine();
        }
        return id;
    }


    public void showApplicationNotFound()
    {
        System.out.println("Application not Found!");
    }

    public void showApplicationAlreadyHired() {
        System.out.println("This application has already resulted in a hire.");

    }

    public void showSuccess()
    {
        System.out.println("Candidate Hired Successfully");
    }

    public void showNotApproved() {
        System.out.println("Application is not approved!");
    }

    public void showCandidateAlreadyEmployee()
    {
        System.out.println("Candidate is already and employee!");
    }
}
