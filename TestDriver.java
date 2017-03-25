public class TestDriver
{
	public static void main(String[] args)
	{
		testFraction();
	}
	
	public static void testFraction()
	{
		System.out.print("Testing Fraction class ");
		int fails = 0;
		Fraction a = new Fraction(2,7);
		// test print
		try
		{
			a = new Fraction(1,2);
			assert a.toString().contains("1");
			assert a.toString().contains("2");
			System.out.print(".");
		}
		catch (Throwable e)
		{
			System.out.println("\n - Failed: " + e + ", printed: " 
				+ a.toString());
			fails++;
		}
		// test reduce
		try
		{
			a = new Fraction(4,6);	// should reduce to 2/3
			assert a.toString().contains("2");
			assert a.toString().contains("3");
			System.out.print(".");
		}
		catch (Throwable e)
		{
			System.out.println("\n - Failed: " + e + ", printed: " 
				+ a.toString());
			fails++;
		}
		// test divide negative by negative
		try
		{
			a = new Fraction(-3,-4);	// should change to positive
			assert a.toString().contains("3");
			assert a.toString().contains("4");
			assert !(a.toString().contains("-"));
			System.out.print(".");
		}
		catch (Throwable e)
		{
			System.out.println("\n - Failed: " + e + ", printed: " 
				+ a.toString());
			fails++;
		}
		// test divide by zero
		try
		{
			a = new Fraction(5,0);	// should throw exception
			System.out.println("\n - Failed: no exception thrown when dividing by zero");
			fails++;
		}
		catch (Throwable e)
		{
			System.out.print(".");
		}
		
		if (fails == 0)
		{
			System.out.println(" passed all tests");
		}
	}
}
