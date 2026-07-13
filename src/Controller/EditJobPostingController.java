package Controller;

import Model.EmployeeEnum;
import Model.JobPosting;
import Model.WorkModeEnum;
import Repository.JobPostingRepository;

public class EditJobPostingController {

    private JobPostingRepository repository;

    public EditJobPostingController(JobPostingRepository repository) {
        this.repository = repository;
    }

    public void edit(int id, EmployeeEnum employeetype,
                     String department, String role, double salary, String attendance,
                     String educationLevel, String benefits, WorkModeEnum workMode)
    {
        JobPosting jobPosting = repository.findbyId(id);

        if (jobPosting == null)
        {
            System.out.println("Job posting not found !");
            return;
        }

        jobPosting.setAttendance(attendance);
        jobPosting.setRole(role);
        jobPosting.setDepartment(department);
        jobPosting.setSalary(salary);
        jobPosting.setEmployeetype(employeetype);
        jobPosting.setEducationLevel(educationLevel);
        jobPosting.setWorkMode(workMode);
        jobPosting.setBenefits(benefits);
    }
}
