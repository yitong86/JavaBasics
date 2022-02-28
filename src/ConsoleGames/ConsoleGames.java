package ConsoleGames;

import java.util.Scanner;
import java.util.*;
public class ConsoleGames {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the program! ");
//        String firstName = firstName();
//        //String firstName = scanner.next();
//        System.out.println("Thank you! Hello," +firstName);
//        System.out.println("Now.please enter your last name: ");
//        String lastName = scanner.next();
//        System.out.println("Full name is :" + firstName + lastName);
//            System.out.println("Input a sentence");
//            String sentence = scanner.nextLine();//return a whole sentence
//            System.out.println("You've input: " + sentence);
        while (true) {
            //if scanner.nextInte() == 2 break;
            //our secret num will be 533
            System.out.println("Guess a number 0-1000");
            int guess = scanner.nextInt();
            if (guess == 533){
                System.out.println("Great job! You guessed the secret nuber:)Game ending...");
                break;
            } else if (guess >= 450 && guess <= 600) {
                System.out.println("Getting warmer");
            }
            System.out.println("I am sorry!Not the right number");
        }


    }
    public static String firstName() {
        System.out.println("Please enter your first name: ");
        return scanner.next();
    }

}
