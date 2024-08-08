package _18_Custom_Exceptions;
// Custom Exception = User defined exception derived from Exception class.
//                    Used to customize the exception according to users need.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println("An error occurred: "+e);
        }
    }

    public static void checkAge(int age) throws AgeException{
        if(age < 18){
            throw new AgeException("\n"+"You must be 18+ to sign up.");
        }
        else{
            System.out.println("You are signed up.");
        }
    }
}