package View;

import Controller.DeleteJobPostingController;
import Controller.EditJobPostingController;

import java.util.Scanner;

public class DeleteJobPostingView {

    private DeleteJobPostingController controller;
    private Scanner scanner;

    public DeleteJobPostingView(DeleteJobPostingController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void show()
    {
        System.out.println("Id:");
        int id = scanner.nextInt();
        scanner.nextLine();

        if(controller.delete(id))
        {
            System.out.println("Job Posting deleted successfully!");
        }else System.out.println("Job Posting Does Not Exist!");
    }
}
