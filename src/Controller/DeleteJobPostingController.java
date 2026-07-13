package Controller;

import Model.JobPosting;
import Repository.JobPostingRepository;

public class DeleteJobPostingController {


    private JobPostingRepository repository;

    public DeleteJobPostingController(JobPostingRepository repository) {
        this.repository = repository;
    }

    public boolean delete(int id)
    {
        JobPosting jobPosting = repository.findbyId(id);
        if(jobPosting == null)
            return false;

        return repository.delete(jobPosting);
    }
}
