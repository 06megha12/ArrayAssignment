package Array;

public class DuplicateCount {

	public static void main(String[] args) {
		
		 int a[]= {1,2,1,4,2,5};
		  int count=1;   
		  int temp=0;
		  for (int i = 0; i <= a.length; i++) {
			  	for (int j = i + 1; j < a.length; j++) {
	               if (a[i] == a[j]) {
	                   temp = a[j];
	                   count++;
	                   System.out.println(temp + " " + count);
	                }
	           }
	           count = 1;
		  }
		/*
		 * for (int i = 0; i < a.length - 1; i++) { for (int j = i + 1; j < a.length;
		 * j++) { if (a[i] == a[j] && (i != j)) { flag = true; count++; break; } } if
		 * (flag == true) { System.out.println(a[i] + " " + count); }
		 * 
		 * }
		 */

	}

}
