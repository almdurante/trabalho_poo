package Controller;

import Model.JobPosting;
import Model.JobPostingStatusEnum;
import Repository.JobPostingRepository;
import View.Views;

import java.util.ArrayList;
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
        if(jobPostings.isEmpty())
        {
            views.listJobPostingsView.showNoJobPostings();
            return;
        }
        views.listJobPostingsView.show(jobPostings);
    }

   public void listOpenJobPostings()
{
    List<JobPosting> openJobPostings = new ArrayList<>();

    for (JobPosting jobPosting : repository.findAll())
    {
        if (jobPosting.getJobPostingStatus() == JobPostingStatusEnum.OPEN)
        {
            openJobPostings.add(jobPosting);
        }
    }

    if (openJobPostings.isEmpty())
    {
        views.listJobPostingsView.showNoJobPostings();
        return;
    }

    views.listJobPostingsView.show(openJobPostings);
}
}
