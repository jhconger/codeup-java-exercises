package contacts;
import contacts.Contacts;
import movies.Movie;
import movies.MoviesArray;
import util.Input;

import javax.swing.text.View;
import java.util.Scanner;


public class ContactsApplication {
    public static Contacts[] contacts = ContactsArray.findAll();

    public static void main(String[] args) {

        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n");
        System.out.println("1 - View contacts\n");
        System.out.println("2 - Add a new contact\n");
        System.out.println("3 - Search a contact by name\n");
        System.out.println("4 - Delete an existing contact\n");

        allContacts();

    }
