
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println("Give a number:");
        year = Integer.valueOf(scan.nextLine());
        if(year < 2015) {
            System.out.println("Ancient history!");
        }
        // Write your program here
    }
}
