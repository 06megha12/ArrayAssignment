package Array;

public class MaximumThirdElement {

	public static void main(String[] args) {
		int a[] = { 9, 0, 7, 8, 5, 11 };

		int LargestNo = Integer.MIN_VALUE;
		int secondLarestNo = Integer.MIN_VALUE;
		int thirdLargestNo = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > LargestNo) {
				secondLarestNo = LargestNo;
				LargestNo = a[i];
			} else if (a[i] > secondLarestNo && a[i] != LargestNo) {
				secondLarestNo = a[i];
			} else if (a[i] > thirdLargestNo && a[i] != secondLarestNo) {
				thirdLargestNo = a[i];
			}
		}

		System.out.println(thirdLargestNo);

		/*
		 * int length = a.length; for (int i = 0; i < a.length; i++) { for (int j = 0; j
		 * < a.length; j++) { if (i < j && a[i] < a[j]) { int temp = a[i]; a[i] = a[j];
		 * a[j] = temp; } }
		 * 
		 * } System.out.println(a[length - 4]);
		 */
	}

}
