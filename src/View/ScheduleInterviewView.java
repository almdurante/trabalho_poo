package View;

import java.util.Scanner;

public class ScheduleInterviewView {
    private Scanner scanner;

    public ScheduleInterviewView() {
        this.scanner = new Scanner(System.in);
    }

    public int askForApplicationId() {
        Colors.showHeader("SCHEDULE INTERVIEW");
        System.out.println();
        System.out.print(Colors.BOLD + " Enter the ID of the application: " + Colors.RESET);
        return Integer.parseInt(scanner.nextLine());
    }

    public String askForDate() {
        System.out.print(Colors.BOLD + " Enter interview date (e.g., DD/MM/YYYY): " + Colors.RESET);
        return scanner.nextLine();
    }

    public String askForTime() {
        System.out.print(Colors.BOLD + " Enter interview time (e.g., 14:30): " + Colors.RESET);
        return scanner.nextLine();
    }

    public String askForLocation() {
        System.out.print(Colors.BOLD + " Enter interview location or link: " + Colors.RESET);
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}