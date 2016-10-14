package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testUnknownNumbers() {
		assertEquals(8, Calculator.add("2,2,2,2"));
	}	

	@Test
	public void testNewlineWithNumbers() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testNegativeNumbers() {
		try{
			assertEquals(5, Calculator.add("2,-4,3,-5"));
		}
		catch (IllegalArgumentException i){
			System.out.println(i);
		}
	}

	@Test
	public void testIgnoredNumbers() {
		assertEquals(2, Calculator.add("1001,2"));
	}	
}