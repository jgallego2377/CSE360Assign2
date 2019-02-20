package cse360assign2;

public class Assignment2
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator(); 
		
		calc.add(4);
		calc.subtract(2);
		calc.multiply(5);
		calc.multiply(2);
		calc.add(5);
		calc.divide(5);
		calc.divide(5);
		calc.divide(5);
		
		System.out.println(calc.getHistory());
		System.out.println(calc.getTotal());
	}
}