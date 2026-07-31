package View;

import Controller.DeleteJobPostingController;
import Controller.EditJobPostingController;

import java.util.Scanner;

public class DeleteJobPostingView {

    private Scanner scanner;

    public DeleteJobPostingView() {
        this.scanner = new Scanner(System.in);
    }

    public int show() {
        Colors.showHeader("DELETE JOB POSTING");

        System.out.print(Colors.BOLD + " Id: " + Colors.RESET);

        int id;
        while (true) {
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            Colors.error("Type a valid integer number for the job posting id.");
            System.out.print(Colors.BOLD + " Id: " + Colors.RESET);
            scanner.nextLine();
        }

        return id;
    }

    public boolean confirmDelete() {
        System.out.println();
        Colors.warning("Are you sure you want to delete this job posting?");
        System.out.println(Colors.CYAN + "  [1]" + Colors.RESET + " Yes");
        System.out.println(Colors.RED + "  [2]" + Colors.RESET + " No");
        System.out.print(Colors.BOLD + " Select option: " + Colors.RESET);

        int choice = scanner.nextInt();
        scanner.nextLine();

        return choice == 1;
    }

    public void showJobPostingHasApplications() {
        Colors.error("Cannot delete: This Job Posting already has applications!");
        Colors.showDivider();
    }

    public void showSuccess() {
        Colors.success("Job Posting deleted successfully!");
        Colors.showDivider();
    }

    public void showFail() {
        Colors.error("Job Posting Does Not Exist!");
        Colors.showDivider();
    }

    public void showUnexpectedError()
    {
        Colors.error("An unexpected error occurred while deleting the job posting.");
    }
}
