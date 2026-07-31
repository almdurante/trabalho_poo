package View;

import java.util.Scanner;

public class EvaluateInterviewView {
    private Scanner scanner;

    public EvaluateInterviewView() {
        this.scanner = new Scanner(System.in);
    }

    public int askForApplicationId() {
        Colors.showHeader("EVALUATE INTERVIEW");
        System.out.print(Colors.BOLD + " Enter the ID of the application: " + Colors.RESET);
        return Integer.parseInt(scanner.nextLine());
    }

    public int askForDecision() {
        System.out.println(Colors.WHITE + Colors.BOLD + " What is the result of the interview?" + Colors.RESET);
        System.out.println(Colors.GREEN + "  [1]" + Colors.RESET + " Approve (APPROVED)");
        System.out.println(Colors.RED + "  [2]" + Colors.RESET + " Reject (REJECTED)");
        System.out.print(Colors.BOLD + " Choose an option: " + Colors.RESET);

        return Integer.parseInt(scanner.nextLine());
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}