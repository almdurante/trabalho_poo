package View;

import java.util.Scanner;

public class HireCandidateView {

    private Scanner scanner;

    public HireCandidateView() {
        this.scanner = new Scanner(System.in);
    }

    public void showNoApprovedApplications() {
        Colors.warning("There are no Approved Applications!");
        Colors.showDivider();
    }

    public int readId() {
        Colors.showHeader("HIRE CANDIDATE");
        System.out.print(Colors.BOLD + " Application ID: " + Colors.RESET);

        int id;
        while (true) {
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            }

            Colors.error("Type a valid integer number for the application id.");
            scanner.nextLine();
        }

        return id;
    }

    public void showApplicationNotFound() {
        Colors.error("Application not Found!");
        Colors.showDivider();
    }

    public void showApplicationAlreadyHired() {
        Colors.warning("This Application Has Already Resulted in a Hire.");
        Colors.showDivider();
    }

    public void showSuccess() {
        Colors.success("Candidate Hired Successfully");
        Colors.showDivider();
    }

    public void showNotApproved() {
        Colors.warning("Application is Not Approved!");
        Colors.showDivider();
    }

    public void showCandidateAlreadyEmployee() {
        Colors.warning("Candidate is Already an Employee!");
        Colors.showDivider();
    }

    public void showApplicationCorrupted() {
        Colors.error("Application Data is Corrupted.");
        Colors.showDivider();
    }

    public void showUnexpectedError() {
        Colors.error("An Unexpected Error Occurred While Hiring the Candidate.");
        Colors.showDivider();
    }
}
