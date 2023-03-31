import java.util.ArrayList;
import java.util.Scanner;

public  class RealPassword5 {

        public static void main(String args[]) {
                Scanner input = new Scanner(System.in);
                for (int i = 0; i < 5; i++) {
                        System.out.print("What is the password: ");
                        String guess = input.nextLine();
                        if (guess.equals("asxy")) {
                                System.out.println("login correct");
                        }
                        else {
                                System.out.println("login incorrect");
                        }
                }
        }
}

