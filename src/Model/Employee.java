package Model;

public class Employee
{
    private String name;
    private EmployeeEnum employeeType;
    private float salary;
    private String email;
    private int cpf;
    private String phone;
    private String adress;
    private String role;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public EmployeeEnum getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeEnum employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
