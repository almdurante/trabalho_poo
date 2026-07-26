package Controller;

import Model.JobPosting;
import Repository.JobPostingRepository;
import View.Views;

import java.util.List;

public class ListJobPostingsController {
    private final JobPostingRepository repository;
    private final Views views;

    public ListJobPostingsController(JobPostingRepository repository, Views views) {
        this.repository = repository;
        this.views = views;
    }

    public void list()
    {
        List<JobPosting> jobPostings = repository.findAll();
        if(jobPostings==null)
        {
            views.listJobPostingsView.showNoJobPostings();
            return;
        }
        views.listJobPostingsView.show(jobPostings);
    }
}
