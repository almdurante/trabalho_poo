package Controller;

import Model.JobPosting;
import Repository.JobPostingRepository;

import java.util.List;

public class ListJobPostingsController {
    private JobPostingRepository repository;

    public ListJobPostingsController(JobPostingRepository repository) {
        this.repository = repository;
    }

    public List<JobPosting> list() {
        return repository.findAll();
    }
}
