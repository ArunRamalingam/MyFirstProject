/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscalleneousAlgos;

/**
 * This program finds the max consequent numbers given an array of integers
 * For example given an array of [2,2,3,4,1,2,3,4,4,3,2,3,1,2,3,4,5,6,1,2,4,3,2,8,9] the program should output 123456
 * @author aramalingam
 */
public class MaxSequence {
    
    public static void main(String[] args) {
        int[] inputArray = {2,2,3,4,1,2,3,4,4,3,2,3,1,2,3,4,5,6,1,2,4,3,2,8,9};
        int counter = 1;
        int maxIndex = 0;
        int maxCounter =1;
        for(int i=0; i <inputArray.length-1; i++){        
           if(inputArray[i+1] == inputArray[i] + 1 ) {  
               counter++;
               if(counter> maxCounter){
                   maxCounter = counter;
                   maxIndex = i+1;
               }
           } else {
               counter = 1;         
           }
        }
        maxIndex = maxIndex - maxCounter+1;          
        System.out.println("maximum sequnce is " + maxCounter + " elements starting from index " +(maxIndex) );
        for(int j = maxIndex; j < maxIndex+maxCounter; j++){
            System.out.print (inputArray[j]);
        }
    }
}