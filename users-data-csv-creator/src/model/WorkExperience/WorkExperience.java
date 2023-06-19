package model.WorkExperience;
import java.time.LocalDate;

public class WorkExperience {
    
    private String experiences;
    private LocalDate hiring;
    private LocalDate resignation;
    private Boolean currentWork;
    private String salary;

    public WorkExperience(String experiences, LocalDate hiring, 
        LocalDate resignation, 
        Boolean currentWork, String salary) {
        
        this.experiences = experiences;
        this.hiring = hiring;
        this.resignation = resignation;
        this.currentWork = currentWork;
        this.salary = salary;
    }

    public LocalDate getHiring() {
        return hiring;
    }

    public LocalDate getResignation() {
        return resignation;
    }

    public Boolean getCurrentWork() {
        return currentWork;
    }

     public String getSalary() {
        return salary;
    }

     public String getExperiences() {
        return experiences;
    }

}
