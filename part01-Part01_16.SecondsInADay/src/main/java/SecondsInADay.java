
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        System.out.println("How many days would you like to convert to seconds?");
        day = Integer.valueOf(scanner.nextLine());
        System.out.println(day * 24 * 60 * 60);
        // Write your program here

    }
}
