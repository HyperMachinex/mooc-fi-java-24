
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value;
        double x;
        System.out.println("Value of the gift?");
        value = Integer.valueOf(scan.nextLine());
        if(value < 5000){
            System.out.println("No tax!");
        } else if(value < 25000){
            x = 100 + ((value - 5000)*0.08);
            System.out.println("Tax:" + x);
        } else if(value < 55000){
            x = 1700 + ((value - 25000)*0.1);
            System.out.println("Tax:" + x);
        }else if(value < 200000){
            x = 4700 + ((value - 55000)*0.12);
            System.out.println("Tax:" + x);
        }else if(value < 1000000){
            x = 22100 + ((value - 200000)*0.15);
            System.out.println("Tax:" + x);
        }else{
            x = 142100 + ((value-1000000)*0.17);
            System.out.println("Tax:" + x);
        }
    }
}
