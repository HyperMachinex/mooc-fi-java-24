
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        System.out.println("How old are you?");
        num1 = Integer.valueOf(scan.nextLine());
        if(num1 >= 18){
            System.out.println("You are an adult");
        } else{
            System.out.println("You are not an adult");
        }
        // Write your program here 
    }
}
