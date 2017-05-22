/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingthelargestvalueinanarray;

import java.util.Random;


/**
 *
 * @author kendrabooker
 */
public class FindingTheLargestValueInAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[10];
        int largestVal = 0;
        System.out.print("Array: ");
        
       
        for(int i=0; i<10; i++){
        
            int num = 1 + r.nextInt(100);
            
            arr[i] = num;
            if(i >= 0){
            
                System.out.print(arr[i] + " ");
            }
        }
        
        for(int i=0; i < arr.length; i++){
        
            
            if(largestVal < arr[i]){
            
                largestVal = arr[i];
                
            }
        }
        
         System.out.println();
         System.out.println(largestVal + " is the largest value in the array");
         
         
         
             
         
    }
    
}
