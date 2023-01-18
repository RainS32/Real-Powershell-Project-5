import java.util.ArrayList;
import java.util.Scanner;

public class password1 {

        public static String guess() {

                Scanner input = new Scanner(System.in);
                System.out.print("What is the password: ");
                String guess = input.nextLine();

                return guess;
        }

        public static void main(String args[]) {
		//String list = "abcdefghijklmnopqrstuvwxyz";
			//int rand = (int)((Math.random() * list.length())); String list = 
			//"abcdefghijklmnopqrstuvwxyz"; char check = list.charAt(rand); int rand = 
			//(int)((Math.random() * list.length())); String pw = "" + check; char check = 
			//list.charAt(rand);
		//String pw = "" + check;
		String pw = "z";

                while (!(guess().equals(pw))) {
			System.out.println("login incorrect");
		}
		System.out.println("login correct");
	} 
}
