package View;

import java.util.Scanner;

public class EvaluateInterviewView {
    private Scanner scanner;

    public EvaluateInterviewView() {
        this.scanner = new Scanner(System.in);
    }

    public int askForApplicationId() {
        System.out.println("\n--- Evaluate Interview ---");
        System.out.print("Enter the ID of the application: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int askForDecision() {
        System.out.println("What is the result of the interview?");
        System.out.println("[1] Approve (APPROVED)");
        System.out.println("[2] Reject (REJECTED)");
        System.out.print("Choose an option: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}