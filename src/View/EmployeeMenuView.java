package View;

import Model.Employee;

import java.util.Scanner;

public class EmployeeMenuView {
    private Scanner scanner;
    private Views views;

    public EmployeeMenuView(Views views) {
        this.views = views;
        this.scanner = new Scanner(System.in);
    }
    public void show()
    {

        int opt;
        do {
            System.out.println("=================MENU===================");
            System.out.println("----------------------------------------");
            System.out.println("[1] Check Job Postings");
            System.out.println("[2] ");
            System.out.println("[3] ");
            System.out.println("[4] Exit");
            System.out.println("========================================");
            opt = scanner.nextInt();

            switch(opt)
            {
                case 1:
                {
                    views.listJobPostingsView.show();
                    break;
                }
                case 2:
                {

                    break;
                }
                case 3:
                {

                    break;
                }
                case 4:
                {
                    break;
                }
                default:
                    System.out.println("Invalid Option !");
            }
        } while (opt != 4);
    }
}
