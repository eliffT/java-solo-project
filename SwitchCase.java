import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 0 to 100: ");
        byte grade = sc.nextByte();

        switch (grade / 10){
            case 10:
            case 9:
                System.out.println("Letter Grade : A " );
                break;
            case 8:
                System.out.println("Letter Grade: B ");
                break;
            case 7:
                System.out.println("Letter Grade: C ");
                break;
            case 6:
                System.out.println("Letter Grade: D ");
                break;
            default:
                System.out.println("Letter Grade: F ");
                break;
        }
        sc.close();
    }
}
