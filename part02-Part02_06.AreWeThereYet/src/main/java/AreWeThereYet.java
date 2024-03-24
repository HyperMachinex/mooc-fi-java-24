
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        while(true){
            System.out.println("Give a number:");
            num1 = Integer.valueOf(scanner.nextLine());
            if(num1 == 4){
                break;
            }
        }
    }
}
