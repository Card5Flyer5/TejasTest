/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tejastest;

import java.util.Scanner;

/**
 *
 * @author shaht_000
 */
public class TejasTest {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        // TODO code application logic here
        int a;
        int b;
        int x;
        int y;
        int f;
        int lcm; //least common multiple
        int gcf; //greatest common factor
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 2 integers");
        x=scanner.nextInt();
        y=scanner.nextInt();
        
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        
        //Set x and y to be a positive integer.
        
        a = x;
        b = y;
        
        //Assigns a to x, b to y.
        
        while (b!= 0)
        {
            f = b;
            b = a % b;
            a = f;
            
            System.out.println();
            System.out.println("f= " + f);
            System.out.println("b= " + b);
            System.out.println("a= " + a);
            
            //Continues loop until b becomes 0, hoping to find the greatest common divisor.
        }
        
        gcf = a; //a is greatest common factor when b becomes 0
        lcm = (x*y)/gcf;
        //Formula to find the least common multiple. 
        
        System.out.println("Greatest common divisor of " + x + " and " + y + " = " +gcf);
        System.out.println("Least common multiple of " + x + " and " + y + " = " +lcm);
    }
    
}
