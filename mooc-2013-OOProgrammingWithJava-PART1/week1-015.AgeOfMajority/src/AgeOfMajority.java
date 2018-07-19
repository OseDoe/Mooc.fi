
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        String adultAge = "You have reached the age of majority!";
        String underAge = "You have not reached the age of majority yet!";

        String result = ( age >= 18 ) ? adultAge : underAge;
        System.out.println(result);
    }
}
