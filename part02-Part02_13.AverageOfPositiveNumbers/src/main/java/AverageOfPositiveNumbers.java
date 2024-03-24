
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, step = 0;
        while(true){
            int num1 = Integer.valueOf(scanner.nextLine());
            if(num1 == 0){
                break;
            }else if(num1 > 0){
                sum+=num1;
                step++;
            }
        }
        if(step == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(((double)sum / step));
        }
    }
}
