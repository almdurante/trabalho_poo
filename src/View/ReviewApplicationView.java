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
        int id = scanner.nextInt();
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
            decision = scanner.nextInt();
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
