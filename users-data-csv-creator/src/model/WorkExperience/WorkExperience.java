package model.WorkExperiences;
import java.time.LocalDate;

public class WorkExperience {
    
    private String job;
    private LocalDate hiring;
    private LocalDate resignation;
    private String description;
    private Boolean current;
    private String salary;

    public WorkExperience(String job, LocalDate hiring, 
        LocalDate resignation, String description, 
        Boolean current, String salary) {
        
        this.job = job;
        this.hiring = hiring;
        this.resignation = resignation;
        this.description = description;
        this.current = current;
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public LocalDate getHiring() {
        return hiring;
    }

    public LocalDate getResignation() {
        return resignation;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCurrent() {
        return current;
    }

     public String getSalary() {
        return salary;
    }

}
