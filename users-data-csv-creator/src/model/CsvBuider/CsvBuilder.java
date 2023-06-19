package model.CsvBuider;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import model.User.User;

public class CsvBuilder {
    
    private ArrayList<String> rows = new ArrayList<String>();
    private ArrayList<String> cols;
    private Path path;
    private ArrayList<User> users;


    public CsvBuilder(ArrayList<String> cols, Path path, ArrayList<User> users) {
        this.cols = cols;
        this.path = path;
        this.users = users;
    }

    private void setRows(String row) {
        rows.add(row);
    }

    public void createRows(){

        StringBuilder header = new StringBuilder();
        for( String col : cols){  
            header.append(col + ",");   
        }
        String headerString = header.toString();
        String trimmedHeader = headerString.substring(0, headerString.length() - 1);
        setRows(trimmedHeader);

        for( User user : users){

            StringBuilder row = new StringBuilder();
            row.append(user.getId() + ",");
            row.append(user.getPersonalData().getName() + ",");
            row.append(user.getPersonalData().getCpf() + ",");
            row.append(user.getPersonalData().getBirthDate() + ",");
            row.append(user.getPersonalData().getGender() + ",");
            row.append(user.getAdress().getStreet() + ",");
            row.append(user.getAdress().getNumber() + ",");
            row.append(user.getAdress().getDistrict() + ",");
            row.append(user.getAdress().getCity() + ",");
            row.append(user.getAdress().getState() + ",");
            row.append(user.getAdress().getCountry() + ",");
            row.append(user.getContact().getPhone() + ",");
            row.append(user.getContact().getMail() + ",");
            row.append(user.getContact().getLinkedIn() + ",");
            row.append(user.getWorkExperience().getExperiences() + ",");
            row.append(user.getWorkExperience().getCurrentWork() + ",");
            row.append(user.getWorkExperience().getHiring() + ",");
            row.append(user.getWorkExperience().getResignation() + ",");
            row.append(user.getWorkExperience().getSalary() + ",");
            row.append(user.getSalaryRange().getMin() + ",");
            row.append(user.getSalaryRange().getMax());

            setRows(row.toString());      
        }
          
    }

    public void createFile(){

         Path outputFile = Paths.get(path.toString() +"/user-data.csv");
        
        try {
            Files.write(outputFile, rows, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }



}
