package Feb01_programs;

import java.util.Scanner;

public class Feb01_001number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("the number is divisible by 5");

        } else if (n%11==0)
        {
            System.out.println("the number is divisible by 11");
            if (n%11==0 && n%5==0)
        {
            System.out.println("the number is divisible by 11");
        } else
            System.out.println("the number is not divisible by neither 5 nor 11");
        }
    }
}