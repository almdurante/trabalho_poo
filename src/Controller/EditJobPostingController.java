package Controller;

import Model.EmployeeEnum;
import Model.JobPosting;
import Model.WorkModeEnum;
import Repository.JobPostingRepository;
import View.EditJobPostingView;
import View.Views;

public class EditJobPostingController {

    private JobPostingRepository repository;
    private final Views views;
    public EditJobPostingController(JobPostingRepository repository, Views views) {
        this.repository = repository;
        this.views = views;
    }

    public void edit()
    {
        JobPosting newJobPosting = views.editJobPostingView.show();

        if (newJobPosting == null) {
            views.editJobPostingView.showFail();
            return;
        }

        JobPosting oldJobPosting = repository.findbyId(newJobPosting.getId());

        if (oldJobPosting == null)
        {
            views.editJobPostingView.showFail();
            return;
        }

        oldJobPosting.setDepartment(newJobPosting.getDepartment());
        oldJobPosting.setRole(newJobPosting.getRole());
        oldJobPosting.setSalary(newJobPosting.getSalary());
        oldJobPosting.setAttendance(newJobPosting.getAttendance());
        oldJobPosting.setEducationLevel(newJobPosting.getEducationLevel());
        oldJobPosting.setBenefits(newJobPosting.getBenefits());
        oldJobPosting.setWorkMode(newJobPosting.getWorkMode());
        oldJobPosting.setEmployeetype(newJobPosting.getEmployeetype());

        views.editJobPostingView.showSuccess();
    }
}
