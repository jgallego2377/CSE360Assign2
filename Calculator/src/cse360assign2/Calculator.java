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

public class Calculator {

	private int total; //creates variable total for future calculations
	
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
	}
	
	/**
	 * subtract method subtracts value from total
	 * @param int value
	 */
	public void subtract (int value) {
		//sets the value in total equal to total minus the value
		total = total - value;
	}
	
	/**
	 * multiply method multiplies value and total
	 * @param int value
	 */
	public void multiply (int value) {
		//sets the value in total equal to total times the value
		total = total * value; 
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
	}
	
	/**
	 * getHistory method returns a history of all actions
	 * @return string of all calculations done
	 */
	public String getHistory () {
		return "";
	}
}