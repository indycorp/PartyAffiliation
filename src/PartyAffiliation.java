import java.util.Scanner;

public class PartyAffiliation {
    void main() {
        Scanner in = new Scanner(System.in);

        String choice = "";

        IO.println("Party Affiliation Menu");
        IO.println("D - Democrat");
        IO.println("R - Republican");
        IO.println("I - Independent");
        IO.print("Enter your choice: ");

        choice = in.nextLine();
        choice = choice.toUpperCase();

        if (choice.equals("D")) {
            IO.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {
            IO.println("You get a Republican Elephant.");
        } else if (choice.equals("I")) {
            IO.println("You get an Independent Person.");
        } else {
            IO.println("You get an Other.");
        }
    }
}
