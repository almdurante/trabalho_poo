import Controller.*;
import Model.Employee;
import Repository.JobPostingRepository;
import View.*;


public class Main {
    public static void main(String[] args)
    {

        JobPostingRepository repository = new JobPostingRepository();
        Controllers controllers = new Controllers();

        controllers.createJobPostingController =
                new CreateJobPostingController(repository);

        controllers.listJobPostingsController =
                new ListJobPostingsController(repository);

        controllers.editJobPostingController =
                new EditJobPostingController(repository);
        controllers.deleteJobPostingController =
                new DeleteJobPostingController(repository);

        Views views = new Views();
        views.createJobPostingView =
                new CreateJobPostingView(controllers.createJobPostingController);
        views.editJobPostingView =
                new EditJobPostingView(controllers.editJobPostingController);
        views.deleteJobPostingView =
                new DeleteJobPostingView(controllers.deleteJobPostingController);
        views.listJobPostingsView =
                new ListJobPostingsView(controllers.listJobPostingsController);
        views.managerMenuView =
                new ManagerMenuView(views);
        views.candidateMenuView =
                new CandidateMenuView(views);
        MainMenuView mainMenuView = new MainMenuView(views);
        mainMenuView.show();

    }
}