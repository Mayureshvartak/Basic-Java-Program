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
public class Fibo {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.println("Enter the length of Fibonnaci:");
        Scanner n=new Scanner(System.in);
        int m=n.nextInt();
        for(int i=0;i<=m;i++){
            System.out.println(a);
           c=a+b;
           a=b;
           b=c;
           
        }
        
        
    }
}
