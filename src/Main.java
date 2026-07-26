import Controller.*;
import Model.Employee;
import Repository.ApplicationsRepository;
import Repository.CandidateRepository;
import Repository.JobPostingRepository;
import View.*;


public class Main {
    public static void main(String[] args) {

        ApplicationsRepository applicationsRepository = new ApplicationsRepository();
        JobPostingRepository jobPostingRepository = new JobPostingRepository();
        CandidateRepository candidateRepository = new CandidateRepository();
        Controllers controllers = new Controllers();


        Views views;

        views = new Views();
        views.createJobPostingView =
                new CreateJobPostingView();
        views.editJobPostingView =
                new EditJobPostingView();
        views.deleteJobPostingView =
                new DeleteJobPostingView();
        views.listJobPostingsView =
                new ListJobPostingsView();
        views.managerMenuView =
                new ManagerMenuView(views);
        views.candidateMenuView =
                new CandidateMenuView(views);
        views.mainMenuView =
                new MainMenuView(views);
        views.reviewApplicationView =
                new ReviewApplicationView();
        views.listApplicationsView =
                new ListApplicationsView();
        views.applyJobPostingView
                = new ApplyJobPostingView();
        views.employeeMenuView =
                new EmployeeMenuView(views);
        views.registerCandidateView =
                new RegisterCandidateView();

        controllers.createJobPostingController =
                new CreateJobPostingController(jobPostingRepository, views);
        controllers.listJobPostingsController =
                new ListJobPostingsController(jobPostingRepository,views);
        controllers.editJobPostingController =
                new EditJobPostingController(jobPostingRepository,views);
        controllers.deleteJobPostingController =
                new DeleteJobPostingController(views, jobPostingRepository);
        controllers.applyJobPostingController =
                new ApplyJobPostingController(views,candidateRepository,jobPostingRepository,applicationsRepository);
        controllers.listApplicationsController
                = new ListApplicationsController(views,applicationsRepository);
        controllers.registerCandidateController
                = new RegisterCandidateController(candidateRepository,views);
        controllers.reviewApplicationController =
                new ReviewApplicationController(controllers.listApplicationsController,views,applicationsRepository);


        ManagerController managerController =
                new ManagerController(views.managerMenuView,controllers);
        CandidateController candidateController =
                new CandidateController(views.candidateMenuView,controllers,candidateRepository);
        EmployeeController employeeController =
                new EmployeeController(views.employeeMenuView,controllers);
        MainController mainController =
                new MainController(views.mainMenuView,managerController,candidateController,employeeController);

        mainController.start();


    }
}
