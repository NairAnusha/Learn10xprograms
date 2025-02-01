package PractiseIf;

import java.util.Scanner;

public class practiseif_else {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);

        int age=sc.nextInt();

        if(age>10) {
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }

}
