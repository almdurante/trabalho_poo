package View;

import Controller.Controllers;
import Repository.JobPostingRepository;

import java.util.Scanner;


public class MainMenuView {

    private Scanner scanner;
    private Views views;

    public MainMenuView(Views views) {
        this.views = views;
        this.scanner = new Scanner(System.in);
    }

    public int show() {
        int opt;

        do
        {
            System.out.println("=================MENU===================");
            System.out.println("[1] Manager");
            System.out.println("[2] Candidate");
            System.out.println("[3] Employee");
            System.out.println("[4] Exit");

            while (!scanner.hasNextInt())
            {
                System.out.println("Type a valid integer number for the menu option.");
                scanner.nextLine();
            }

            opt = scanner.nextInt();
            scanner.nextLine();

            if(opt<=0 || opt>4)
                System.out.println("Invalid Option!");

        }while(opt<=0 || opt>4);

        return opt;

    }

}