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
		_01_BinarySearch bs = new _01_BinarySearch();
		int[] thing = {1, 2, 3, 5, 7, 9, 32452, 235634632};
		assertEquals(3, bs.binarySearch(thing, 0, thing.length - 1, 5));
		int[] ting = {2, 5436, 346735, 4888888, 789876789};
		assertEquals(-1, bs.binarySearch(ting, 0, ting.length - 1, 23973848));
		int[] tin = {1, 2};
		assertEquals(0, bs.binarySearch(tin, 0, tin.length - 1, 1));
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		_02_InterpolationSearch is = new _02_InterpolationSearch();
		int[] thing = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
		assertEquals(3, is.interpolationSearch(thing, 4));
		int[] ting = {10, 20, 30, 40, 50, 60, 70, 80};
		assertEquals(-1, is.interpolationSearch(ting, 11));
		int[] tin = {7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98, 105};
		assertEquals(5, is.interpolationSearch(tin, 42));
		assertEquals(9, is.interpolationSearch(tin, 70));
		
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		_03_ExponentialSearch es = new _03_ExponentialSearch();
		int[] thing = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21, 23, 25, 26, 452, 3452, 3453, 3454, 3455, 4321};
		assertEquals(18, es.exponentialSearch(thing, 3455));
		int[] ting = {1, 2, 3};
		assertEquals(1, es.exponentialSearch(ting, 2));
	}
}
