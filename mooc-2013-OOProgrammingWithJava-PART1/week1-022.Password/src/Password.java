
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String correctMessage = "Right!";
        String wrongMessage = "Wrong!";

        String str = "";
        while ( true ) {
            System.out.print("Type the password: ");
            str = reader.nextLine();
            if (str.equals(password)) {
                System.out.println(correctMessage + "\n\nThe secret is: jryy qbar!");
                break;
            }
            System.out.println(wrongMessage);
        }
    }
}
