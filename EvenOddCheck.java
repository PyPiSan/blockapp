package blockapp;

import java.util.Scanner;

public class EvenOddCheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = input.nextInt();

        if (number%2 ==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }

    }
}