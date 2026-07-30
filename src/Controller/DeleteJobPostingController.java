package Controller;

import Model.JobPosting;
import Repository.JobPostingRepository;
import View.Views;

public class DeleteJobPostingController {


    private final Views views;
    private JobPostingRepository repository;
    private final ApplicationRepository applicationRepository;

    public DeleteJobPostingController(Views views, JobPostingRepository repository, ApplicationRepository applicationRepository) {
        this.views = views;
        this.repository = repository;
        this.applicationRepository = applicationRepository;
    }

    public void delete()
    {
        int id = views.deleteJobPostingView.show();

        JobPosting jobPosting = repository.findbyId(id);

        if(jobPosting==null)
        {
            views.deleteJobPostingView.showFail();
            return;
        }
        if (applicationRepository.hasApplications(jobPosting))
        {
            views.deleteJobPostingView.ShowJobPostingHasApplications();
            return;
        }

        if (!views.deleteJobPostingView.confirmDelete())
        {
            return;
        }

            repository.delete(jobPosting);

            views.deleteJobPostingView.showSuccess();
    }
}
