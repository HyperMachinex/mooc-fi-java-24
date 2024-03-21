
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        System.out.println("Give a number:");
        num1 = Integer.valueOf(scan.nextLine());
        if(num1 > 0 ){
            System.out.println("The number is positive.");
        } else{
            System.out.println("The number is not positive.");
        }
        // Write your program here
    }
}
