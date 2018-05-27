// SPANOU ALEXANDRA


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;


public class Contact implements PhoneBookInterface{
    
    private String name;
    private String address;
    private String phone_number;
    
    public Contact(String onoma, String dieu8unsh, String thlefwno)
    {
        this.name=onoma;
        this.address=dieu8unsh;
        this.phone_number=thlefwno;
    }
    Contact(){		
	}
    
    public String get_name()
        {
	return this.name;		
	}
    public String get_phone_number()
        {
	return this.phone_number;		
	}
    public String get_address()
        {
	return this.address;
	}
    
    public void addContact(String name, String address, String phonenumber)
        {		
	Contacts.add(new Contact(name,address,phonenumber));
	//test();
	}
	
    public Contact SearchPhoneBook(String name) throws NoContactException {
	try{
	for(int i=0;i<Contacts.size();i++)
        {
            if(name.equals(Contacts.get(i).get_name()))
            return Contacts.get(i);		
	}
	throw new NoContactException();
	}catch(NoContactException e){		
		return null;
	}
}

	public boolean	deleteContact(String name){
		
		for(int i=0;i<Contacts.size();i++)
                {
			if(name.equals(Contacts.get(i).get_name()))
                        {
			   Contacts.remove(i);
			   return true;
			}
		}		
		return false;
	}
    public void Array_to_file() throws IOException{
      BufferedWriter fout = new BufferedWriter(new FileWriter("contacts.dat"));
      for(int i=0; i<Contacts.size();i++){
					
					fout.write("Name: ");
					fout.flush();
					fout.write(Contacts.get(i).name);
					fout.flush();
					fout.write(" Address: ");
					fout.flush();
					fout.write(Contacts.get(i).address);
					fout.flush();
					fout.write(" Phone number: ");
					fout.flush();
					fout.write(Contacts.get(i).phone_number);
					fout.flush();
					fout.newLine();
				}  
    }
}
