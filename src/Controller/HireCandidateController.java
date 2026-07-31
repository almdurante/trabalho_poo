package Controller;

import View.HireCandidateView;
import Repository.ApplicationsRepository;
import Repository.EmployeeRepository;
import Repository.CandidateRepository;
import Repository.JobPostingRepository;
import Model.Application;
import Model.ApplicationStatusEnum;
import Model.Candidate;
import Model.CandidateStatusEnum;
import Model.Employee;
import Model.EmployeeEnum;
import Model.JobPosting;

public class HireCandidateController {

    private HireCandidateView view;
    private ApplicationsRepository applicationsRepository;
    private EmployeeRepository employeeRepository;
    private CandidateRepository candidateRepository;
    private JobPostingRepository jobPostingRepository;

    public HireCandidateController(HireCandidateView view, 
                                   ApplicationsRepository applicationsRepository, 
                                   EmployeeRepository employeeRepository,
                                   CandidateRepository candidateRepository,
                                   JobPostingRepository jobPostingRepository) {
        this.view = view;
        this.applicationsRepository = applicationsRepository;
        this.employeeRepository = employeeRepository;
        this.candidateRepository = candidateRepository;
        this.jobPostingRepository = jobPostingRepository;
    }

    public void hire() {
        try {
            int applicationId = view.askForApplicationId();

            Application application = applicationsRepository.findbyId(applicationId);
            if (application == null) {
                view.showMessage("Error: Application not found in the system.");
                return; 
            }

            if (application.getApplicationStatus() != ApplicationStatusEnum.APPROVED) {
                view.showMessage("Error: The application must have the APPROVED status to be hired.");
                return;
            }

            Candidate candidate = application.getCandidate();
            JobPosting jobPosting = application.getJobPosting();

            if (candidate == null || jobPosting == null) {
                view.showMessage("Error: The candidate or job posting associated with this application does not exist.");
                return;
            }

            if (candidate.getCandidateStatusEnum() == CandidateStatusEnum.HIRED) {
                view.showMessage("Error: This candidate has already been hired.");
                return;
            }

            if (employeeRepository.cpfExists(candidate.getCpf())) {
                view.showMessage("Error: There is already an employee registered with this CPF.");
                return;
            }

            Employee newEmployee = new Employee();
            newEmployee.setName(candidate.getName());
            newEmployee.setEmail(candidate.getEmail());
            newEmployee.setCpf(candidate.getCpf());
            newEmployee.setPhone(candidate.getPhone());
            newEmployee.setAddress(candidate.getAddress());
            
            newEmployee.setEmployeeType(EmployeeEnum.CLT);
            newEmployee.setSalary(0.0);
            newEmployee.setRole("Default Role");

            employeeRepository.addEmployee(newEmployee);

            candidate.setCandidateStatusEnum(CandidateStatusEnum.HIRED);

            view.showMessage("Success! Candidate " + newEmployee.getName() + " successfully hired.");

        } catch (NumberFormatException e) {
            view.showMessage("Error: Please enter a valid ID number.");
        } catch (Exception e) {
            view.showMessage("Unexpected error while processing hiring: " + e.getMessage());
        }
    }
}