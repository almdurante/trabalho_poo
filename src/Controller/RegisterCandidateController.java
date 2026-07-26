package Controller;

import Model.Candidate;
import Repository.CandidateRepository;
import View.Views;

public class RegisterCandidateController {

    private final CandidateRepository repository;
    private final Views views;


    public RegisterCandidateController(CandidateRepository repository, Views views) {
        this.repository = repository;
        this.views = views;
    }

    public void register()
    {
        Candidate candidate = views.registerCandidateView.readCandidate();

        repository.save(candidate);

        views.registerCandidateView.showSuccess();
    }

}
