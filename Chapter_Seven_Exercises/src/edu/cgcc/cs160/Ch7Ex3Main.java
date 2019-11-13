	//HEADER
	//Program Name: Ch7Ex3Main
	//Author: Caelen Curtiss
	//Class: Cs160 Fall 2019
	//Date: 11/12/2019
	//Description: Iterative power function

package edu.cgcc.cs160;

public class Ch7Ex3Main {

		public static void main(String[] args) {
			//initial number
			double num = 2;
			
			//power of the number
			int pow = 10;
			
			//number to the power of pow
			double ans = num;
			
			
			//prints the value as 1 in the case where pow = 0
					if(pow >= 0) {
					System.out.println(1.0);
					}
					
			//program is going to show all powers in order in console
			//prints num to the first power
			if(pow == 1) {
				System.out.println(num);
				}
			
			//prints num to the -1st power
			if(pow == -1) {
				System.out.println("1 / " + num);
			}
			//prints num to powers 2 through pow if applicable
			while(pow -1 > 0) {
				ans = ans * num;
				System.out.println(ans);
				--pow;
				}
			
			//prints num to powers -2 through pow if applicable
			while(pow +1 < 0) {
				ans = ans * num;
				System.out.println("1 / " + ans);
				++pow;
			}
		}
	}
	/* FOOTER
	** 1.0
	** 4.0
	** 8.0
	** 16.0
	** 32.0
	** 64.0
	** 128.0
	** 256.0
	** 512.0
	** 1024.0
	*/
