package View;

import java.util.Scanner;

public class ReviewApplicationView {

    private Scanner scanner;

    public ReviewApplicationView() {
        this.scanner = new Scanner(System.in);
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

    public int readDecision()
    {
        int decision;
        do
        {
            System.out.println("========================================");
            System.out.println("Approve [1]");
            System.out.println("Decline [2]");
            while (!scanner.hasNextInt())
            {
                System.out.println("Type a valid integer number for the decision.");
                scanner.nextLine();
            }
            decision = scanner.nextInt();
            scanner.nextLine();
        }while(decision<=0 || decision>2);

        return decision;
    }

    public void showApplicationNotFound()
    {
        System.out.println("Application not Found!");
    }

    public void showApplicationAlreadyReviewed()
    {
        System.out.println("Application Already Reviewed!");
    }

    public void showRejected()
    {
        System.out.println("Application Rejected!");
    }

    public void showSelectedforInterview()
    {
        System.out.println("Application Selected for Interview!");
    }
    public void showNoSubmittedApplications()
    {
        System.out.println("There are no Submitted Applications!");
    }

}
