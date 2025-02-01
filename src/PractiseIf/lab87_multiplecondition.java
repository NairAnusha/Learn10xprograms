package PractiseIf;

import java.util.Scanner;

public class lab87_multiplecondition {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    {
System.out.println("enter number1");
int num1=sc.nextInt();
        System.out.println("enter number 2");
        int num2=sc.nextInt();{
            if(num1>num2) {
                System.out.println("numb1 is greater");

            }
            else if(num2>num1){
                System.out.println("numb2 is greater");
            }
            else {
                System.out.println("both are equal");
            }
    }
    }
}}
