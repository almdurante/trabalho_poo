package Model;

public class Candidate {

    private String name;
    private String email;
    private String cpf;
    private String phone;
    private String address;
    private String educationLevel;
    private CandidateStatusEnum candidateStatusEnum;

    public Candidate(String name, String email, String cpf, String phone, String address, String educationLevel, CandidateStatusEnum candidateStatusEnum) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
        this.educationLevel = educationLevel;
        this.candidateStatusEnum = candidateStatusEnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public CandidateStatusEnum getCandidateStatusEnum() {
        return candidateStatusEnum;
    }

    public void setCandidateStatusEnum(CandidateStatusEnum candidateStatusEnum) {
        this.candidateStatusEnum = candidateStatusEnum;
    }
}
