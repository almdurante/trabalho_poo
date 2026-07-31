package Controller;

import Model.Application;
import Model.ApplicationStatusEnum;
import Repository.ApplicationsRepository;
import View.ScheduleInterviewView;

public class ScheduleInterviewController {
    private ScheduleInterviewView view;
    private ApplicationsRepository applicationsRepository;

    public ScheduleInterviewController(ScheduleInterviewView view, ApplicationsRepository applicationsRepository) {
        this.view = view;
        this.applicationsRepository = applicationsRepository;
    }

    public void schedule() {
        try {
            int applicationId = view.askForApplicationId();
            Application application = applicationsRepository.findbyId(applicationId);

            if (application == null) {
                view.showMessage("Error: Application not found.");
                return;
            }

            if (application.getApplicationStatus() != ApplicationStatusEnum.SELECTED_FOR_INTERVIEW) {
                view.showMessage("Error: Application must be in SELECTED_FOR_INTERVIEW status to schedule.");
                return;
            }

            String date = view.askForDate();
            String time = view.askForTime();
            String location = view.askForLocation();

            if (date.trim().isEmpty() || time.trim().isEmpty() || location.trim().isEmpty()) {
                view.showMessage("Error: Date, time, and location cannot be empty.");
                return;
            }

            application.setInterviewDate(date);
            application.setInterviewTime(time);
            application.setInterviewLocation(location);
            application.setApplicationStatus(ApplicationStatusEnum.INTERVIEW_SCHEDULED);

            view.showMessage("Success! Interview scheduled for " + date + " at " + time + ".");

        } catch (NumberFormatException e) {
            view.showMessage("Error: Please enter a valid ID number.");
        } catch (Exception e) {
            view.showMessage("Unexpected error: " + e.getMessage());
        }
    }
}