package Controller;

import Model.JobPosting;
import Repository.JobPostingRepository;
import Repository.ApplicationsRepository;
import View.Views;

public class DeleteJobPostingController {


    private final Views views;
    private JobPostingRepository repository;
    private final ApplicationsRepository applicationsRepository;

    public DeleteJobPostingController(Views views, JobPostingRepository repository, ApplicationsRepository applicationRepository) {
        this.views = views;
        this.repository = repository;
        this.applicationsRepository = applicationRepository;
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
        if (applicationsRepository.hasApplications(jobPosting))
        {
            views.deleteJobPostingView.showJobPostingHasApplications();
            return;
        }

        if (!views.deleteJobPostingView.confirmDelete())
        {
            return;
        }

           if(repository.delete(jobPosting))
           {
               views.deleteJobPostingView.showSuccess();
           }
           else
           {
               views.deleteJobPostingView.showUnexpectedError();
           }

    }
}
