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

    public int show() {
        int opt;
        do {
            Colors.showHeader("CANDIDATE AREA");

            System.out.println(Colors.WHITE + Colors.BOLD + " Select an option:" + Colors.RESET);
            System.out.println();
            System.out.println(Colors.CYAN + "  [1]" + Colors.RESET + " Register");
            System.out.println(Colors.CYAN + "  [2]" + Colors.RESET + " View Job Postings");
            System.out.println(Colors.CYAN + "  [3]" + Colors.RESET + " Apply");
            System.out.println(Colors.CYAN + "  [4]" + Colors.RESET + " View Applications");
            System.out.println(Colors.RED + "  [5]" + Colors.RESET + " Exit");
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

            if (opt <= 0 || opt > 5) {
                Colors.error("Invalid Option!");
                System.out.println();
            }

        } while (opt <= 0 || opt > 5);

        return opt;
    }

    public String readCpf() {
        System.out.print(Colors.BOLD + " CPF: " + Colors.RESET);
        return scanner.nextLine();
    }

    public void showNoCandidate() {
        Colors.warning("No Candidate Found!");
    }
}
