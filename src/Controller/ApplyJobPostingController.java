package Controller;

import Model.*;
import Repository.ApplicationsRepository;
import Repository.CandidateRepository;
import Repository.JobPostingRepository;
import View.Views;

public class ApplyJobPostingController {

    private final Views views;
    private final CandidateRepository candidateRepository;
    private final JobPostingRepository jobPostingRepository;
    private final ApplicationsRepository applicationsRepository;

    public ApplyJobPostingController(Views views, CandidateRepository candidateRepository, JobPostingRepository jobPostingRepository, ApplicationsRepository applicationsRepository) {
        this.views = views;
        this.candidateRepository = candidateRepository;
        this.jobPostingRepository = jobPostingRepository;
        this.applicationsRepository = applicationsRepository;
    }

    public void apply()
    {
        ApplyData applyData = views.applyJobPostingView.show();

        Candidate candidate = candidateRepository.findbyCPF(applyData.getCpf());
        JobPosting jobPosting = jobPostingRepository.findbyId(applyData.getJobPostingId());

        if(candidate==null)
        {
            views.applyJobPostingView.showCandidateNotFound();
            return;
        }
        if(jobPosting==null)
        {
            views.applyJobPostingView.showJobPostingNotFound();
            return;
        }
        if(jobPosting.getJobPostingStatus()!= JobPostingStatusEnum.OPEN)
        {
            views.applyJobPostingView.showJobPostingClosed();
            return;
        }
        if(candidate.getCandidateStatusEnum()!= CandidateStatusEnum.AVAILABLE)
        {
            views.applyJobPostingView.showCandidateNotAvailable();
            return;
        }

        if(applicationsRepository.alreadyApplied(jobPosting,candidate))
        {
            views.applyJobPostingView.showCandidateAlreadyApplied();
            return;
        }

        Application application = new Application(0,candidate,jobPosting,ApplicationStatusEnum.SUBMITTED);

        applicationsRepository.save(application);
        views.applyJobPostingView.showSuccess();

    }
}
