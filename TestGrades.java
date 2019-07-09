package comp1406a3;

public class TestGrades{
	/** Generate test cases for the Grades class.
		* @return an array of test cases for the Grades class
		*/
	public static GradesTestCase[] makeTestCases(){
		int numberOfTestCases = 50;
		GradesTestCase[] storage = new GradesTestCase[numberOfTestCases];

		//Test Case 1 (normal fail):
		double[] a = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0};
		double[] m = {0.0, 0.0, 0.0};
		double[] t = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		double f = 0.0;
    GradesTestCase testcase = new GradesTestCase(a, m, t, f, "F", false);
		storage[0] = testcase;

		//Test Case 2 (normal pass):
		double[] a2 = {100, 100, 100, 100, 100, 100, 100, 100, 100};
		double[] m2 = {100, 100, 100};
		double[] t2 = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
		double f2 = 100;
    GradesTestCase testcase2 = new GradesTestCase(a2, m2, t2, f2, "A+", true);
		storage[1] = testcase2;

		//Test Case 3 (fail due to exam grade):
		double[] a3 = {100, 100, 100, 100, 100, 100, 100, 100, 100};
		double[] m3 = {50, 50, 50};
		double[] t3 = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
		double f3 = 45;
    GradesTestCase testcase3 = new GradesTestCase(a3, m3, t3, f3, "F", false);
		storage[2] = testcase3;

		//Test Case 4 (fail due to midterm grade):
		double[] a4 = {100, 100, 100, 100, 100, 100, 100, 100, 100};
		double[] m4 = {30, 30, 30};
		double[] t4 = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
		double f4 = 60;
    GradesTestCase testcase4 = new GradesTestCase(a4, m4, t4, f4, "F", false);
		storage[3] = testcase4;

		//Test Case 5 (pass, shud take only 2/3 midterms):
		double[] a5 = {100, 100, 100, 100, 100, 100, 100, 100, 100};
		double[] m5 = {50, 50, 0};
		double[] t5 = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
		double f5 = 50;
    GradesTestCase testcase5 = new GradesTestCase(a5, m5, t5, f5, "D-", false);
		storage[4] = testcase5;

		//Test Case 6 (fail due to midterm and final):
		double[] a6 = {100, 100, 100, 100, 100, 100, 100, 100, 100};
		double[] m6 = {49, 49, 49};
		double[] t6 = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
		double f6 = 49;
    GradesTestCase testcase6 = new GradesTestCase(a6, m6, t6, f6, "F", false);
		storage[5] = testcase6;

		//Test Case 7 (pass, should not count last tutorials):
		double[] a7 = {50, 50, 50, 50, 50, 50, 50, 50, 50};
		double[] m7 = {50, 50, 50};
		double[] t7 = {50, 50, 50, 50, 50, 50, 50, 50, 0, 0};
		double f7 = 50;
    GradesTestCase testcase7 = new GradesTestCase(a7, m7, t7, f7, "D-", false);
		storage[6] = testcase7;

		//Test Case 8 (pass, should not count last study assignment):
		double[] a8 = {50, 50, 50, 50, 50, 50, 50, 50, 0};
		double[] m8 = {50, 50, 50};
		double[] t8 = {50, 50, 50, 50, 50, 50, 50, 50, 0, 0};
		double f8 = 50;
    GradesTestCase testcase8 = new GradesTestCase(a8, m8, t8, f8, "D-", false);
		storage[7] = testcase8;

		//Test Case 9 (pass, shud progress to second year):
		double[] a9 = {60, 60, 60, 60, 60, 60, 60, 60, 60};
		double[] m9 = {60, 60, 60};
		double[] t9 = {60, 60, 60, 60, 60, 60, 60, 60, 60, 60};
		double f9 = 60;
    GradesTestCase testcase9 = new GradesTestCase(a9, m9, t9, f9, "C-", true);
		storage[8] = testcase9;

		//Test Case 10 (shud progress to second year, count 2/3 midterms):
		double[] a10 = {60, 60, 60, 60, 60, 60, 60, 60, 60};
		double[] m10 = {60, 60, 50};
		double[] t10 = {60, 60, 60, 60, 60, 60, 60, 60, 60, 60};
		double f10 = 60;
    GradesTestCase testcase10 = new GradesTestCase(a10, m10, t10, f10, "C-", true);
		storage[9] = testcase10;

		//Test Case 11 (pass, shud progress to second year, count 2/3 sa):
		double[] a11 = {60, 60, 60, 60, 60, 60, 60, 60, 0};
		double[] m11 = {60, 60, 60};
		double[] t11 = {60, 60, 60, 60, 60, 60, 60, 60, 60, 60};
		double f11 = 60;
    GradesTestCase testcase11 = new GradesTestCase(a11, m11, t11, f11, "C-", true);
		storage[10] = testcase11;

		//Test Case 12 (pass, shud progress to second year, count 8/10 ta):
		double[] a12 = {60, 60, 60, 60, 60, 60, 60, 60, 60};
		double[] m12 = {60, 60, 60};
		double[] t12 = {60, 60, 60, 60, 60, 60, 60, 60, 0, 0};
		double f12 = 60;
    GradesTestCase testcase12 = new GradesTestCase(a12, m12, t12, f12, "C-", true);
		storage[11] = testcase12;

		//Test Case 13 (D, testing best 2/3 sa):
		double[] a13 = {53, 53, 53, 53, 53, 53, 0, 53, 53};
		double[] m13 = {53, 53, 53};
		double[] t13 = {53, 53, 53, 53, 53, 53, 53, 53, 53, 53};
		double f13 = 53;
    GradesTestCase testcase13 = new GradesTestCase(a13, m13, t13, f13, "D", false);
		storage[12] = testcase13;

		//Test Case 14 (D, testing best 2/3 mt):
		double[] a14 = {53, 53, 53, 53, 53, 53, 53, 53, 53};
		double[] m14 = {53, 0, 53};
		double[] t14 = {53, 53, 53, 53, 53, 53, 53, 53, 53, 53};
		double f14 = 53;
    GradesTestCase testcase14 = new GradesTestCase(a14, m14, t14, f14, "D", false);
		storage[13] = testcase14;

		//Test Case 15 (D, testing best 8/10 t):
		double[] a15 = {53, 53, 53, 53, 53, 53, 53, 53, 53};
		double[] m15 = {53, 53, 53};
		double[] t15 = {0, 53, 53, 0, 53, 53, 53, 53, 53, 53};
		double f15 = 53;
    GradesTestCase testcase15 = new GradesTestCase(a15, m15, t15, f15, "D", false);
		storage[14] = testcase15;

		//Test Case 16 (D+, testing best 2/3 sa):
		double[] a16 = {57, 57, 57, 57, 57, 57, 57, 0, 57};
		double[] m16 = {57, 57, 57};
		double[] t16 = {57, 57, 57, 57, 57, 57, 57, 57, 57, 57};
		double f16 = 57;
    GradesTestCase testcase16 = new GradesTestCase(a16, m16, t16, f16, "D+", false);
		storage[15] = testcase16;

		//Test Case 17 (D+, testing best 2/3 mt):
		double[] a17 = {57, 57, 57, 57, 57, 57, 57, 57, 57};
		double[] m17 = {0, 57, 57};
		double[] t17 = {57, 57, 57, 57, 57, 57, 57, 57, 57, 57};
		double f17 = 57;
    GradesTestCase testcase17 = new GradesTestCase(a17, m17, t17, f17, "D+", false);
		storage[16] = testcase17;

		//Test Case 18 (D+, testing best 8/10 t):
		double[] a18 = {57, 57, 57, 57, 57, 57, 57, 57, 57};
		double[] m18 = {57, 57, 57};
		double[] t18 = {57, 0, 57, 57, 57, 57, 57, 0, 57, 57};
		double f18 = 57;
    GradesTestCase testcase18 = new GradesTestCase(a18, m18, t18, f18, "D+", false);
		storage[17] = testcase18;

		//Test Case 19 (C-, testing best 2/3 sa):
		double[] a19 = {60, 60, 60, 60, 60, 60, 0, 60, 60};
		double[] m19 = {60, 60, 60};
		double[] t19 = {60, 60, 60, 60, 60, 60, 60, 60, 60, 60};
		double f19 = 60;
    GradesTestCase testcase19 = new GradesTestCase(a19, m19, t19, f19, "C-", true);
		storage[18] = testcase19;

		//Test Case 20 (C-, testing best 2/3 mt):
		double[] a20 = {60, 60, 60, 60, 60, 60, 60, 60, 60};
		double[] m20 = {60, 0, 60};
		double[] t20 = {60, 60, 60, 60, 60, 60, 60, 60, 60, 60};
		double f20 = 60;
    GradesTestCase testcase20 = new GradesTestCase(a20, m20, t20, f20, "C-", true);
		storage[19] = testcase20;

		//Test Case 21 (C-, testing best 8/10 t):
		double[] a21 = {60, 60, 60, 60, 60, 60, 60, 60, 60};
		double[] m21 = {60, 60, 60};
		double[] t21 = {60, 0, 60, 60, 60, 60, 60, 0, 60, 60};
		double f21 = 60;
    GradesTestCase testcase21 = new GradesTestCase(a21, m21, t21, f21, "C-", true);
		storage[20] = testcase21;

		//Test Case 22 (C, testing best 2/3 sa):
		double[] a22 = {63, 63, 63, 63, 63, 63, 63, 0, 63};
		double[] m22 = {63, 63, 63};
		double[] t22 = {63, 63, 63, 63, 63, 63, 63, 63, 63, 63};
		double f22 = 63;
    GradesTestCase testcase22 = new GradesTestCase(a22, m22, t22, f22, "C", true);
		storage[21] = testcase22;

		//Test Case 23 (C, testing best 2/3 mt):
		double[] a23 = {63, 63, 63, 63, 63, 63, 63, 63, 63};
		double[] m23 = {63, 0, 63};
		double[] t23 = {63, 63, 63, 63, 63, 63, 63, 63, 63, 63};
		double f23 = 63;
    GradesTestCase testcase23 = new GradesTestCase(a23, m23, t23, f23, "C", true);
		storage[22] = testcase23;

		//Test Case 24 (C, testing best 8/10 t):
		double[] a24 = {63, 63, 63, 63, 63, 63, 63, 63, 63};
		double[] m24 = {63, 63, 63};
		double[] t24 = {63, 0, 63, 63, 63, 63, 63, 63, 63, 0};
		double f24 = 63;
    GradesTestCase testcase24 = new GradesTestCase(a24, m24, t24, f24, "C", true);
		storage[23] = testcase24;

		//Test Case 25 (C+, testing best 2/3 sa):
		double[] a25 = {67, 67, 67, 67, 67, 67, 67, 0, 67};
		double[] m25 = {67, 67, 67};
		double[] t25 = {67, 67, 67, 67, 67, 67, 67, 67, 67, 67};
		double f25 = 67;
    GradesTestCase testcase25 = new GradesTestCase(a25, m25, t25, f25, "C+", true);
		storage[24] = testcase25;

		//Test Case 26 (C+, testing best 2/3 mt):
		double[] a26 = {67, 67, 67, 67, 67, 67, 67, 67, 67};
		double[] m26 = {67, 0, 67};
		double[] t26 = {67, 67, 67, 67, 67, 67, 67, 67, 67, 67};
		double f26 = 67;
    GradesTestCase testcase26 = new GradesTestCase(a26, m26, t26, f26, "C+", true);
		storage[25] = testcase26;

		//Test Case 27 (C+, testing best 8/10 t):
		double[] a27 = {67, 67, 67, 67, 67, 67, 67, 67, 67};
		double[] m27 = {67, 67, 67};
		double[] t27 = {67, 67, 67, 67, 0, 67, 67, 67, 67, 0};
		double f27 = 67;
    GradesTestCase testcase27 = new GradesTestCase(a27, m27, t27, f27, "C+", true);
		storage[26] = testcase27;

		//Test Case 28 (B-, testing best 2/3 sa):
		double[] a28 = {70, 70, 70, 70, 70, 70, 70, 0, 70};
		double[] m28 = {70, 70, 70};
		double[] t28 = {70, 70, 70, 70, 70, 70, 70, 70, 70, 70};
		double f28 = 70;
    GradesTestCase testcase28 = new GradesTestCase(a28, m28, t28, f28, "B-", true);
		storage[27] = testcase28;

		//Test Case 29 (B-, testing best 2/3 mt):
		double[] a29 = {70, 70, 70, 70, 70, 70, 70, 70, 70};
		double[] m29 = {70, 0, 70};
		double[] t29 = {70, 70, 70, 70, 70, 70, 70, 70, 70, 70};
		double f29 = 70;
    GradesTestCase testcase29 = new GradesTestCase(a29, m29, t29, f29, "B-", true);
		storage[28] = testcase29;

		//Test Case 30 (B-, testing best 8/10 t):
		double[] a30 = {70, 70, 70, 70, 70, 70, 70, 70, 70};
		double[] m30 = {70, 70, 70};
		double[] t30 = {70, 70, 70, 0, 70, 70, 70, 70, 0, 70};
		double f30 = 70;
    GradesTestCase testcase30 = new GradesTestCase(a30, m30, t30, f30, "B-", true);
		storage[29] = testcase30;

		//Test Case 31 (B, testing best 2/3 sa):
		double[] a31 = {73, 73, 73, 73, 73, 73, 73, 0, 73};
		double[] m31 = {73, 73, 73};
		double[] t31 = {73, 73, 73, 73, 73, 73, 73, 73, 73, 73};
		double f31 = 73;
    GradesTestCase testcase31 = new GradesTestCase(a31, m31, t31, f31, "B", true);
		storage[30] = testcase31;

		//Test Case 32 (B, testing best 2/3 mt):
		double[] a32 = {73, 73, 73, 73, 73, 73, 73, 73, 73};
		double[] m32 = {73, 0, 73};
		double[] t32 = {73, 73, 73, 73, 73, 73, 73, 73, 73, 73};
		double f32 = 73;
    GradesTestCase testcase32 = new GradesTestCase(a32, m32, t32, f32, "B", true);
		storage[31] = testcase32;

		//Test Case 33 (B, testing best 8/10 t):
		double[] a33 = {73, 73, 73, 73, 73, 73, 73, 73, 73};
		double[] m33 = {73, 73, 73};
		double[] t33 = {73, 73, 73, 73, 0, 73, 73, 0, 73, 73};
		double f33 = 73;
    GradesTestCase testcase33 = new GradesTestCase(a33, m33, t33, f33, "B", true);
		storage[32] = testcase33;

		//Test Case 34 (B+, testing best 2/3 sa):
		double[] a34 = {77, 77, 77, 77, 77, 77, 77, 0, 77};
		double[] m34 = {77, 77, 77};
		double[] t34 = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77};
		double f34 = 77;
    GradesTestCase testcase34 = new GradesTestCase(a34, m34, t34, f34, "B+", true);
		storage[33] = testcase34;

		//Test Case 35 (B+, testing best 2/3 mt):
		double[] a35 = {77, 77, 77, 77, 77, 77, 77, 77, 77};
		double[] m35 = {77, 0, 77};
		double[] t35 = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77};
		double f35 = 77;
    GradesTestCase testcase35 = new GradesTestCase(a35, m35, t35, f35, "B+", true);
		storage[34] = testcase35;

		//Test Case 36 (B+, testing best 8/10 t):
		double[] a36 = {77, 77, 77, 77, 77, 77, 77, 77, 77};
		double[] m36 = {77, 77, 77};
		double[] t36 = {77, 0, 77, 77, 77, 0, 77, 77, 77, 77};
		double f36 = 77;
    GradesTestCase testcase36 = new GradesTestCase(a36, m36, t36, f36, "B+", true);
		storage[35] = testcase36;

		//Test Case 37 (A-, testing best 2/3 sa):
		double[] a37 = {80, 80, 80, 80, 80, 80, 80, 0, 80};
		double[] m37 = {80, 80, 80};
		double[] t37 = {80, 80, 80, 80, 80, 80, 80, 80, 80, 80};
		double f37 = 80;
    GradesTestCase testcase37 = new GradesTestCase(a37, m37, t37, f37, "A-", true);
		storage[36] = testcase37;

		//Test Case 38 (A-, testing best 2/3 mt):
		double[] a38 = {80, 80, 80, 80, 80, 80, 80, 80, 80};
		double[] m38 = {80, 0, 80};
		double[] t38 = {80, 80, 80, 80, 80, 80, 80, 80, 80, 80};
		double f38 = 80;
    GradesTestCase testcase38 = new GradesTestCase(a38, m38, t38, f38, "A-", true);
		storage[37] = testcase38;

		//Test Case 39 (A-, testing best 8/10 t):
		double[] a39 = {80, 80, 80, 80, 80, 80, 80, 80, 80};
		double[] m39 = {80, 80, 80};
		double[] t39 = {80, 80, 80, 80, 0, 80, 80, 80, 80, 0};
		double f39 = 80;
    GradesTestCase testcase39 = new GradesTestCase(a39, m39, t39, f39, "A-", true);
		storage[38] = testcase39;

		//Test Case 40 (A, testing best 2/3 sa):
		double[] a40 = {85, 85, 85, 85, 85, 85, 85, 0, 85};
		double[] m40 = {85, 85, 85};
		double[] t40 = {85, 85, 85, 85, 85, 85, 85, 85, 85, 85};
		double f40 = 85;
    GradesTestCase testcase40 = new GradesTestCase(a40, m40, t40, f40, "A", true);
		storage[39] = testcase40;

		//Test Case 41 (A, testing best 2/3 mt):
		double[] a41 = {85, 85, 85, 85, 85, 85, 85, 85, 85};
		double[] m41 = {85, 0, 85};
		double[] t41 = {85, 85, 85, 85, 85, 85, 85, 85, 85, 85};
		double f41 = 85;
    GradesTestCase testcase41 = new GradesTestCase(a41, m41, t41, f41, "A", true);
		storage[40] = testcase41;

		//Test Case 42 (A, testing best 8/10 t):
		double[] a42 = {85, 85, 85, 85, 85, 85, 85, 85, 85};
		double[] m42 = {85, 85, 85};
		double[] t42 = {0, 85, 85, 85, 85, 85, 85, 0, 85, 85};
		double f42 = 85;
    GradesTestCase testcase42 = new GradesTestCase(a42, m42, t42, f42, "A", true);
		storage[41] = testcase42;

		//Test Case 43 (A+, testing best 2/3 sa):
		double[] a43 = {90, 90, 90, 90, 90, 90, 90, 0, 90};
		double[] m43 = {90, 90, 90};
		double[] t43 = {90, 90, 90, 90, 90, 90, 90, 90, 90, 90};
		double f43 = 90;
    GradesTestCase testcase43 = new GradesTestCase(a43, m43, t43, f43, "A+", true);
		storage[42] = testcase43;

		//Test Case 44 (A+, testing best 2/3 mt):
		double[] a44 = {90, 90, 90, 90, 90, 90, 90, 90, 90};
		double[] m44 = {90, 0, 90};
		double[] t44 = {90, 90, 90, 90, 90, 90, 90, 90, 90, 90};
		double f44 = 90;
    GradesTestCase testcase44 = new GradesTestCase(a44, m44, t44, f44, "A+", true);
		storage[43] = testcase44;

		//Test Case 45 (A+, testing best 8/10 t):
		double[] a45 = {90, 90, 90, 90, 90, 90, 90, 90, 90};
		double[] m45 = {90, 90, 90};
		double[] t45 = {0, 90, 90, 90, 90, 90, 0, 90, 90, 90};
		double f45 = 90;
    GradesTestCase testcase45 = new GradesTestCase(a45, m45, t45, f45, "A+", true);
		storage[44] = testcase45;

		//Test Case 46 (D, should be false test):
		double[] a46 = {53, 53, 53, 53, 53, 53, 53, 53, 53};
		double[] m46 = {53, 53, 53};
		double[] t46 = {53, 53, 53, 53, 53, 53, 53, 53, 53, 53};
		double f46 = 53;
    GradesTestCase testcase46 = new GradesTestCase(a46, m46, t46, f46, "D", true);
		storage[45] = testcase46;

		//Test Case 47 (D-, should be false test):
		double[] a47 = {50, 50, 50, 50, 50, 50, 50, 50, 50};
		double[] m47 = {50, 50, 50};
		double[] t47 = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
		double f47 = 50;
    GradesTestCase testcase47 = new GradesTestCase(a47, m47, t47, f47, "D-", true);
		storage[46] = testcase47;

		//Test Case 48 (D+, should be false test):
		double[] a48 = {57, 57, 57, 57, 57, 57, 57, 57, 57};
		double[] m48 = {57, 57, 57};
		double[] t48 = {57, 57, 57, 57, 57, 57, 57, 57, 57, 57};
		double f48 = 57;
    GradesTestCase testcase48 = new GradesTestCase(a48, m48, t48, f48, "D+", true);
		storage[47] = testcase48;

		//Test Case 49 (A, testing best 2/3 mt):
		double[] a49 = {89.9, 89.9, 89.9, 89.9, 89.9, 89.9, 89.9, 89.9, 89.9};
		double[] m49 = {89.9, 89.9, 89.9};
		double[] t49 = {89.9, 89.9, 89.9, 89.9, 89.9, 89.9, 89.9, 89.9, 89.9, 89.9};
		double f49 = 89.9;
    GradesTestCase testcase49 = new GradesTestCase(a49, m49, t49, f49, "A", true);
		storage[48] = testcase49;

		//Test Case 50 (A, testing best 2/3 mt):
		double[] a50 = {89.00009, 89.00009, 89.00009, 89.00009, 89.00009, 89.00009, 89.00009, 89.00009, 89.00009};
		double[] m50 = {89.00009, 89.00009, 89.00009};
		double[] t50 = {89.00009, 89.00009, 89.00009, 89.00009, 89.00009, 89.00009, 89.00009, 89.00009, 89.00009, 89.00009};
		double f50 = 89.00009;
    GradesTestCase testcase450 = new GradesTestCase(a50, m50, t50, f50, "A", true);
		storage[48] = testcase50;




		return storage;
	}

}
