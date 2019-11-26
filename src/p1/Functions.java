/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author Mayuresh
 */
public class Functions {
 int add(double a,double b){
     double result=a+b;
     System.out.println("Result: " +result);
     return 0;     
     
 }
 int sub(double a,double b){
     double result=a-b;
     if(result <0){
         System.out.println("Less than zero by:"+result);
         }else{
     System.out.println("Result: " +result);
     }
     return 0;
     
 }
 double multiply(double a,double b){
     double result=a*b;
     System.out.println("Result: " +result);
     return 0;
     
     
 }

    
    
    
    
    
}
