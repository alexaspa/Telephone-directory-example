// SPANOU ALEXANDRA


import java.util.ArrayList;

public interface PhoneBookInterface {
    
    ArrayList<Contact> Contacts = new ArrayList<Contact>();
    
    public void addContact(String name, String address, String phonenumber);
    
    public Contact SearchPhoneBook(String name) throws NoContactException; 
    
    public boolean deleteContact(String name);
}