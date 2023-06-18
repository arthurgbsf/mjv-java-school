package model.Contact;

public class Contact {
    
    String phone;
    String mail;
    String linkedIn;

    
    public Contact(String phone, String mail, String linkedIn) {
        this.phone = phone;
        this.mail = mail;
        this.linkedIn = linkedIn;
    }


    public String getPhone() {
        return phone;
    }


    public String getMail() {
        return mail;
    }


    public String getLinkedIn() {
        return linkedIn;
    }

}
