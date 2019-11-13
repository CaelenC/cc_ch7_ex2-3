//HEADER
	//Program Name: Ch7Ex2Main
	//Author: Caelen Curtiss
	//Class: Cs160 Fall 2019
	//Date: 11/12/2019
	//Description: Iterative Square root estimate
package edu.cgcc.cs160;

public class Ch7Ex2Main {
		public static void main(String[] args) {
			//Variable Estimate 1
			double x1 = 0;
			
			//Variable Estimate 2
			double x2 = 0;
			
			//Initial Value
			double n = 9;
			
			//Initial estimate of Sq. root
			double g = n/2;
			
			//Allows the loop to run at least once
			//should probably be re-written as a do while
			double i = 1;
			
			//Runs code while |x1 - x2| is greater than or equal to one millionth
			while(i >= .0001) {
				
				//initial iteration of estimate
				x1 = (g + n/g) /2;
				
				
				//next iteration of the estimate
				x2 = (x1 + n/x1) /2;
				//allows g to used again in the loop to increase accuracy
				g = x2;
				
				//set i to |x1 - x2| to allow for a condition check
				//to end the loop if needed 
				i = Math.abs(x1 - x2);
				
				
			}
			
			//print most accurate check to the 4th decimal point
			System.out.printf("%.4f", x2);
		
		}

	}

	/* FOOTER
	** 3.0000
	*/