package View;

import java.util.Scanner;

public class ReviewApplicationView {

    private Scanner scanner;

    public ReviewApplicationView() {
        this.scanner = new Scanner(System.in);
    }

    public int readId() {
        Colors.showHeader("REVIEW APPLICATION");

        System.out.print(Colors.BOLD + " Application Id: " + Colors.RESET);
        int id;
        while (true) {
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            Colors.error("Type a valid integer number for the application id.");
            System.out.print(Colors.BOLD + " Application Id: " + Colors.RESET);
            scanner.nextLine();
        }
        return id;
    }

    public int readDecision() {
        int decision;
        do {
            System.out.println();
            System.out.println(Colors.WHITE + Colors.BOLD + " Select decision:" + Colors.RESET);
            System.out.println(Colors.GREEN + "  [1]" + Colors.RESET + " Approve");
            System.out.println(Colors.RED + "  [2]" + Colors.RESET + " Decline");
            System.out.print(Colors.BOLD + " Select option: " + Colors.RESET);

            while (!scanner.hasNextInt()) {
                Colors.error("Type a valid integer number for the decision.");
                System.out.print(Colors.BOLD + " Select option: " + Colors.RESET);
                scanner.nextLine();
            }
            decision = scanner.nextInt();
            scanner.nextLine();

            if (decision <= 0 || decision > 2) {
                Colors.error("Invalid option! Please select 1 or 2.");
            }
        } while (decision <= 0 || decision > 2);

        return decision;
    }

    public void showApplicationNotFound() {
        Colors.error("Application not Found!");
        Colors.showDivider();
    }

    public void showApplicationAlreadyReviewed() {
        Colors.warning("Application Already Reviewed!");
        Colors.showDivider();
    }

    public void showRejected() {
        Colors.error("Application Rejected!");
        Colors.showDivider();
    }

    public void showSelectedforInterview() {
        Colors.success("Application Selected for Interview!");
        Colors.showDivider();
    }

    public void showNoSubmittedApplications() {
        Colors.warning("There are no Submitted Applications!");
        Colors.showDivider();
    }
}