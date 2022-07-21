
import java.util.Scanner;
import java.util.ArrayList;
public class Phonebook {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        ArrayList<String> contactName = new ArrayList<>();
        ArrayList<String> contactAddress = new ArrayList<>();
        ArrayList<String> contactNumber = new ArrayList <>();
        ArrayList<String> contactEmail = new ArrayList <> ();

        String exit = "";

        while (exit.isEmpty()){
            System.out.print("Enter contact name: ");
            String name = input.nextLine();
            contactName.add(name);

            System.out.print("Enter contact address: ");
            String address = input.nextLine();
            contactAddress.add(address);

            System.out.print("Enter contact number: ");
            String number = input.nextLine();
            contactNumber.add(number);

            System.out.print("Enter contact email: ");
            String email = input.nextLine();
            contactEmail.add(email);

            System.out.print("Enter x to exit: ");
            exit = input.nextLine();
        }

        System.out.println("Name: " + contactName  + "\n" + contactAddress + "\n" + contactNumber + "\n" + contactEmail );
    }
}
