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
public class Main {
    public static void main(String[] args) {
       int r,sum=0,temp;
       //int c;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter Value: ");
        int a=n.nextInt();
        temp=a;
        while(a>0){
            r=a%10;
            sum=sum*10+r;
            //c=r*r*r;
            //sum=sum+c;
            a=a/10;
        }
        a=temp;
        if(a==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
        
      
    }
}
