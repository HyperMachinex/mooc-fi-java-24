
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, step = 0;
        while(true){
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());
            if(num1 == 0){
                break;
            }
            step++;
            sum +=num1;
        }
        System.out.println("Number of numbers: " + step);
        System.out.println("Sum of the numbers: " + sum);
    }
}
