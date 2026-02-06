package selenium;

public class max_array {

	public static void main(String[] args) {
		int [] a = {23,56,78,54,13};
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max)
			max = a[i];
				
			}
		System.out.println(max);
		}

	}


