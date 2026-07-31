package Controller;

import View.ManagerMenuView;

public class ManagerController {

    private ManagerMenuView managerMenuView;
    private Controllers controllers;

    public ManagerController(ManagerMenuView managerMenuView, Controllers controllers) {
        this.managerMenuView = managerMenuView;

        this.controllers = controllers;
    }

    public void menu()
    {
        while(true)
        {
            int opt = managerMenuView.show();

            switch(opt)
            {
                case 1:
                {
                    controllers.createJobPostingController.create();
                    break;
                }
                case 2:
                {
                    controllers.listJobPostingsController.list();
                    break;
                }
                case 3:
                {
                    controllers.editJobPostingController.edit();
                    break;
                }
                case 4:
                {
                    controllers.deleteJobPostingController.delete();
                    break;
                }
                case 5:
                {
                    controllers.listApplicationsController.listAll();
                    break;
                }
                case 6:
                {
                    controllers.reviewApplicationController.review();
                    break;
                }
                case 7:
                {
                    controllers.scheduleInterviewController.schedule();
                    break;
                }
                case 8:
                {
                    controllers.evaluateInterviewController.evaluate();
                    break;
                }
                case 9:
                {
                    controllers.hireCandidateController.hire();
                    break;
                }
                case 10:
                {
                    controllers.listEmployeesController.listAll();
                    break;
                }
                case 11:
                {
                    return;
                }
            }
        }
    }
}
