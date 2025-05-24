import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int number1 = sc.nextInt();

        System.out.println("Enter number2: ");
        int number2 = sc.nextInt();

        System.out.println("Enter number2: ");
        int number3 = sc.nextInt();

        if((number1 > number2) & (number1 > number3)){
            System.out.println("Max Value is : " + number1);
        }
        if((number2 > number1) & (number2 > number3)){
            System.out.println("Max Value is : " + number2);
        }
        if((number3 > number2) & (number3 > number1)){
            System.out.println("Max Value is : " + number3);
        }
    }
}
