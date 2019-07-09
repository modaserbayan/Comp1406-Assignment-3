package comp1406a3;
public class TestFutureDate{

	/** Generate black-box test cases for the futureDate method (in the Date class).
		* @return an array of test cases for the futureDate method (in the Date class).
		*/
	public static FutureDateTestCase[] makeTestCases(){
			int numberOfTestCases = 31;
			FutureDateTestCase[] storage = new FutureDateTestCase[numberOfTestCases];

			//Test Case 1:
      Date day = new Date(2019, 1, 1);
      int  daysInFuture = 2;
      Date expected = new Date(2019, 1, 1+daysInFuture);
      FutureDateTestCase testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[0] = testcase;

			//Test Case 2:
      day = new Date(2018, 1, 1);
      daysInFuture = 365;
      expected = new Date(2019, 1, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[1] = testcase;

			//Test Case 3 (testing none leapyear):
      day = new Date(2018, 2, 27);
      daysInFuture = 2;
      expected = new Date(2019, 3, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[2] = testcase;

			//Test Case 4 (testing leapyear):
      day = new Date(2020, 2, 27);
      daysInFuture = 2;
      expected = new Date(2020, 2, 29);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[3] = testcase;

			//Test Case 5:
      day = new Date(2020, 2, 27);
      daysInFuture = 500;
      expected = new Date(2021, 7, 11);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[4] = testcase;

			//Test Case 6:
      day = new Date(2018, 1, 31);
      daysInFuture = 1;
      expected = new Date(2018, 2, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[5] = testcase;

			//Test Case 7:
      day = new Date(2018, 2, 28);
      daysInFuture = 1;
      expected = new Date(2018, 3, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[6] = testcase;

			//Test Case 8:
      day = new Date(2020, 2, 29);
      daysInFuture = 1;
      expected = new Date(2018, 3, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[7] = testcase;

			//Test Case 9:
      day = new Date(2018, 3, 31);
      daysInFuture = 1;
      expected = new Date(2018, 4, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[8] = testcase;

			//Test Case 10:
      day = new Date(2018, 4, 30);
      daysInFuture = 1;
      expected = new Date(2018, 5, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[9] = testcase;

			//Test Case 11:
      day = new Date(2018, 5, 31);
      daysInFuture = 1;
      expected = new Date(2018, 6, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[10] = testcase;

			//Test Case 12:
      day = new Date(2018, 6, 30);
      daysInFuture = 1;
      expected = new Date(2018, 7, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[11] = testcase;

			//Test Case 13:
      day = new Date(2018, 7, 31);
      daysInFuture = 1;
      expected = new Date(2018, 8, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[12] = testcase;

			//Test Case 14:
      day = new Date(2018, 8, 31);
      daysInFuture = 1;
      expected = new Date(2018, 9, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[13] = testcase;

			//Test Case 15:
      day = new Date(2018, 9, 30);
      daysInFuture = 1;
      expected = new Date(2018, 10, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[14] = testcase;

			//Test Case 16:
      day = new Date(2018, 10, 31);
      daysInFuture = 1;
      expected = new Date(2018, 11, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[15] = testcase;

			//Test Case 17:
      day = new Date(2018, 11, 30);
      daysInFuture = 1;
      expected = new Date(2018, 12, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[16] = testcase;

			//Test Case 18:
      day = new Date(2018, 12, 31);
      daysInFuture = 1;
      expected = new Date(2019, 1, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[17] = testcase;

			//Test Case 19:
      day = new Date(2018, 12, 31);
      daysInFuture = 400;
      expected = new Date(2020, 2, 4);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[18] = testcase;

			//Test Case 20:
      day = new Date(2019, 12, 31);
      daysInFuture = 400;
      expected = new Date(2021, 2, 3);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[19] = testcase;

			//Test Case 21:
      day = new Date(2019, 2, 1);
      daysInFuture = 29;
      expected = new Date(2019, 3, 2);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[20] = testcase;

			//Test Case 22:
      day = new Date(2020, 2, 1);
      daysInFuture = 29;
      expected = new Date(2019, 3, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[21] = testcase;

			//Test Case 23:
      day = new Date(2019, 1, 1);
      daysInFuture = 300;
      expected = new Date(2019, 10, 28);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[22] = testcase;

			//Test Case 24:
      day = new Date(2020, 1, 1);
      daysInFuture = 300;
      expected = new Date(2019, 10, 27);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[23] = testcase;

			//Test Case 25:
      day = new Date(2019, 1, 1);
      daysInFuture = 499;
      expected = new Date(2020, 5, 14);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[24] = testcase;

			//Test Case 26:
      day = new Date(2020, 1, 1);
      daysInFuture = 499;
      expected = new Date(2021, 5, 14);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[25] = testcase;

			//Test Case 27:
      day = new Date(2018, 1, 1);
      daysInFuture = 499;
      expected = new Date(2019, 5, 15);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[26] = testcase;

			//Test Case 28:
      day = new Date(2018, 1, 31);
      daysInFuture = 29;
      expected = new Date(2018, 3, 1);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[27] = testcase;

			//Test Case 29:
      day = new Date(2020, 1, 31);
      daysInFuture = 29;
      expected = new Date(2020, 2, 29);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[28] = testcase;

			//Test Case 30:
      day = new Date(2020, 1, 31);
      daysInFuture = 0;
      expected = new Date(2020, 1, 31);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[29] = testcase;


			//Test Case 31:
      day = new Date(1735, 8, 26);
      daysInFuture = 3;
      expected = new Date(1735, 8, 29);
      testcase = new FutureDateTestCase(day, daysInFuture, expected);
			storage[30] = testcase;






		return storage;
	}


}
