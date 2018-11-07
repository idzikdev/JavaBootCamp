package Kolekcje;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by operator on 01.07.2017.
 */
public class BinaryNumber {
    public static String toBinaryString(int number){
        Stack<Integer> stack=new Stack<>();
        int myNumber=number;
        while(myNumber!=0){
            stack.push(myNumber%2);
            myNumber/=2;
        }
        StringBuilder binaryNumber=new StringBuilder();
        while(!stack.isEmpty()){
            binaryNumber.append(stack.pop());
        }
        return binaryNumber.toString();
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        int liczba=new Scanner(System.in).nextInt();
        System.out.println(toBinaryString(liczba));
    }
}
