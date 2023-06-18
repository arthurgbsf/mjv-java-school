package model.CsvBuider;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import model.User.User;

public class CsvBuilder {
    
    private ArrayList<String> rows;
    private ArrayList<String> cols;
    private Path path;
    private ArrayList<User> users;


    public CsvBuilder(ArrayList<String> cols, Path path, ArrayList<User> users) {
        this.cols = cols;
        this.path = path;
        this.users = users;
    }

    public void createRows(){

        for( User user : users){

            StringBuilder row = new StringBuilder();
            row.append(user.getId() + ";");
            row.append(user.getPersonalData().getName() + ";");
            row.append(user.getPersonalData().getCpf() + ";");
            row.append(user.getPersonalData().getBirthDate() + ";");
            row.append(user.getPersonalData().getGender() + ";");
            row.append(user.getContact().getPhone() + ";");
            row.append(user.getContact().getMail() + ";");
            row.append(user.getContact().getLinkedIn() + ";");
            row.append(user.getAdress().getStreet() + ";");
            row.append(user.getAdress().getNumber() + ";");
            row.append(user.getAdress().getDistrict() + ";");
            row.append(user.getAdress().getState() + ";");
            row.append(user.getAdress().getState() + ";");
            row.append(user.getAdress().getCountry() + ";");
            









        }
        
    }

    




}
