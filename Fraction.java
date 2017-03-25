/**
 * Fraction class
 *
 * A simple class that will hold fraction values in the most reduced form.
 *
 * @author Denise Moran <morandy@uw.edu>
 */
public class Fraction
{
	private int num, denom; 	// instance variables
	
	/**
	 * Empty constructor
	 *
	 * Creates a fraction object set to 1/1.
	 */
	public Fraction()
	{
		num = 1;
		denom = 1;
	}
	
	/**
	 * 2 argument constructor
	 *
	 * Creates a fraction object and reduces the values by the greatest common
	 * divisor.
	 *
	 * @param n Numerator input value
	 * @param d Denominator input value
	 */
	public Fraction(int n, int d)
	{
		setFraction(n,d);
	}
	
	/**
	 * Get numerator
	 *
	 * Returns the numerator value of the calling fraction.
	 *
	 * @return An integer representing the numerator value
	 */
	public int getNumerator()
	{
		return num;
	}
	
	/**
	 * Get denominator
	 *
	 * Returns the denominator value of the calling fraction.
	 *
	 * @return An integer representing the denominator value
	 */
	public int getDenominator()
	{
		return denom;
	}
	
	/**
	 * Set fraction values
	 * 
	 * Changes the numerator and denominator values to the input arguments.
	 * 
	 * @param n Numerator input value
	 * @param d Denominator input value
	 */
	public void setFraction(int n, int d)
	{
		if (d == 0)
		{
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		if (d < 0)
		{
			d *= -1;
			n *= -1;
		}
		num = n;
		denom = d;
		reduce();
	}
	
	/**
	 * Private method that simplifies the fraction values as low as possible.
	 */
	private void reduce()
	{
		int divisor = gcd(num,denom);	// get greatest common divisor
		num /= divisor;
		denom /= divisor;
	}
	
	/**
	 * Private method that returns the greatest common divisor between the two
	 * input arguments.
	 */
	private int gcd(int a, int b)
	{
		if (b == 0)
		{
			return a;				// found gcd if remainder is 0
		}
		else
		{
			return gcd(b, a % b);	// search for gcd if remainder is != 0
		}
	}
	
	/**
	 * Equals test
	 * 
	 * Tests if the argument fraction is equal to the calling fraction. Returns
	 * true if the numerator and denominator values are equal.
	 * 
	 * @param other A fraction object to compare to
	 * @return True if the fractions are equal, false otherwise
	 */
	public boolean equals(Fraction other)
	{
		other.reduce();	// make sure the other fraction is reduced
		if (other instanceof Fraction)
		{
			if (num == other.getNumerator() && denom == other.getDenominator())
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * To string
	 * 
	 * The string representation of the fraction. Overrides the Object method
	 * toString() so you can print the variable name.
	 *
	 * @return A string representing the fraction in "A/B" format
	 */
	@Override
	public String toString()
	{
		return num + "/" + denom;
	}
}

