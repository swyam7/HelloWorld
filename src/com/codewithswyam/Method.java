package com.codewithswyam;

public class Method {
    public static void main(String[] args) {
        String message = greetUser("Swyam", "Jaiswal");
        System.out.println(message);
    }

    public static String greetUser(String FirstName, String LastName) {
        return ("Hello " + FirstName + " " + LastName);
    }
}
