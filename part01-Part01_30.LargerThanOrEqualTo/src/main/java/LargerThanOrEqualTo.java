
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Give the first number:");
        num1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        num2 = Integer.valueOf(scan.nextLine());
        if(num1 > num2){
            System.out.println("Greater number is: " + num1);
        } else if(num1 == num2){
            System.out.println("The numbers are equal!");
        } else{
            System.out.println("Greater number is: " + num2);
        }
    }
}
