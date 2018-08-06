package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		_00_LinearSearch ls = new _00_LinearSearch();
		String[] thing = {"cow", "moo", "ROAR", "cookie", "food", "is", "YUMMY"};
		assertEquals(3, ls.linearSearch(thing, "cookie"));
		String[] ting = {"oiewjfoiewj", "oweifjeoiwf", "oudshoiwa", "woeijf"};
		assertEquals(-1, ls.linearSearch(ting, "om nom nom nom nom. So yummers."));
		String[] tin = {"Om", "Nom", "Cookies", "And", "Milk", "NOMNOMNOM"};
		assertEquals(5, ls.linearSearch(tin, "NOMNOMNOM"));
		assertEquals(-1,ls.linearSearch(tin, "nomnomnom"));
	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
