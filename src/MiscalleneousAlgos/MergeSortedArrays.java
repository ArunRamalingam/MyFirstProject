/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscalleneousAlgos;

/**
 * This program merges two sorted arrays
 * @author aramalingam
 */
public class MergeSortedArrays {
    
    public static void main(String[] args) {
        int[] sortedArray1 = {4,6,9,45,67,67,145};
        int[] sortedArray2 = {23,26,45,56,76,98,167};
        int[] mergedArray = new int[sortedArray1.length + sortedArray2.length];
        int i=0,j=0,k=0;
        while(i < sortedArray1.length && j < sortedArray2.length ){
            if(sortedArray1[i] < sortedArray2[j]) {
                mergedArray[k++] = sortedArray1[i++];
            } else {
                 mergedArray[k++] = sortedArray2[j++];
            }
        }
        while(i < sortedArray1.length){
            mergedArray[k++] = sortedArray1[i++];
        }
        while(j < sortedArray2.length){
            mergedArray[k++] = sortedArray2[j++];
        }
        for(int g=0; g<mergedArray.length; g++){
            System.out.print(" " + mergedArray[g] + " ");
        }
    }
}