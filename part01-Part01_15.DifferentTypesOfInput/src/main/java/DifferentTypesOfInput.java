
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String a = scan.nextLine();
        System.out.println("Give an integer:");
        Integer b = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double c = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean d = Boolean.valueOf(scan.nextLine());
        //scan.close();
        System.out.println("You gave the string " + a);
        System.out.println("You gave the integer " + b);
        System.out.println("You gave the double " + c);
        System.out.println("You gave the boolean " + d);
        // Write your program here

    }
}
