package Controller;

import View.MainMenuView;
import View.Views;

public class MainController {

    private MainMenuView mainMenuView;

    private ManagerController managerController;
    private CandidateController candidateController;


    public MainController(MainMenuView mainMenuView, ManagerController managerController, CandidateController candidateController) {
        this.mainMenuView = mainMenuView;
        this.managerController = managerController;
        this.candidateController = candidateController;
    }

    public void start()
    {
        while (true)
        {
            int opt = mainMenuView.show();

            switch(opt)
            {
                case 1:
                {
                    managerController.menu();
                    break;
                }
                case 2:
                {
                    candidateController.menu();
                    break;
                }
                case 3:
                {
                    return;
                }

            }
        }

    }
}
