package View;

import java.util.Scanner;

public class HireCandidateView {

    private Scanner scanner;

    public HireCandidateView() {
        this.scanner = new Scanner(System.in);
    }

    public int askForApplicationId() {
        System.out.println("\n--- Hire Candidate ---");
        System.out.print("Enter the ID of the application you want to approve: ");
        
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }
    
    public void showMessage(String message) {
        System.out.println(message);
    }
}