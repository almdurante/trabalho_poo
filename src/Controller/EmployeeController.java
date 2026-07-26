package Controller;

import View.EmployeeMenuView;
import View.Views;

public class EmployeeController {

    private EmployeeMenuView employeeMenuView;
    private Controllers controllers;

    public EmployeeController(EmployeeMenuView employeeMenuView, Controllers controllers) {
        this.employeeMenuView = employeeMenuView;
        this.controllers = controllers;
    }

    public void menu()
    {
        while (true)
        {
            int opt = employeeMenuView.show();

            switch (opt)
            {
                case 1:
                {
                    controllers.listJobPostingsController.list();
                    break;
                }
                case 2:
                {

                    break;
                }
                case 3:
                {

                    break;
                }
                case 4:
                {
                    return;
                }
            }
        }
    }
}
