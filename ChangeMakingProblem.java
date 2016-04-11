/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changemakingproblem;

import java.util.Scanner;

/**
 *
 * @author Samra
 */
public class ChangeMakingProblem {


    
    /* Greedy Algorithm */
    public static int greedy(int amount, int count){
        
        if(amount==0)               //checking if all the amount is changed
            return count;
        
        // starting from highest amount of coin
        
        if(amount>=25){                           
            count = greedy(amount-25, ++count);     // calling function for amount-25
        }
        else if(amount>=10){
            count = greedy(amount-10, ++count);     // calling function for amount-10
        }
        else if(amount>=5){
            count = greedy(amount-5, ++count);      // calling function for amount-5
        }
        else if(amount>=1){
            count = greedy(amount-1, ++count);      // calling function for amount-1
        }
    
        return count;                   // returning the number of coins used for the change.
    }
  
    
    /* Dynamic Algorithm */
    
    public static int dynamicProgram(int[] d, int amount) {

       int[] a = new int[amount+1];
       
       
       a[0]=0;                                  // no coins are needed for 0 amount
       
       for(int i = 1; i <= amount; i++){        //initializing array with max value
           a[i] = Integer.MAX_VALUE;
       }
       
       for(int i = 1; i <= amount; i++){
           for(int j = 0; j < d.length; j++){
               if((i >= d[j])&& (a[i-d[j]]+1 < a[i])){ // checks: 1- if coin value is less than amount
                                                       //         2- previous value was smaller
                   a[i] = a[i-d[j]]+1;                 //save the smaller value
               }
           }
       }
       return a[amount];                        // returning the number of coins used for the change.

    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount of money you want to change:");        // taking input
        int amount = s.nextInt();
        int dm[] = {1,5,10,25}; 
        
        int coins_used = greedy(amount,0);                                      // calling method
        System.out.println("\nNumber of coins used by Greedy Algorithm: "+coins_used);
        
        
        coins_used = dynamicProgram(dm,amount);                                 // calling method
        System.out.println("Number of coins used by Dynamic Programming: "+coins_used);
        
    }
    
}
