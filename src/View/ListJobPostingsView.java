package View;

import Controller.ListJobPostingsController;
import Model.JobPosting;

import java.util.List;

public class ListJobPostingsView {

    private ListJobPostingsController controller;

    public ListJobPostingsView(ListJobPostingsController controller) {
        this.controller = controller;
    }

    public void show()
    {
        List<JobPosting> jobPostingList = controller.list();
        System.out.println("Lista de Vagas:");

        for(JobPosting jobPosting : jobPostingList)
        {
            System.out.println("------------------------------");
            System.out.println("Department: " + jobPosting.getDepartment());
            System.out.println("Role: " + jobPosting.getRole());
            System.out.println("Salary: " + jobPosting.getSalary());
            System.out.println("Work Schedule: " + jobPosting.getAttendance());
            System.out.println("Education Level: " + jobPosting.getEducationLevel());
            System.out.println("Benefits: " + jobPosting.getBenefits());
            System.out.println("Work Mode: " + jobPosting.getWorkMode());
        }
    }

}
