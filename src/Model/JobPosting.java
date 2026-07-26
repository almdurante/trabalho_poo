package Model;


import java.util.ArrayList;
import java.util.List;

public class JobPosting {
    private int id;
    private EmployeeEnum employeetype;
    private String department;
    private String role;
    private double salary;
    private String attendance;
    private String educationLevel;
    private String benefits;
    private WorkModeEnum workMode;
    private JobPostingStatusEnum jobPostingStatus;

    public JobPosting(int id, EmployeeEnum employeetype, String department, String role,
                      double salary, String attendance, String educationLevel,
                      String benefits, WorkModeEnum workMode, JobPostingStatusEnum jobPostingStatus) {
        this.id = id;
        this.employeetype = employeetype;
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.attendance = attendance;
        this.educationLevel = educationLevel;
        this.benefits = benefits;
        this.workMode = workMode;
        this.jobPostingStatus = jobPostingStatus;
    }

    public JobPostingStatusEnum getJobPostingStatus() {
        return jobPostingStatus;
    }

    public void setJobPostingStatus(JobPostingStatusEnum jobPostingStatus) {
        this.jobPostingStatus = jobPostingStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public EmployeeEnum getEmployeetype() {
        return employeetype;
    }

    public void setEmployeetype(EmployeeEnum employeetype) {
        this.employeetype = employeetype;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public WorkModeEnum getWorkMode() {
        return workMode;
    }

    public void setWorkMode(WorkModeEnum workMode) {
        this.workMode = workMode;
    }
}
