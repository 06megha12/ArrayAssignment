package Array;

public class PerfectSeries {

	public static void main(String[] args) {
		int num=200;
		for (int j = 1; j <=num; j++) {
			int sum=0;
			for (int i = 1; i <=j/2; i++) {
				
				if(j%i==0) {
					sum=sum+i;
				}
			}
		
		if(sum==j) {
			System.out.println("Perfect Number :"+j);
		}}
	}

}
