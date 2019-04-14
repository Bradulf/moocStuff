
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int pickedNum;
        int number = 1;
        System.out.println("Up to what number? ");
        pickedNum = reader.nextInt();

        while(number <= pickedNum) {
            System.out.println(number++);
        }
    }
}
