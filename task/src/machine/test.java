package machine;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;  // Import the Scanner class

public class test {
    public static void app_test(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        String ending = "j";

        String input = s.nextLine();

        if (input.startsWith(ending.toUpperCase()) || input.startsWith(ending)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
