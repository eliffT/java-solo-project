import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number>=0){
            if(number==0){
                System.out.println("Zero");
            }else{
                System.out.println("Positive Number");
            }
        }else{
            System.out.println("Negative Number");
        }
        sc.close();
    }
}
