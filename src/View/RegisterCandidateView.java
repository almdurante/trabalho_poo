package View;

import Model.*;

import java.util.Scanner;

public class RegisterCandidateView {

    private Scanner scanner;

    public RegisterCandidateView() {
        this.scanner = new Scanner(System.in);
    }

    public Candidate readCandidate() {
        Colors.showHeader("CANDIDATE REGISTRATION");

        System.out.println(Colors.WHITE + Colors.BOLD + " Please fill in the candidate information below:" + Colors.RESET);
        System.out.println();

        System.out.print(Colors.BOLD + " Name: " + Colors.RESET);
        String name = scanner.nextLine();

        while (name.isEmpty()) {
            Colors.error("Name cannot be empty. Please enter a valid name:");
            System.out.print(Colors.BOLD + " Name: " + Colors.RESET);
            name = scanner.nextLine();
        }

        System.out.print(Colors.BOLD + " Email: " + Colors.RESET);
        String email = scanner.nextLine();
        while (email.isEmpty() || !email.contains("@")) {
            Colors.error("Please enter a valid email:");
            System.out.print(Colors.BOLD + " Email: " + Colors.RESET);
            email = scanner.nextLine();
        }

        System.out.print(Colors.BOLD + " CPF: " + Colors.RESET);
        String cpf = scanner.nextLine();
        while (cpf.isBlank()) {
            Colors.error("CPF cannot be empty. Please enter a valid CPF:");
            System.out.print(Colors.BOLD + " CPF: " + Colors.RESET);
            cpf = scanner.nextLine();
        }

        System.out.print(Colors.BOLD + " Phone: " + Colors.RESET);
        String phone = scanner.nextLine();

        System.out.print(Colors.BOLD + " Address: " + Colors.RESET);
        String address = scanner.nextLine();

        System.out.print(Colors.BOLD + " Education Level: " + Colors.RESET);
        String ed = scanner.nextLine();

        Colors.showDivider();

        return new Candidate(name, email, cpf, phone, address, ed, CandidateStatusEnum.AVAILABLE);
    }

    public void showSuccess() {
        Colors.success("Candidate registered successfully!");
        Colors.showDivider();
    }

    public void showAlreadyExists() {
        Colors.warning("Candidate with this CPF already exists!");
        Colors.showDivider();
    }
}
