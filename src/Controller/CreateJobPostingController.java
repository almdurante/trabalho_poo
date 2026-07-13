package Controller;

import Model.EmployeeEnum;
import Model.JobPosting;
import Model.WorkModeEnum;
import Repository.JobPostingRepository;

import java.util.Scanner;

public class CreateJobPostingController {
    private JobPostingRepository repository;

    public CreateJobPostingController(JobPostingRepository repository) {
        this.repository = repository;
    }

    public void create(int id,EmployeeEnum employeetype,
                       String department,String role,double salary,String attendance,
                       String educationLevel,String benefits,WorkModeEnum workMode)
    {
        JobPosting jobPosting = new JobPosting(id,employeetype,department,role,
                salary,attendance,educationLevel,benefits,workMode);

        repository.save(jobPosting);
    }
}

