/*
 * Created by: Michael Balcerzak
 * Created on: 15-Sep-2016
 * Created for: ICS4U
 * Weekly Assignment – #1
 * This program display the highest number of the most chartures in a string
*/

import java.util.Scanner;

public class StringManipulator {

	public static int MaxRun(String str)
	{
		//all the alphabet
  		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','o','m','p','q','r','s','t','u','v','w','x','z'};
  		
  		//count each letter
  		int[] charatureCount = new int[24];
  		
  		for (int counter = 0; counter <= 23; counter++)
  		{
  			for (int counter2 = 0; counter2<str.length(); counter2 ++)
  			{
  				if ( str.charAt(counter2) == alphabet[counter])
  				{
  					charatureCount[counter] ++ ;
  				}
  			}
  		}
  		
  		//find the max value
  		int maxValue = charatureCount[0];
  		
  		for  (int counter3 = 1; counter3 < charatureCount.length; counter3++)
  		{
  			if (charatureCount[counter3] > maxValue)
  			{
  				maxValue = charatureCount[counter3];
  			}
  		}
		
		return maxValue;
	}
	
	public static void main(String[] args) {
		// Create scanner object
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.println("write any sentence to find the highest number of the most chartures in a string");		
        String string = input.nextLine();
        
        //procedure
        int maxValue = MaxRun(string);
        
        
        //output
        System.out.println("the max value is " + maxValue);
	}

}
