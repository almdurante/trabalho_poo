package Controller;

import Model.Application;
import Model.ApplicationStatusEnum;
import Repository.ApplicationsRepository;
import View.Views;

import java.util.List;

public class ReviewApplicationController {

    private final ListApplicationsController listApplicationsController;
    private final Views views;
    private final ApplicationsRepository applicationsRepository;

    public ReviewApplicationController(ListApplicationsController listApplicationsController, Views views, ApplicationsRepository applicationsRepository) {
        this.listApplicationsController = listApplicationsController;
        this.views = views;
        this.applicationsRepository = applicationsRepository;
    }

    public void review()
    {

        if(!(listApplicationsController.listByStatus(ApplicationStatusEnum.SUBMITTED)))
        {
            views.reviewApplicationView.showNoSubmittedApplications();
            return;
        }

        int appId = views.reviewApplicationView.readId();

        Application application = applicationsRepository.findbyId(appId);

        if(application==null)
        {
            views.reviewApplicationView.showApplicationNotFound();
            return;
        }
        if(application.getApplicationStatus()!=ApplicationStatusEnum.SUBMITTED)
        {
            views.reviewApplicationView.showApplicationAlreadyReviewed();
            return;
        }

        int decision = views.reviewApplicationView.readDecision();

        switch(decision)
        {
            case 1:
            {
                application.setApplicationStatus(ApplicationStatusEnum.SELECTED_FOR_INTERVIEW);
                views.reviewApplicationView.showSelectedforInterview();
                break;
            }
            case 2:
            {
                application.setApplicationStatus(ApplicationStatusEnum.REJECTED);
                views.reviewApplicationView.showRejected();
                break;
            }
        }

    }
}
