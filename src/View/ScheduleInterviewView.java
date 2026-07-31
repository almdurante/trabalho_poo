package View;

import java.util.Scanner;

public class ScheduleInterviewView {
    private Scanner scanner;

    public ScheduleInterviewView() {
        this.scanner = new Scanner(System.in);
    }

    public int askForApplicationId() {
        System.out.println("\n--- Schedule Interview ---");
        System.out.print("Enter the ID of the application: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String askForDate() {
        System.out.print("Enter interview date (e.g., DD/MM/YYYY): ");
        return scanner.nextLine();
    }

    public String askForTime() {
        System.out.print("Enter interview time (e.g., 14:30): ");
        return scanner.nextLine();
    }

    public String askForLocation() {
        System.out.print("Enter interview location or link: ");
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}