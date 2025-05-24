import javax.xml.transform.Source;
import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name information: ");
        String name = sc.nextLine();
        System.out.println("Enter your age information: ");
        byte age = sc.nextByte();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);

        sc.close();
    }
}
