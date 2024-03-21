
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("How old are you?");
        age = Integer.valueOf(scan.nextLine());
        if(age <= 120 && age >= 0){
            System.out.println("OK");
        } else{
            System.out.println("Impossible!");
        }
    }
}
