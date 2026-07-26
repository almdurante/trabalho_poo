package View;

import Model.Application;
import Model.JobPosting;

import java.util.List;

public class ListApplicationsView {

    public void show(List<Application> applicationList)
    {
        System.out.println("Application List:");

        for(Application application : applicationList)
        {
            System.out.println("====================================");
            System.out.println("Application Id: " + application.getId());
            System.out.println("Candidate: " + application.getCandidate().getName());
            System.out.println("Job: " + application.getJobPosting().getRole());
            System.out.println("Department: " + application.getJobPosting().getDepartment());
            System.out.println("Status: " + application.getApplicationStatus());

        }

    }

    public void showNoApplications()
    {
        System.out.println("No Applications Found!");
    }
}
