import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Singleton x = Singleton.getInstance();

        Scanner user = new Scanner(System.in);
        System.out.println("please enter your name");

        x.addText(user.nextLine());

        System.out.println("please enter your age");
        Singleton.addText(user.nextLine());

        x.addText(user.nextLine());
    }
}