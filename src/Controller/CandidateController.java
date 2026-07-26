package Controller;

import Model.Candidate;
import Repository.CandidateRepository;
import View.CandidateMenuView;

public class CandidateController {

    private CandidateMenuView candidateMenuView;
    private Controllers controllers;
    private final CandidateRepository candidateRepository;

    public CandidateController(CandidateMenuView candidateMenuView, Controllers controllers, CandidateRepository candidateRepository) {
        this.candidateMenuView = candidateMenuView;
        this.controllers = controllers;
        this.candidateRepository = candidateRepository;
    }

    public void menu()
    {
        while(true)
        {
            int opt = candidateMenuView.show();

            switch(opt)
            {
                case 1:
                {
                    controllers.registerCandidateController.register();
                    break;
                }
                case 2:
                {
                    controllers.listJobPostingsController.list();
                    break;
                }
                case 3:
                {
                    controllers.applyJobPostingController.apply();
                    break;
                }
                case 4:
                {
                    String cpf = candidateMenuView.readCpf();
                    Candidate candidate = candidateRepository.findbyCPF(cpf);
                    if(candidate==null)
                    {
                        candidateMenuView.showNoCandidate();
                        break;
                    }
                    controllers.listApplicationsController.listByCandidate(cpf);
                    break;
                }
                case 5:
                {
                    return;
                }
            }
        }
    }

}
