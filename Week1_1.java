package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        float w=cal.nextInt();
        float h=cal.nextInt();
        float bmi=(w/(h*h));
        System.out.println("Your body mass index:"+bmi);
    }
}