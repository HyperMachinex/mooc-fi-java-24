
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int step = 0, sum = 0;
        while(true){
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());
            if(num1 == 0){
                break;
            }
            sum+=num1;
            step++;
        }
        System.out.println("Average of the numbers: " + ((double)sum / step));
    }
}
