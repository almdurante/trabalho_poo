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

    public void show() {
        int opt;

        do {
            System.out.println("=================MENU===================");
            System.out.println("[1] Candidate");
            System.out.println("[2] Manager");
            System.out.println("[3] Employee");
            System.out.println("[4] Exit");

            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                {
                    views.candidateMenuView.show();
                    break;
                }

                case 2:
                {
                    views.managerMenuView.show();
                    break;
                }

                case 3:
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid Option!");
            }

        } while (opt != 4);
    }
}
