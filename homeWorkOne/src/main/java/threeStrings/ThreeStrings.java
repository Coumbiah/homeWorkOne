package threeStrings;
import java.util.Scanner;
//Write a program that asks the user for three strings.
//
//Then, print out whether the first string
//concatenated to the second string is equal to the
//third string. Here are a few sample program runs:
//
//Sample Program 1:
//
//First string? pepper
//Second string? mint
//Third string? peppermint
//pepper + mint is equal to peppermint!
//Sample Program 2:
//
//First string? go
//Second string? fish
//Third string? donuts
//go + fish is not equal to donuts!

public class ThreeStrings {

    public static void main(String[] args) {
        String one = "";
        String two = "";
        String three = "";
        System.out.println("Type in 3 strings: ");
        Scanner input = new Scanner(System.in);
        one = input.nextLine();
        two = input.nextLine();
        three = input.nextLine();
        String test;
        test = one+two;
        if(test.equals(three)){
            System.out.println(one + " + " + two + " is equal to " + three);
        }
        else{
            System.out.println(one + " + " + two + " is not equal to " + three);
        }
    }
}
