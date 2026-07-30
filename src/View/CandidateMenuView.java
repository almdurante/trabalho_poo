package View;

import Controller.Controllers;

import java.util.Scanner;

public class CandidateMenuView {
    private Scanner scanner;
    private Views views;

    public CandidateMenuView(Views views) {
        this.views = views;
        this.scanner = new Scanner(System.in);
    }

    public int show()
    {
        int opt;
        do
        {
            System.out.println("=================MENU===================");
            System.out.println("----------------------------------------");
            System.out.println("[1] Register");
            System.out.println("[2] View Job Postings");
            System.out.println("[3] Apply");
            System.out.println("[4] View Applications");
            System.out.println("[5] Exit");
            System.out.println("========================================");


            while(!scanner.hasNextInt())
            {
                System.out.println("Type a valid integer number for the menu option.");
                scanner.nextLine();
            }

            opt = scanner.nextInt();
            scanner.nextLine();
            
            if(opt<=0 || opt>5)
                System.out.println("Invalid Option!");

        }while(opt<=0 || opt>5);

        return opt;
    }

    public String readCpf()
    {
        System.out.println("CPF:");
        return scanner.nextLine();
    }

    public void showNoCandidate()
    {
        System.out.println("No Candidate Found!");
    }
}
