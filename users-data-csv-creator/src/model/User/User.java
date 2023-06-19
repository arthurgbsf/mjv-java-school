package model.User;

import model.Address.Address;
import model.Contact.Contact;
import model.PersonalData.PersonalData;
import model.SalaryRange.SalaryRange;
import model.WorkExperience.WorkExperience;

public class User {

    private static Integer incrementId = 1;
    private Integer id; 
    private PersonalData personalData;
    private Address adress;
    private Contact contact;
    private WorkExperience workExperience;
    private SalaryRange salaryRange;

    public User(PersonalData personalData, Address adress, Contact contact,
            WorkExperience workExperience, SalaryRange salaryRange) {   

        this.id = incrementId;
        this.personalData = personalData;
        this.adress = adress;
        this.contact = contact;
        this.workExperience = workExperience;
        this.salaryRange = salaryRange;
        incrementId ++;
    }

    public Integer getId() {
        return id;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public Address getAdress() {
        return adress;
    }

    public Contact getContact() {
        return contact;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public SalaryRange getSalaryRange() {
        return salaryRange;
    }

}
