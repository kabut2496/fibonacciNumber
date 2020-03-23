/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.number;

import javax.swing.JOptionPane;

/**
 *
 * @author Dean
 */
public class FibonacciNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//initializing the variables

        String getNum;
        int num;
        
//getting the term of the Fibonacci term they want

        getNum = JOptionPane.showInputDialog("the first nine numbers in the fibonacci sequaens are:"
                + "\n 1,1,2,3,5,8,13,21,34"
                + "\n Enter the fibonacci term that you would like to see");
        num=Integer.parseInt(getNum);
    
//outputting there term
        
        System.out.println("the fibonacci term you asked for is "+ fibonacci(num));
    }

   public static int fibonacci (int n) {
//creating the Fibonacci variables
       int t1,t2;
        t1=0;
        t2=1;
//creating the Fibonacci output       
       if (n == 0) {
            return 0;
        }else if(n ==1){
            return 1;
        } else {
           
           for(int i=2;i<=n;i++){
            int sum = t1+t2;
            t1=t2;
            t2=sum;
           }
           return (t2);
        }
   }
    
}
