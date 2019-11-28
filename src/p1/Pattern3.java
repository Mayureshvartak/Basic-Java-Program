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
public class Pattern3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
 
            System.out.println("Enter the String: ");
            String m=sc.next();
            
             
            for (int i=0; i<= m.length() ; i++)
            {
                for (int j = i; j < m.length()+1 ; j++) {
                    System.out.print(" ");
                }   
                for (int k = 1; k <= i ;k++) {
                    if( k==1 || i == m.length() || k==i ) {
                        System.out.print(m.charAt(k-1) + " ");
                          }
                    else {
                        System.out.print("  ");
                    }
                    
                }
             System.out.println();
            }
            
    }
}
