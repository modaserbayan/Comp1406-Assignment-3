package comp1406a3;

public class TestFind{

	/** Generate test cases for the (modified) Find class.
		* @return an array of test cases for the (modified) Find class.
		*/
	public static FindTestCase[] makeTestCases(){
		int counter = 0;
		int numberOfTestCases = 17;
		FindTestCase[] storage = new FindTestCase[numberOfTestCases];


		//Test Case 1 (no match)
		int[] target = {8};
		int[] array = {0,1,2,3,4,5,6,7};
		int expectedFind = -1;
		int[] expectedFindAgain = {0};
		FindTestCase testcase = new FindTestCase(target, array, expectedFind, expectedFindAgain);
		storage[counter] = testcase;
		counter += 1;

		//Test Case 2 (first index)
		int[] target2 = {0};
		int[] array2 = {0,1,2,3,4,5,6,7};
		int expectedFind2 = 0;
		int[] expectedFindAgain2 = {1,0};
		FindTestCase testcase2 = new FindTestCase(target2, array2, expectedFind2, expectedFindAgain2);
		storage[counter] = testcase2;
		counter += 1;

		//Test Case 3 (last index)
		int[] target3 = {7};
		int[] array3 = {0,1,2,3,4,5,6,7};
		int expectedFind3 = 7;
		int[] expectedFindAgain3 = {1,7};
		FindTestCase testcase3 = new FindTestCase(target3, array3, expectedFind3, expectedFindAgain3);
		storage[counter] = testcase3;
		counter += 1;

		//Test Case 4 (two occurences)
		int[] target4 = {2};
		int[] array4 = {0,1,2,3,4,5,6,7,2,7};
		int expectedFind4 = 8;
		int[] expectedFindAgain4 = {2,2,8};
		FindTestCase testcase4 = new FindTestCase(target4, array4, expectedFind4, expectedFindAgain4);
		storage[counter] = testcase4;
		counter += 1;

		//Test Case 5 (two in target)
		int[] target5 = {2,3};
		int[] array5 = {0,1,2,3,4,5,6,7,2,7};
		int expectedFind5 = 2;
		int[] expectedFindAgain5 = {1,2};
		FindTestCase testcase5 = new FindTestCase(target5, array5, expectedFind5, expectedFindAgain5);
		storage[counter] = testcase5;
		counter += 1;

		//Test Case 6 (two in target, two occurences)
		int[] target6 = {2,3};
		int[] array6 = {0,1,2,3,4,5,6,7,2,7,4,5,3,3,4,2,3};
		int expectedFind6 = 15;
		int[] expectedFindAgain6 = {2,2,15};
		FindTestCase testcase6 = new FindTestCase(target6, array6, expectedFind6, expectedFindAgain6);
		storage[counter] = testcase6;
		counter += 1;

		//Test Case 7 (target same as array)
		int[] target7 = {0,1,2,3,4,5,6,7,2,7,4,5,3,3,4,2,3};
		int[] array7 = {0,1,2,3,4,5,6,7,2,7,4,5,3,3,4,2,3};
		int expectedFind7 = 0;
		int[] expectedFindAgain7 = {1,0};
		FindTestCase testcase7 = new FindTestCase(target7, array7, expectedFind7, expectedFindAgain7);
		storage[counter] = testcase7;
		counter += 1;

		//Test Case 8 (target > array)
		int[] target8 = {0,1,2,3,4,5,6,7,2,7,4,5,3,3,4,2,3};
		int[] array8 = {0,1,2,3,4,5,6,7,2,7,4,5,3,3,4};
		int expectedFind8 = -1;
		int[] expectedFindAgain8 = {0};
		FindTestCase testcase8 = new FindTestCase(target8, array8, expectedFind8, expectedFindAgain8);
		storage[counter] = testcase8;
		counter += 1;

		//Test Case 9 (target len3, multiple occurences)
		int[] target9 = {0,1,2};
		int[] array9 = {0,1,2,3,4,5,6,7,2,7,4,5,3,3,4,0,1,2,0,1,2,2,4,5,4,0,1,2,2434,33};
		int expectedFind9 = 25;
		int[] expectedFindAgain9 = {4,0,15,18,25};
		FindTestCase testcase9 = new FindTestCase(target9, array9, expectedFind9, expectedFindAgain9);
		storage[counter] = testcase9;
		counter += 1;

		//Test Case 10 (same values)
		int[] target10 = {1,1,3,5};
		int[] array10 = {1, 1, 1, 3, 5, 2, 1, 1, 1, 3, 1, 1, 1, 1, 3, 5, 1, 1, 3, 5, 1, 3, 5};
		int expectedFind10 = 16;
		int[] expectedFindAgain10 = {3, 1, 12, 16};
		FindTestCase testcase10 = new FindTestCase(target10, array10, expectedFind10, expectedFindAgain10);
		storage[counter] = testcase10;
		counter += 1;

		//Test Case 11 (long target and array)
		int[] target11 = {1,2,3,4};
		int[] array11 = {0,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,4,3,1,2,3,5,1,2,3,4,1,2,3,1,2,3,1,2,3,4,6,5,4,1,2,3,4,7};
		int expectedFind11 = 39;
		int[] expectedFindAgain11 = {5, 1, 10, 22, 32, 39};
		FindTestCase testcase11 = new FindTestCase(target11, array11, expectedFind11, expectedFindAgain11);
		storage[counter] = testcase11;
		counter += 1;

		//Test Case 12 (long target, not found in array)
		int[] target12 = {13,1,2,3,4};
		int[] array12 = {0,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,4,3,1,2,3,5,1,2,3,4,1,2,3,1,2,3,1,2,3,4,6,5,4,1,2,3,4,7};
		int expectedFind12 = -1;
		int[] expectedFindAgain12 = {0};
		FindTestCase testcase12 = new FindTestCase(target12, array12, expectedFind12, expectedFindAgain12);
		storage[counter] = testcase12;
		counter += 1;

		//Test Case 13 (longer target, not found in array)
		int[] target13 = {0,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,4,3,1,2,3,5,1,2,3,4,1,2,3,1,2,3,1,2,3,4,6,5,4,1,2,3,4,7};
		int[] array13 = {13,1,2,3,4};
		int expectedFind13 = -1;
		int[] expectedFindAgain13 = {0};
		FindTestCase testcase13 = new FindTestCase(target13, array13, expectedFind13, expectedFindAgain13);
		storage[counter] = testcase13;
		counter += 1;

		//Test Case 14 (longer target, not found in array)
		int[] target14 = {0,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,4,3,1,2,3,5,1,2,3,4,1,2,3,1,2,3,1,2,3,4,6,5,4,1,2,3,4,7};
		int[] array14 = {13,1,2,3,4,0,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,4,3,1,2,3,5,1,2,3,4,1,2,3,1,2,3,1,2,3,4,6,5,4,1,2,3,4,7,6};
		int expectedFind14 = 5;
		int[] expectedFindAgain14 = {1,5};
		FindTestCase testcase14 = new FindTestCase(target14, array14, expectedFind14, expectedFindAgain14);
		storage[counter] = testcase14;
		counter += 1;

		//Test Case 15 (short target and array)
		int[] target15 = {7};
		int[] array15 = {7};
		int expectedFind15 = 0;
		int[] expectedFindAgain15 = {1,0};
		FindTestCase testcase15 = new FindTestCase(target15, array15, expectedFind15, expectedFindAgain15);
		storage[counter] = testcase15;
		counter += 1;

		//Test Case 16 (empty target)
		int[] target16 = {7};
		int[] array16 = {};
		int expectedFind16 = -1;
		int[] expectedFindAgain16 = {0};
		FindTestCase testcase16 = new FindTestCase(target16, array16, expectedFind16, expectedFindAgain16);
		storage[counter] = testcase16;
		counter += 1;

		//Test Case 17 (same digit)
		int[] target17 = {1,1};
		int[] array17 = {1,1,1,1,1,1,1,1};
		int expectedFind17 = 6;
		int[] expectedFindAgain17 = {7, 0, 1, 2, 3, 4, 5, 6};
		FindTestCase testcase17 = new FindTestCase(target17, array17, expectedFind17, expectedFindAgain17);
		storage[counter] = testcase17;
		counter += 1;







		return storage;
	}

}
