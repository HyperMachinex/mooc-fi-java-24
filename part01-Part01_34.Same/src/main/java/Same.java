
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inp, inp1;
        System.out.println("Enter the first string:");
        inp = scan.nextLine();
        System.out.println("Enter the second string:");
        inp1 = scan.nextLine();
        if(inp.equals(inp1)){
            System.out.println("Same");
        } else{
            System.out.println("Different");
        }
        // Write your program here. 
    }
}
