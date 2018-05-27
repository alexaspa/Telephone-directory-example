// SPANOU ALEXANDRA


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {   
    public static void main(String[] args) throws NoContactException, IOException{
        
                Scanner in = new Scanner(System.in);
		Scanner inn = new Scanner(System.in);
		Contact c1 = new Contact();
                
                Contact c2 = new Contact();
                Contact c3 = new Contact();
                c2.addContact("Alexandra Spanou", "AD 12, Thessaloniki", "12345");
                c3.addContact("Mary Jane", "DA 76, Athens", "54321");
       
        do{
			int i;			
			System.out.println("MENU");			
			System.out.println("1.Add a contact.");
			System.out.println("2.Search a contact.");
			System.out.println("3.Delete a contact.");
			System.out.println("4.Exit");
			i= in.nextInt();			
			
			if(i==1){
				String name, address, phonenumber;
				
					System.out.println("Name:");
					name = inn.nextLine();
					System.out.println("Address: ");
					address = inn.nextLine();
					System.out.println("Phone number: ");
					phonenumber = inn.nextLine();
					System.out.println("");
				
				c1.addContact(name, address, phonenumber);
			        }
			if(i==2){
				String name;
				System.out.println("Give the name of the contact you want to search: ");
				name=inn.nextLine();
				if(c1.SearchPhoneBook(name)!=null){
				System.out.println("Name: "+c1.SearchPhoneBook(name).get_name()+" Address: "+c1.SearchPhoneBook(name).get_address()+" Phone number: "+c1.SearchPhoneBook(name).get_phone_number());
				}
			        }
			if(i==3){
				String name;
				System.out.println("Give the name of the contact you want to delete: ");
				name=inn.nextLine();
				if(c1.deleteContact(name))
					System.out.println("The contact deleted!!");
				else
					System.out.println("This contact doesn't exist!!");
			        }
			if(i==4){
                                c1.Array_to_file();
				break;}
	}while(true);
    }    
}