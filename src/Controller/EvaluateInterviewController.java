package Controller;

import Model.Application;
import Model.ApplicationStatusEnum;
import Repository.ApplicationsRepository;
import View.EvaluateInterviewView;

public class EvaluateInterviewController {
    private EvaluateInterviewView view;
    private ApplicationsRepository applicationsRepository;

    public EvaluateInterviewController(EvaluateInterviewView view, ApplicationsRepository applicationsRepository) {
        this.view = view;
        this.applicationsRepository = applicationsRepository;
    }

    public void evaluate() {
        try {
            int applicationId = view.askForApplicationId();
            Application application = applicationsRepository.findbyId(applicationId);

            if (application == null) {
                view.showMessage("Error: Application not found.");
                return;
            }

            if (application.getApplicationStatus() != ApplicationStatusEnum.INTERVIEW_SCHEDULED) {
                view.showMessage("Error: Application must be in INTERVIEW_SCHEDULED status to be evaluated.");
                return;
            }

            int decision = view.askForDecision();

            if (decision == 1) {
                application.setApplicationStatus(ApplicationStatusEnum.APPROVED);
                view.showMessage("Success! Application APPROVED.");
            } else if (decision == 2) {
                application.setApplicationStatus(ApplicationStatusEnum.REJECTED);
                view.showMessage("Success! Application REJECTED.");
            } else {
                view.showMessage("Error: Invalid decision option.");
            }

        } catch (NumberFormatException e) {
            view.showMessage("Error: Please enter a valid number.");
        } catch (Exception e) {
            view.showMessage("Unexpected error: " + e.getMessage());
        }
    }
}