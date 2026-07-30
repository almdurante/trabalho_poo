package View;

import Controller.ListJobPostingsController;
import Model.JobPosting;

import java.util.List;

public class ListJobPostingsView {

    public void show(List<JobPosting> jobPostingList) {
        Colors.showHeader("JOB POSTINGS");

        for (JobPosting jobPosting : jobPostingList) {
            System.out.println(Colors.GRAY + "┌────────────────────────────────────────────────────────────┐" + Colors.RESET);
            
            System.out.printf(Colors.GRAY + "│ " + Colors.BOLD + Colors.CYAN + "%-18s " + Colors.GRAY + ": " + Colors.WHITE + Colors.BOLD + "%-37s " + Colors.GRAY + "│\n" + Colors.RESET,
                    "Id", jobPosting.getId());
            
            System.out.println(Colors.GRAY + "├────────────────────────────────────────────────────────────┤" + Colors.RESET);

            printField("Department", jobPosting.getDepartment());
            printField("Role", jobPosting.getRole());
            printField("Salary", jobPosting.getSalary());
            printField("Work Schedule", jobPosting.getAttendance());
            printField("Education Level", jobPosting.getEducationLevel());
            printField("Benefits", jobPosting.getBenefits());
            printField("Work Mode", jobPosting.getWorkMode());

            System.out.println(Colors.GRAY + "└────────────────────────────────────────────────────────────┘" + Colors.RESET);
            System.out.println(); //espaçamento entre os registros
        }

        Colors.showDivider();
    }

    public void showNoJobPostings() {
        Colors.showHeader("JOB POSTINGS");
        Colors.warning("No Job Postings Found!");
        Colors.showDivider();
    }

    //formatar os campos sem truncar dados
    private void printField(String label, Object value) {
        String strVal = (value != null) ? value.toString() : "N/A";
        System.out.printf(Colors.GRAY + "│ " + Colors.WHITE + "%-18s " + Colors.GRAY + ": " + Colors.RESET + "%-37s " + Colors.GRAY + "│\n" + Colors.RESET,
                label, strVal);
    }
}