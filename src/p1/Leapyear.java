/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.Scanner;

/**
 *
 * @author Mayuresh
 */
public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Enter the year:");
        Scanner n=new Scanner(System.in);
        int m=n.nextInt();
         if (((m % 4 == 0) && (m % 100!= 0)) || (m%400 == 0)){
             System.out.println("Specified year is a leap year");
         }
         else{
         System.out.println("Specified year is not a leap year");
         }
    }
}
