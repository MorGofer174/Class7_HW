import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Singleton x = Singleton.getInstance();

//new scanner + enter name
        Scanner user = new Scanner(System.in);
        boolean h = true;
        while (h == true){
             System.out.println("please enter your name");
             String userName = user.nextLine();
             x.addText(userName);
             Alpha S = new Alpha();
        if (S.ifAlpha(userName) == false){
            System.out.println("please try again");
        user.next();
        continue;}

        }


// enter age
        boolean y = true;
        while( y == true){
              try {System.out.println("please enter your age");
                  int age = user.nextInt();
                  x.addText(String.valueOf(age));
                  user.skip("\n");
                  break;
           } catch (InputMismatchException e){
                  System.out.println("please try again");
                  user.next();
                  continue;}}

// enter address
        System.out.println("please enter your address");
        String userAddress = user.nextLine();
        x.addText(userAddress);



        System.out.println("please enter your phone number");
        String userPhoneNum = user.nextLine();
        x.addText(userPhoneNum);

        user.close();

    }


}