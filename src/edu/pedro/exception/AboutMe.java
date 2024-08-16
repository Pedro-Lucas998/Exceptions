package edu.pedro.exception;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("What's your name?");
            String name = input.nextLine();

            System.out.println("How old are you?");
            int age = input.nextInt();

            System.out.println("How tall are you?");
            double height = input.nextDouble();

            System.out.println("Your name is " + name + " and you are " + age + " years old");
            System.out.println(" and your height is " + height);
        }
        catch (java.util.InputMismatchException e){
            System.err.println("A idade deve ser um número inteiro e a altura deve ser, por exemplo: 1.80");
        }
    }
}