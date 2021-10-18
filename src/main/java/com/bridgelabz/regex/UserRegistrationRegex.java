package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * Program on User Registration Using Regex
 *
 * @author : Anji Rah Ardula
 * @version : 16.0
 * @since : 18/10/2021
 */

public class UserRegistrationRegex extends UserDetails{
    static Scanner scanner = new Scanner(System.in);
    static String firstName;

    public static void main(String[] args) {
        userFirstName();

    }
    public static void userFirstName() {
        System.out.println("Enter your First Name");
        firstName = scanner.next();
        UserDetails.firstname(firstName);
    }

}
