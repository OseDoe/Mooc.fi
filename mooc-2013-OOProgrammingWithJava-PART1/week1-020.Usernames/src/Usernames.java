
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String usr = reader.nextLine();
        System.out.print("Type your password: ");
        String pwd = reader.nextLine();

        if (( usr.equals("alex") && pwd.equals("mightyducks") ) || ( usr.equals("emily") && pwd.equals("cat") )) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
