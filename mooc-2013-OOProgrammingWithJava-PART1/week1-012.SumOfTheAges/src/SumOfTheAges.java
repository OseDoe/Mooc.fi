
import javafx.print.JobSettings;

import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // User 1
        System.out.print("Type your name: ");
        String nameOne = reader.nextLine();
        System.out.print("Type your age: ");
        int ageOne = Integer.parseInt(reader.nextLine());
        System.out.println("");
        // User 2
        System.out.print("Type your name: ");
        String nameTwo = reader.nextLine();
        System.out.print("Type your age: ");
        int ageTwo = Integer.parseInt(reader.nextLine());
        // Sum of ages
        int sum = ageOne + ageTwo;
        System.out.println(nameOne + " and " + nameTwo + " are " + String.valueOf(sum) + " years old in total.");
    }
}
