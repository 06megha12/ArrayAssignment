package Array;

public class EvenOddPerfectPrime {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int p=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.println("Even Number : "+" "+a[i]);
			}else {
				System.out.println("Odd Number : "+" "+a[i]);

			}
			 int sum = 0;
	         int t = a[i];
	         for (int k = 1; k < t; k++) {
	              if (t % k == 0) {
	                   sum = sum + k;
	               }
	         }
	         if (sum == t) {
	        	   	p++;
	          }
	      
		}
		System.out.println("perfect no :" +p);
		for(int i=0; i<a.length; i++){
            boolean isPrime = true;
            for (int j=2; j<a[i]; j++){
                if(a[i]%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
            	System.out.println(a[i] + " are the prime numbers");
            }
		}
		
		
	}

}
