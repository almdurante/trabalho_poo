package View;

import Model.ApplyData;

import java.util.Scanner;

public class ApplyJobPostingView {

    private Scanner scanner;

    public ApplyJobPostingView() {
        this.scanner = new Scanner(System.in);
    }

    public ApplyData show()
    {
        System.out.println("CPF:");
        String cpf = scanner.nextLine();
        while (cpf.isEmpty()){
            System.out.println("CPF cannot be empty. Please enter a valid CPF:");
            cpf = scanner.nextLine();
        }
        System.out.println("Job Posting Id:");

        int option;
        while (true){
            if (scanner.hasNextInt()){
                option = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            System.out.println("Type a valid integer number for the job posting id.");
            scanner.nextLine();
        }

        return new ApplyData(cpf,option);
    }

    public void showCandidateAlreadyApplied()
    {
        System.out.println("Candidate Already Applied for this Job!");
    }
    public void showCandidateNotFound()
    {
        System.out.println("Candidate Not Found!");
    }
    public void showJobPostingNotFound()
    {
        System.out.println("Job Posting Not Found!");
    }
    public void showCandidateNotAvailable()
    {
        System.out.println("Candidate Not Available!");
    }
    public void showJobPostingClosed()
    {
        System.out.println("Job Posting Closed!");
    }
    public void showSuccess()
    {
        System.out.println("Application Submitted!");
    }
    public void ShowJobPostingHasApplications()
    {
        System.out.println("Job Posting has Applications! Cannot delete.");
    }
}
