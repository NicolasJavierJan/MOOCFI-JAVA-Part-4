
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.print("First Name: ");
            String fName = scanner.nextLine();
            
            if (fName.isEmpty()){
                break;
            }
            
            System.out.print("Last name: ");
            String lName = scanner.nextLine();
            
            System.out.print("Identification Number: ");
            String idNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(fName, lName, idNumber));
        }
        System.out.println("");
        for (PersonalInformation person: infoCollection){
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
