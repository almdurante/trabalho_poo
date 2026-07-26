package Model;

public class Application {
    private int id;
    private Candidate candidate;
    private JobPosting jobPosting;
    private ApplicationStatusEnum applicationStatus;

    private String interviewDate;
    private String interviewTime;
    private String interviewLocation;

    public Application(int id, Candidate candidate, JobPosting jobPosting, ApplicationStatusEnum applicationStatus) {
        this.id = id;
        this.candidate = candidate;
        this.jobPosting = jobPosting;
        this.applicationStatus = applicationStatus;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
        this.interviewTime = interviewTime;
    }

    public String getInterviewLocation() {
        return interviewLocation;
    }

    public void setInterviewLocation(String interviewLocation) {
        this.interviewLocation = interviewLocation;
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

    public ApplicationStatusEnum getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(ApplicationStatusEnum applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
}
