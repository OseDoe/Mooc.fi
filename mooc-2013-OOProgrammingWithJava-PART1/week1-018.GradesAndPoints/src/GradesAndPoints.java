
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());
        String result = "";

        if ( grade >= 0 && grade < 30 ) {
            result = "failed";
        } else if ( grade >= 30 && grade < 35 ) {
            result = "1";
        } else if ( grade >= 35 && grade < 40 ) {
            result = "2";
        } else if ( grade >= 40 && grade < 45 ) {
            result = "3";
        } else if ( grade >= 45 && grade < 50 ) {
            result = "4";
        } else if ( grade >= 50 && grade <= 60) {
            result = "5";
        }

        System.out.println("Grade: " + result);

    }
}
