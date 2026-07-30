package Controller;

import Model.Application;
import Model.ApplicationStatusEnum;
import Model.CandidateStatusEnum;
import Model.Employee;
import Repository.ApplicationsRepository;
import Repository.EmployeeRepository;
import View.Views;

import java.time.LocalDate;

public class HireCandidateController {

    private final Views views;
    private final ApplicationsRepository applicationsRepository;
    private final EmployeeRepository employeeRepository;
    private final ListApplicationsController listApplicationsController;

    public HireCandidateController(ApplicationsRepository applicationsRepository, ListApplicationsController listApplicationsController, Views views, EmployeeRepository employeeRepository) {
        this.applicationsRepository = applicationsRepository;
        this.listApplicationsController = listApplicationsController;
        this.views = views;
        this.employeeRepository = employeeRepository;
    }

    public void hire()
    {
        if(!(listApplicationsController.listByStatus(ApplicationStatusEnum.APPROVED)))
        {
            views.hireCandidateView.showNoApprovedApplications();
            return;
        }

        int appId  = views.hireCandidateView.readId();

        Application application = applicationsRepository.findbyId(appId);

        if(application==null)
        {
            views.hireCandidateView.showApplicationNotFound();
            return;
        }
        if(application.getApplicationStatus()==ApplicationStatusEnum.HIRED)
        {
            views.hireCandidateView.showApplicationAlreadyHired();
            return;
        }
        if (application.getApplicationStatus() != ApplicationStatusEnum.APPROVED) {
            views.hireCandidateView.showNotApproved();
            return;
        }
        if (employeeRepository.findByCandidate(application.getCandidate()) != null) {
            views.hireCandidateView.showCandidateAlreadyEmployee();
            return;
        }

        Employee employee = new Employee(application.getCandidate(),application.getJobPosting(), LocalDate.now());

        employeeRepository.save(employee);
        application.setApplicationStatus(ApplicationStatusEnum.HIRED);
        application.getCandidate().setCandidateStatusEnum(CandidateStatusEnum.HIRED);

        views.hireCandidateView.showSuccess();

    }
}
