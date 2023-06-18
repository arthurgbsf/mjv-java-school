package model.PersonalData;

import java.time.LocalDate;

public class PersonalData {
    
    private String name;
    private LocalDate birthDate;
    private String cpf;
    private Gender gender;

    public PersonalData(String name, LocalDate birthDate, String cpf, Gender gender){
        
        this.name = name;
        this.birthDate = birthDate;
        this.cpf = cpf;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    public Gender getGender() {
        return gender;
    }

}
