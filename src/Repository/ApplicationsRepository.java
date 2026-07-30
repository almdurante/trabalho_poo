package Repository;

import Model.Application;
import Model.ApplicationStatusEnum;
import Model.Candidate;
import Model.JobPosting;

import java.util.ArrayList;
import java.util.List;

public class ApplicationsRepository {

    private List<Application> applications = new ArrayList<>();
    private int id = 1;

    public void save(Application application) {
        application.setId(id++);
        applications.add(application);
    }

    public List<Application> findAll() {
        return applications;
    }

    public Application findbyId(int id)
    {
        for(Application application : applications) {
            if (application.getId() == id)
                return application;
        }
        return null;
    }

    public boolean alreadyApplied(JobPosting jobPosting, Candidate candidate)
    {
        for(Application application : applications)
        {
            if(application.getCandidate()==candidate && application.getJobPosting()==jobPosting)
                return true;
        }
        return false;
    }

    public List<Application> findbyStatus(ApplicationStatusEnum status)
    {
        List<Application> list = new ArrayList<>();
        for(Application application : applications)
        {
            if(application.getApplicationStatus()==status)
            {
                list.add(application);
            }
        }
        return list;
    }

    public List<Application> findByCandidateCpf(String cpf)
    {
        List<Application> list = new ArrayList<>();
        for(Application application : applications)
        {
            if(application.getCandidate().getCpf().equals(cpf))
                list.add(application);
        }
        return list;
    }

    public boolean hasApplications(JobPosting jobPosting)
    {
        for(Application application : applications)
        {
            if(application.getJobPosting()==jobPosting)
                return true;
        }
        return false;
    }
}
