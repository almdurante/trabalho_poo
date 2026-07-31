package View;

import Model.ApplyData;

import java.util.Scanner;

public class ApplyJobPostingView {

    private Scanner scanner;

    public ApplyJobPostingView() {
        this.scanner = new Scanner(System.in);
    }

    public ApplyData show() {
        Colors.showHeader("APPLY FOR JOB POSTING");

        System.out.println(Colors.WHITE + Colors.BOLD + " Please enter the required information to apply:" + Colors.RESET);
        System.out.println();

        System.out.print(Colors.BOLD + " CPF: " + Colors.RESET);
        String cpf = scanner.nextLine();
        while (cpf.isEmpty()) {
            Colors.error("CPF cannot be empty. Please enter a valid CPF:");
            System.out.print(Colors.BOLD + " CPF: " + Colors.RESET);
            cpf = scanner.nextLine();
        }

        System.out.print(Colors.BOLD + " Job Posting Id: " + Colors.RESET);
        int option;
        while (true) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            Colors.error("Type a valid integer number for the job posting id.");
            System.out.print(Colors.BOLD + " Job Posting Id: " + Colors.RESET);
            scanner.nextLine();
        }

        Colors.showDivider();
        return new ApplyData(cpf, option);
    }

    public void showCandidateAlreadyApplied() {
        Colors.warning("Candidate Already Applied for this Job!");
        Colors.showDivider();
    }

    public void showCandidateNotFound() {
        Colors.error("Candidate Not Found!");
        Colors.showDivider();
    }

    public void showJobPostingNotFound() {
        Colors.error("Job Posting Not Found!");
        Colors.showDivider();
    }

    public void showCandidateNotAvailable() {
        Colors.warning("Candidate Not Available!");
        Colors.showDivider();
    }

    public void showJobPostingClosed() {
        Colors.warning("Job Posting Closed!");
        Colors.showDivider();
    }

    public void showSuccess() {
        Colors.success("Application Submitted!");
        Colors.showDivider();
    }

    public void ShowJobPostingHasApplications() {
        Colors.error("Job Posting has Applications! Cannot delete.");
        Colors.showDivider();
    }
}