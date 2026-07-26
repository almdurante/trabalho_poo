package Model;

public class ApplyData {
    private String cpf;
    private int jobPostingId;

    public ApplyData(String cpf, int jobPostingId) {
        this.cpf = cpf;
        this.jobPostingId = jobPostingId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getJobPostingId() {
        return jobPostingId;
    }

    public void setJobPostingId(int jobPostingId) {
        this.jobPostingId = jobPostingId;
    }
}
