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

    public int show() {
        int opt;
        do {
            Colors.showHeader("EMPLOYEE AREA");

            System.out.println(Colors.WHITE + Colors.BOLD + " Select an option:" + Colors.RESET);
            System.out.println();
            System.out.println(Colors.CYAN + "  [1]" + Colors.RESET + " Check Job Postings");
            System.out.println(Colors.CYAN + "  [2]" + Colors.RESET + " List Applications");
            System.out.println(Colors.CYAN + "  [3]" + Colors.RESET + " Review Applications");
            System.out.println(Colors.RED + "  [4]" + Colors.RESET + " Exit");
            System.out.println();
            Colors.showDivider();
            System.out.print(Colors.BOLD + " Select option: " + Colors.RESET);

            while (!scanner.hasNextInt()) {
                Colors.error("Type a valid integer number for the menu option.");
                System.out.print(Colors.BOLD + " Select option: " + Colors.RESET);
                scanner.nextLine();
            }

            opt = scanner.nextInt();
            scanner.nextLine();

            if (opt <= 0 || opt > 4) {
                Colors.error("Invalid Option!");
                System.out.println();
            }

        } while (opt <= 0 || opt > 4);

        return opt;
    }
}
