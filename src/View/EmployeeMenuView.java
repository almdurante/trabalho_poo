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

    public int show()
    {

        int opt;
        do
        {
            System.out.println("=================MENU===================");
            System.out.println("----------------------------------------");
            System.out.println("[1] Check Job Postings");
            System.out.println("[2] ");
            System.out.println("[3] ");
            System.out.println("[4] Exit");
            System.out.println("========================================");
            
            while (!scanner.hasNextInt())
            {
                System.out.println("Digite um numero inteiro válido para a opção do menu.");
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
