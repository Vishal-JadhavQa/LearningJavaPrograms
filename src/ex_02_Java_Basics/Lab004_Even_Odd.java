package ex_02_Java_Basics;

import java.util.Arrays;

public class Lab004_Even_Odd
{
    public static void main(String[] args) {
        int num = 14;
        String result = (num%2) == 0 ? "Even" : "Odd";
        System.out.println(result);
    }
}
