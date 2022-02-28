package ConsoleGames;

import java.util.Scanner;

public class Example {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome !");
        String passWord = passWord();
        int number = 1;

        while (true) {
            System.out.println("Please guess the password!");
            String guess = scanner.nextLine();

            if (guess.equals(passWord)) {
                System.out.println("You have successful to enter");
                break;
            }
            System.out.println("sorry your password is incorrect");


        }
    }
        public static String passWord () {
            System.out.println("Please enter your password");
            return scanner.nextLine();
        }

    }

