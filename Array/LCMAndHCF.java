package Array;

public class LCMAndHCF {

	public static void main(String[] args) {

		int a[] = { 3, 5, 7 };
		int lcm = 1, fir = lcm, res = 0;
		for (int i = 0; i < a.length; i++) {
			int sec = a[i];
			lcm = (fir * sec) / gcd(fir, sec);
			fir = lcm;

		}
		for (int j = 0; j < a.length; j++) {
			res = gcd(res, a[j]);
		}
		System.out.println("LCM is " + lcm + " " + "GCD is " + res);
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	/*
	 * int a, b, temp1, temp2, temp, HCF, LCM; Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.println("first Number: "); a = sc.nextInt();
	 * System.out.println("Second Number: "); b = sc.nextInt(); sc.close();
	 * 
	 * temp1 = a; temp2 = b;
	 * 
	 * while (temp2 != 0) { temp = temp1; temp2 = temp1 % temp2; temp1 = temp; }
	 * 
	 * HCF = temp1; LCM = (a * b) / HCF;
	 * 
	 * System.out.println("HCF :" + HCF); System.out.println("LCM : " + LCM);
	 */

}
