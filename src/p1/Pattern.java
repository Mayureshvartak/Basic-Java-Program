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
public class Pattern {
    public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any String : ");
		
                String str=scan.next();
               int k=str.length();
                          
                for(int m=0;m<k;m++){
				System.out.println(str.substring(0,m+1));                                    
                                    } 
              
    }
}
                                    
               

   
