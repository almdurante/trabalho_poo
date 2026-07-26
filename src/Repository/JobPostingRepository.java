package Repository;

import Model.JobPosting;
import Model.JobPostingStatusEnum;

import java.util.ArrayList;
import java.util.List;

public class JobPostingRepository {

    private List<JobPosting> jobPostings = new ArrayList<>();

    public void save(JobPosting jobPosting) {
        jobPostings.add(jobPosting);
    }

    public List<JobPosting> findAll() {
        return jobPostings;
    }

    public JobPosting findbyId(int id)
    {
        for(JobPosting jobPosting : jobPostings)
        {
            if(jobPosting.getId()==id)
                return jobPosting;
        }
        return null;
    }

    public List<JobPosting> findbyStatus(JobPostingStatusEnum status)
    {
        List<JobPosting> list = new ArrayList<>();
        for(JobPosting jobPosting : jobPostings)
        {
            if(jobPosting.getJobPostingStatus() == status)
            {
                list.add(jobPosting);
            }
        }

        return list;
    }

    public boolean delete(JobPosting jobPosting) {
        return jobPostings.remove(jobPosting);
    }

}
