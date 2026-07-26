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
        System.out.println("Id:");
        int id = scanner.nextInt();
        scanner.nextLine();

        return id;

    }

    public void showSuccess() {
        System.out.println("Job Posting deleted successfully!");
    }

    public void showFail() {
        System.out.println("Job Posting Does Not Exist!");
    }
}
