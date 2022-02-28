package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    byte age = age();
        System.out.println(age);
    }

    public static byte age() {
        System.out.println("How old are you?");
        byte age = scanner.nextByte();
        System.out.println("You are " + age + ".\n");
        scanner.nextLine();
        return age;
    }

    public static long number() {
        System.out.println("What's your phone number？");
        long number = scanner.nextLong();
        System.out.println("Your phone number is  " + number + ".\n");
        scanner.nextLine();
        return number;
    }

    public static String name() {
        System.out.println("What's your name?");
        String name = scanner.next();
        System.out.println("Your name is " + name + ".\n");
        return name;
    }

    public static short id() {
        System.out.println("What's your ID number?");
        short id = scanner.nextShort();
        System.out.println("Your ID is " + id + ".\n");
        scanner.nextLine();
        return id;
    }

    public static Integer setHouseNumber() {
        System.out.println("What's your house number?");
        int houseNumber = scanner.nextInt();
        System.out.println("Your house number is  " + houseNumber + ".\n");
        scanner.nextLine();
        return houseNumber;
    }

    public static double setNumberAdding() {
        System.out.println("What's 1.1 plus 2.2 ? ");
        double numberAdding = scanner.nextDouble();
        if (numberAdding == 3.3) {
            System.out.println("Total is  " + numberAdding + ".\n");
        } else {
            System.out.println("Your total is wrong.");
            scanner.nextLine();
        }
        return numberAdding;
    }
    public static float setNumberFloat() {
        System.out.println("What's 2.22 plus 3.33 ?");
        float numberFloat = scanner.nextFloat();
        if(numberFloat == 5.55) {
            System.out.println("Total is  " + numberFloat + ".\n");
        }else{
            System.out.println("Your answer is wrong.");
            scanner.nextLine();
        }

        return numberFloat;
    }

    public static boolean setSex() {
        System.out.println("Are you a girl,true or false?");
        boolean sex = scanner.nextBoolean();
        if (sex == true) {
            System.out.println("True");
            return sex;
        } else {
            System.out.println("False");
            scanner.nextLine();
            return sex;
        }

    }
}
