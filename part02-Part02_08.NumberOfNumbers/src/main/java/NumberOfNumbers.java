
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int step = 0;
        while(true){
            System.out.println("Give a number:");
            int num2 = Integer.valueOf(scanner.nextLine());
            if(num2 == 0 ){
                break;
            }
            step++;
        }
        System.out.println("Number of numbers: " + step);
    }
}
