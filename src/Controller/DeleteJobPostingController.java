package Controller;

import Model.JobPosting;
import Repository.JobPostingRepository;
import View.Views;

public class DeleteJobPostingController {


    private final Views views;
    private JobPostingRepository repository;

    public DeleteJobPostingController(Views views, JobPostingRepository repository) {
        this.views = views;
        this.repository = repository;
    }

    public void delete()
    {
        int id = views.deleteJobPostingView.show();
        JobPosting jobPosting = repository.findbyId(id);
        if(jobPosting==null)
        {
            views.deleteJobPostingView.showFail();
        }else
        {
            repository.delete(jobPosting);
            views.deleteJobPostingView.showSuccess();
        }

    }
}
