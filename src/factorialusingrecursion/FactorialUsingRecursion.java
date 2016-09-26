/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialusingrecursion;
import java.util.Scanner;
/**
 *
 * @author jprakash4
 */
public class FactorialUsingRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner value = new Scanner(System.in);
         System.out.println("Please Enter the number:");
        int n = value.nextInt();
         int number = calculatefactorial(n);
        System.out.println("Factorial of number "+ n +" is : " +number);
    }
        public static int calculatefactorial(int n) {
       if (n == 0) {
           return 1;
       } else {
           return n * calculatefactorial(n - 1);
       }
    }
    
}
