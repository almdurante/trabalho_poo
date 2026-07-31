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

    public int show() {
        int opt;

        do {
            Colors.showHeader("MANAGER AREA");

            System.out.println(Colors.WHITE + Colors.BOLD + " Select an option:" + Colors.RESET);
            System.out.println();
            System.out.println(Colors.CYAN + "  [1]" + Colors.RESET + " Create Job Posting");
            System.out.println(Colors.CYAN + "  [2]" + Colors.RESET + " List Job Postings");
            System.out.println(Colors.CYAN + "  [3]" + Colors.RESET + " Edit Job Posting");
            System.out.println(Colors.CYAN + "  [4]" + Colors.RESET + " Delete Job Posting");
            System.out.println(Colors.CYAN + "  [5]" + Colors.RESET + " List Applications");
            System.out.println(Colors.CYAN + "  [6]" + Colors.RESET + " Review Applications");
            System.out.println(Colors.CYAN + "  [7]" + Colors.RESET + " Schedule Interview");
            System.out.println(Colors.CYAN + "  [8]" + Colors.RESET + " Evaluate Interview");
            System.out.println(Colors.CYAN + "  [9]" + Colors.RESET + " Hire Candidate");
            System.out.println(Colors.RED + "  [10]" + Colors.RESET + " Exit");
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

            if (opt <= 0 || opt > 10) {
                Colors.error("Invalid Option!");
                System.out.println();
            }
        } while (opt <= 0 || opt > 10);

        return opt;
    }
}