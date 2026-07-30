package View;

import Model.*;

import java.util.Scanner;

public class RegisterCandidateView {

    private Scanner scanner;


    public RegisterCandidateView() {
        this.scanner = new Scanner(System.in);
    }

    public Candidate readCandidate() {

        System.out.println("Register Candidate");
        System.out.println("Name:");
        String name = scanner.nextLine();

        while (name.isEmpty()){
            System.out.println("Name cannot be empty. Please enter a valid name:");
            name = scanner.nextLine();
        }

        System.out.println("Email:");
        String email = scanner.nextLine();
        while (email.isEmpty() || !email.contains("@")){
            System.out.println("Please enter a valid email:");
            email = scanner.nextLine();
        }

        System.out.println("CPF:");
        String cpf = scanner.nextLine();
        while (cpf.isBlank()){
            System.out.println("CPF cannot be empty. Please enter a valid CPF:");
            cpf = scanner.nextLine();
        }

        System.out.println("Phone:");
        String phone = scanner.nextLine();
        System.out.println("Address:");
        String address = scanner.nextLine();
        System.out.println("Education Level:");
        String ed = scanner.nextLine();

        return new Candidate(name, email, cpf, phone, address, ed, CandidateStatusEnum.AVAILABLE);
    }

    public void showSuccess() {
        System.out.println("Candidate registered successfully!");
    }

    public void showAlreadyExists() {
        System.out.println("Candidate with this CPF already exists!");
    }
}

