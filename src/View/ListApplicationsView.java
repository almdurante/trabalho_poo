package View;

import Model.Application;
import Model.JobPosting;

import java.util.List;

public class ListApplicationsView {

    public void show(List<Application> applicationList) {
        Colors.showHeader("APPLICATIONS LIST");

        for (Application application : applicationList) {
            System.out.println(Colors.GRAY + "┌────────────────────────────────────────────────────────────┐" + Colors.RESET);
            
            // ID da candidatura
            System.out.printf(Colors.GRAY + "│ " + Colors.BOLD + Colors.CYAN + "%-18s " + Colors.GRAY + ": " + Colors.WHITE + Colors.BOLD + "%-37s " + Colors.GRAY + "│\n" + Colors.RESET,
                    "Application Id", application.getId());
            
            System.out.println(Colors.GRAY + "├────────────────────────────────────────────────────────────┤" + Colors.RESET);

            String candidateName = (application.getCandidate() != null) ? application.getCandidate().getName() : "N/A";
            String jobRole = (application.getJobPosting() != null) ? application.getJobPosting().getRole() : "N/A";
            String department = (application.getJobPosting() != null) ? application.getJobPosting().getDepartment() : "N/A";

            printField("Candidate", candidateName);
            printField("Job", jobRole);
            printField("Department", department);

            //status formatado (cor dinamica)
            String statusStr = (application.getApplicationStatus() != null) ? application.getApplicationStatus().toString() : "N/A";
            String statusColor = Colors.YELLOW;
            
            if (statusStr.equalsIgnoreCase("APPROVED") || statusStr.equalsIgnoreCase("ACCEPTED")) {
                statusColor = Colors.GREEN;
            } else if (statusStr.equalsIgnoreCase("REJECTED") || statusStr.equalsIgnoreCase("CANCELLED")) {
                statusColor = Colors.RED;
            }

            System.out.printf(Colors.GRAY + "│ " + Colors.WHITE + "%-18s " + Colors.GRAY + ": " + statusColor + Colors.BOLD + "%-37s " + Colors.GRAY + "│\n" + Colors.RESET,
                    "Status", statusStr);

            System.out.println(Colors.GRAY + "└────────────────────────────────────────────────────────────┘" + Colors.RESET);
            System.out.println(); //espaçamento
        }

        Colors.showDivider();
    }

    public void showNoApplications() {
        Colors.showHeader("APPLICATIONS LIST");
        Colors.warning("No Applications Found!");
        Colors.showDivider();
    }

    //formatar os campos sem truncar dados
    private void printField(String label, Object value) {
        String strVal = (value != null) ? value.toString() : "N/A";
        System.out.printf(Colors.GRAY + "│ " + Colors.WHITE + "%-18s " + Colors.GRAY + ": " + Colors.RESET + "%-37s " + Colors.GRAY + "│\n" + Colors.RESET,
                label, strVal);
    }
}
