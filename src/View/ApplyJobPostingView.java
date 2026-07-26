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
        System.out.println("Job Posting Id:");
        int id = scanner.nextInt();
        scanner.nextLine();

        return new ApplyData(cpf,id);
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
}
