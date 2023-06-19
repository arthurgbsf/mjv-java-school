import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.time.LocalDate;

import model.Address.Address;
import model.Contact.Contact;
import model.CsvBuider.CsvBuilder;
import model.PersonalData.Gender;
import model.PersonalData.PersonalData;
import model.SalaryRange.SalaryRange;
import model.User.User;
import model.WorkExperience.WorkExperience;

public class App {
    public static void main(String[] args) throws Exception {

        Path path = Paths.get(System.getProperty("user.dir"));

        ArrayList<String> cols  =  new ArrayList<>();
        cols.add("ID");
        cols.add("Nome");
        cols.add("CPF");
        cols.add("Nascimento");
        cols.add("Genero");
        cols.add("Rua");
        cols.add("Numero");
        cols.add("Bairro");
        cols.add("Cidade");
        cols.add("Estado");
        cols.add("País");
        cols.add("Celular");
        cols.add("E-mail");
        cols.add("LinkedIn");
        cols.add("Experiência");
        cols.add("Trabalho atual");
        cols.add("Data de admissão");
        cols.add("Data de demissão");
        cols.add("Ultimo salário");
        cols.add("Pretenção salarial: Min.");
        cols.add("Pretenção salarial: Max.");
    
        ArrayList<User> users = new ArrayList<>();

        User user01 = new User(
            new PersonalData("Juliana Lima", LocalDate.of(1990, 3, 1), "732.365.580-32", Gender.FEMININE),
            new Address("Rua das Acácias", 567, "Vila Bela", "Vila Bela", "Santa Catarina", "Brasil"),
            new Contact("+55 47 98765-7890","juliana.lima@example.com", "https://www.linkedin.com/in/juliana-lima"),
            new WorkExperience("Front-end Developer", LocalDate.of(2013, 5, 12), LocalDate.of(2018, 4, 1), false, "R$4000"),
            new SalaryRange("R$3000","R$4000")
        );

        User user02 = new User(
            new PersonalData("Maria Silva", LocalDate.of(1985, 8, 12), "123.456.789-00", Gender.FEMININE),
            new Address("Avenida dos Coqueiros", 123, "Centro", "Cidade Nova", "São Paulo", "Brasil"),
            new Contact("+55 11 98765-4321", "maria.silva@example.com", "https://www.linkedin.com/in/maria-silva"),
            new WorkExperience("Web Designer", LocalDate.of(2008, 9, 20), LocalDate.of(2021, 5, 30), false, "R$6000"),
            new SalaryRange("R$5000", "R$8000")
        );

        users.add(user01);
        users.add(user02);
        
        CsvBuilder csvBuilder = new CsvBuilder(cols, path, users);

        csvBuilder.createRows();
        csvBuilder.createFile();

    }
}
