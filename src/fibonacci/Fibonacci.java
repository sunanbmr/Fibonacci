/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author 
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fib(9);
    }
    
    static void fib(int n) { 
       int a = 1;
       int b = 1;
       System.out.print(a + " ");
       System.out.print(b + " ");
       for(int i = 2; i<n; i++){
           int res = a + b;
           System.out.print(res + " ");
           //int temp = b;
           a = b;
           b = res;
       }
       System.out.print("\n");
   }
    
}
