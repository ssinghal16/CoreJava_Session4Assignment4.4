//Write a program to find the aliquot sum of a given number. 

package com.acadgild.assignment;

public class Assignment4 {

    int sum = 0;
     
    public int getNumberSum(int number){
         
        if(number == 0){
            return sum;
        } else {
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }
     
    public static void main(String a[]){
    	Assignment4 mns = new Assignment4();
        System.out.println("Sum is: "+mns.getNumberSum(12));
    }

}
