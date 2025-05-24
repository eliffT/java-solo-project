import java.util.Scanner;

public class ArithmeticOperations {

    public static float sum(float num1, float num2){
        return num1 + num2;
    }
    public static float subtraction(float num1, float num2){
        return num1 - num2;
    }
    public static float divide(float num1, float num2){
        if(num2==0){
            System.out.println("You cannot divide by 0");
            return Float.NaN;
        }
        return num1 / num2;
    }
    public static float multiply(float num1, float num2){
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        float number1 = sc.nextFloat();
        System.out.println("Enter a second number: ");
        float number2 = sc.nextFloat();

        System.out.println("Sum Result: " + sum(number1, number2));
        System.out.println("Subtraction Result: " + subtraction(number1, number2));
        System.out.println("Divide Result: " + divide(number1, number2));
        System.out.println("Multiply Result: " + multiply(number1, number2));

    }
}
