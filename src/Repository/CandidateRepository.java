package Repository;

import Model.Candidate;
import Model.JobPosting;

import java.util.ArrayList;
import java.util.List;

public class CandidateRepository {

    private List<Candidate> candidates = new ArrayList<>();

    public void save(Candidate candidate) {
        candidates.add(candidate);
    }

    public List<Candidate> findAll() {
        return candidates;
    }

    public Candidate findbyCPF(String cpf)
    {
        for(Candidate candidate  : candidates)
        {
            if(candidate.getCpf().equals(cpf))
                return candidate;
        }
        return null;
    }
}
