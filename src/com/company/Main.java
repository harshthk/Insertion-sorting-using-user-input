package com.company;

import java.util.Scanner;

public class Main {
    public static void printArray(int arr[]){
        // loop for output
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of your array:- ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        // loop for input
        for(int i=0; i<size; i++){
            System.out.print("Enter the value of " + i + " :-");
            arr[i] = scan.nextInt();
        }
        // insertion sorting
        for(int i=1; i< arr.length; i++){
            int sort =arr[i];
            int j = i-1;
            while(j>=0 && sort<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] =sort;
        }

        printArray(arr);
    }
}
