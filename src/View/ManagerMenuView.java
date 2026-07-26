package View;

import Controller.Controllers;
import Repository.JobPostingRepository;

import java.util.Scanner;

public class ManagerMenuView {

    private Scanner scanner;
    private Views views;

    public ManagerMenuView(Views views) {
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
            System.out.println("[1] Create Job Posting");
            System.out.println("[2] List Job Postings");
            System.out.println("[3] Edit Job Posting");
            System.out.println("[4] Delete Job Posting");
            System.out.println("[5] List Applications");
            System.out.println("[6] Review Applications");
            System.out.println("[7] Exit");
            System.out.println("========================================");
            opt = scanner.nextInt();
            scanner.nextLine();

            if(opt<=0 || opt>7)
                System.out.println("Invalid Option!");
        }while(opt<=0 || opt>7);

        return opt;

    }

}
