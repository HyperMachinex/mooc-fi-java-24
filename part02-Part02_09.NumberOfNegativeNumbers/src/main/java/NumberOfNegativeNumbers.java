
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int step = 0;
        while(true){
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());
            if(num1 == 0){
                break;
            }else if(num1 < 0){
                step++;
            }
        }
        System.out.println("Number of negative numbers: " + step);
    }
}
