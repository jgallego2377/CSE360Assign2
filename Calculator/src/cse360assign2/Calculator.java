/*
* Author's Name: Jesus Gallego
* Class ID: 381
* Assignment Number: #2
* 
* The contents of this file (Calculator.java),
* include six methods and a Constructor. 
* Four void Methods add, subtract, multiply 
* and divide all take an integer parameter. 
* While the two getter methods, getTotal and 
* getHistory return an integer and a string, 
* respectively.
*/

package cse360assign2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	private int total; //creates variable total for future calculations
	
	/**
	 * creates a private ArrayList intHistory of type int that  
	 * stores the values used in operations
	 */
	private List<Integer> intHistory = new ArrayList<Integer>();
	
	/** 
	 * creates a private ArrayList, opHistory of type String 
	 * that stores that operations used
	 */
	private List<String> opHistory = new ArrayList<String>();	
	
	/**
	 *  All this does is set the total equal to zero for clarity 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal method returns the variable total 
	 * @return int total 
	 */
	public int getTotal () {
		//returns the current value in total
		return total;
	}
	
	/**
	 * add method adds value and total
	 * @param int value
	 */
	public void add (int value) {
		//sets the value in total equal to total plus the value
		total = total + value; 
		
		//adds the integer value used into the ArrayList intHistory
		intHistory.add(value);
		//adds the operation used into the ArrayList opHistory
		opHistory.add("+");
	}
	
	/**
	 * subtract method subtracts value from total
	 * @param int value
	 */
	public void subtract (int value) {
		//sets the value in total equal to total minus the value
		total = total - value;
		
		//adds the integer value used into the ArrayList intHistory
		intHistory.add(value);
		//adds the operation used into the ArrayList opHistory
		opHistory.add("-");
	}
	
	/**
	 * multiply method multiplies value and total
	 * @param int value
	 */
	public void multiply (int value) {
		//sets the value in total equal to total times the value
		total = total * value; 
		
		//adds the integer value used into the ArrayList intHistory
		intHistory.add(value);
		//adds the operation used into the ArrayList opHistory
		opHistory.add("*");
	}
	
	/**
	 * divide method divides total by value 
	 * @param int value
	 */
	public void divide (int value) {
		//sets the value of total = 0 if value is zero
		if (value == 0)
			total = 0;
		//sets the value of total equal to total divided by value
		else 
			total = total / value;
		
		//adds the integer value used into the ArrayList intHistory
		intHistory.add(value);
		//adds the operation used into the ArrayList opHistory
		opHistory.add("/");
	}
	
	/**
	 * getHistory method returns a history of all actions
	 * @return string of all calculations done
	 */
	public String getHistory () {
		
		/**
		 * creates and initializes a string set to 0
		 */
		String str = "0 ";
		
		/**
		 * this for loop adds the all the operations 
		 * used as well as the numerical values to the 
		 * string str. the loop runs from 0 to the size 
		 * of one of the intHistory array list
		 */
		for (int index = 0; index < intHistory.size(); index++)
		{
			//concatenates the string by adding the value at index 
			str += opHistory.get(index) + " ";
			//concatenates the string by adding the operation at index 
			str += intHistory.get(index) + " ";
		}
		
		//returns the new string with the values and operations
		return str;
	}
}