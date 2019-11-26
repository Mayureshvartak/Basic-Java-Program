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
public class main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two values: ");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        System.out.println("Enter the operator: ");
        System.out.println("1.Add\n2.Sub\n3.Multiply\n ");
        int n=scan.nextInt();
        System.out.println("Your choice of operation is: \t" +n);
        
        Functions f=new Functions();
        switch(n){
            case 1:double result =f.add(a, b);
              
            break;
            case 2:f.sub(a, b);break;
            case 3:f.multiply(a, b);break;
            default:System.out.println("Invalid input");
            
        }
    }
}
