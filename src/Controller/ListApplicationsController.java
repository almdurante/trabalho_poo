package Controller;

import Model.Application;
import Model.ApplicationStatusEnum;
import Model.Candidate;
import Repository.ApplicationsRepository;
import Repository.CandidateRepository;
import View.Views;

import java.util.List;

public class ListApplicationsController {

    private final Views views;
    private final ApplicationsRepository applicationsRepository;

    public ListApplicationsController(Views views, ApplicationsRepository applicationsRepository) {
        this.views = views;
        this.applicationsRepository = applicationsRepository;
    }

    public void listAll()
    {
        List<Application> applications = applicationsRepository.findAll();
        if(applications.isEmpty())
        {
            views.listApplicationsView.showNoApplications();
            return;
        }
        views.listApplicationsView.show(applications);
    }

    public void listByCandidate(String cpf)
    {
        List<Application> applications =
                applicationsRepository.findByCandidateCpf(cpf);

        if(applications.isEmpty())
        {
            views.listApplicationsView.showNoApplications();
            return;
        }

        views.listApplicationsView.show(applications);
    }

    public boolean listByStatus(ApplicationStatusEnum status)
    {
        List<Application> applications =
                applicationsRepository.findbyStatus(status);

        if(applications.isEmpty())
        {
            return false;
        }

        views.listApplicationsView.show(applications);
        return true;

    }


}
