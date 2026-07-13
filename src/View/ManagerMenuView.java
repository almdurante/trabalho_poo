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
    public void show()
    {

        int opt;
        do {
            System.out.println("=================MENU===================");
            System.out.println("----------------------------------------");
            System.out.println("[1] Create Job Posting");
            System.out.println("[2] List Job Postings");
            System.out.println("[3] Edit Job Posting");
            System.out.println("[4] Delete Job Posting");
            System.out.println("[5] Exit");
            System.out.println("========================================");
            opt = scanner.nextInt();

            switch(opt)
            {
                case 1:
                {
                    views.createJobPostingView.show();
                    break;
                }
                case 2:
                {
                    views.listJobPostingsView.show();
                    break;
                }
                case 3:
                {
                    views.editJobPostingView.show();
                    break;
                }
                case 4:
                {
                    views.deleteJobPostingView.show();
                    break;
                }
                default:
                    System.out.println("Invalid Option !");
            }
        } while (opt != 5);
    }
}
