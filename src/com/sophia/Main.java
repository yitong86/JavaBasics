package com.sophia;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstName = "yitong";
        String lastName = "Jiang";
        String fullName = "yitong Jiang";
        //System.out.println(fullName);
        //creatFullName("yitong","jiang");
       // System.out.println(firstName + " " + lastName);
        NameGenerator fullName1 = new NameGenerator();
        fullName1.generateFullName("yitong","jiang");

    }
    public static String creatFullName(String firstName,String lastName) {
         return firstName + " " + lastName;
    }
}