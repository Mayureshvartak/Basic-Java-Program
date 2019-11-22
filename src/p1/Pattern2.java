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
public class Pattern2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
            System.out.println("Enter the number of rows: ");
            String m=sc.next();
            //String m="Atos-Syntel";
         for (int i = 0; i <= m.length(); i++) 
         { 
           //int alphabet = 65; 
             
           for (int j = m.length(); j > i; j--)
                {
                   System.out.print(" ");
                }
        for (int k = 0; k < i; k++)
        {
            System.out.print(m.charAt(k) + " ");
          
                   
        }
        System.out.println();
    }
    }
    
}
