
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inp;
        System.out.println("Password?");
        inp = scan.nextLine();
        if(inp.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }
        // Write your program here 
    }
}
