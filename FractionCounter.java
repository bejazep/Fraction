/**
 * FractionCounter class
 * 
 * Used to store a fraction count in a list.
 */
public class FractionCounter
{
	private Fraction theFraction;
	private int counter;
	
	/**
	 * Single argument constructor
	 *
	 * @param A fraction object to count
	 */
	public FractionCounter(Fraction f)
	{
		theFraction = f;
		counter = 1;
	}
	
	/**
	 * Compare and increment
	 * 
	 * Used to see if the new fraction passed into the function is the same as
	 * the Fraction stored in this object, if so increment the counter by one
	 * and return true.
	 *
	 * @param newFraction A fraction object to compare
	 * @return True if the fraction equals the counter's fraction
	 */
	public boolean compareAndIncrement(Fraction newFraction)
	{
		if (theFraction.equals(newFraction))
		{
			counter++;
			return true;
		}
		else return false;
	}
	
	/**
	 * To string
	 * 
	 * Returns a string that prints out the fraction and number of occurances.
	 *
	 * @return A string of the fraction and count
	 */
	@Override
	public String toString()
	{
		return theFraction + " has a count of " + counter;
	}
}
