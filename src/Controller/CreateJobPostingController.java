package Controller;

import Model.EmployeeEnum;
import Model.JobPosting;
import Model.WorkModeEnum;
import Repository.JobPostingRepository;
import View.CreateJobPostingView;
import View.Views;

import java.util.Scanner;

public class CreateJobPostingController {
    private final JobPostingRepository repository;
    private final Views views;

    public CreateJobPostingController(JobPostingRepository repository, Views views) {
        this.repository = repository;
        this.views = views;
    }

    public void create()
    {
        JobPosting jobPosting = views.createJobPostingView.readJobPosting();
        
        if(JobPosting.Repository.getJobPostingById(jobPosting.getId()) != null) {
            views.createJobPostingView.showAlreadyExists();
            return;
        }
        repository.save(jobPosting);

        views.createJobPostingView.showSuccess();
    }

}

