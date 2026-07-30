package Model;

import java.time.LocalDate;

public class Employee
{
    private static int nextId = 1;
    private int id;

    private Candidate candidate;
    private JobPosting jobPosting;
    private LocalDate hireDate;

    public Employee(Candidate candidate, JobPosting jobPosting, LocalDate hireDate) {
        this.hireDate = hireDate;
        this.id = nextId++;
        this.candidate = candidate;
        this.jobPosting = jobPosting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public JobPosting getJobPosting() {
        return jobPosting;
    }

    public void setJobPosting(JobPosting jobPosting) {
        this.jobPosting = jobPosting;
    }
}
