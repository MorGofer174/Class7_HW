import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Singleton x = Singleton.getInstance();

        Scanner user = new Scanner(System.in);
        System.out.println("please enter your name");
        String userName = user.nextLine();
        x.addText(userName);


        System.out.println("please enter your age");
        int age = user.nextInt();
        x.addText(String.valueOf(age));


        System.out.println("please enter your address");
        String userAddress = user.nextLine();
        x.addText(userAddress);


        System.out.println("please enter your phone number");
        String userPhoneNum = user.nextLine();
        x.addText(userPhoneNum);

        user.close();

    }
}