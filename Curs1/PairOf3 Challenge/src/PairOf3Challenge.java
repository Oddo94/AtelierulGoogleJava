
public class PairOf3Challenge {

	public static void main(String[] args) {
		int[] arr = {-1, -1, -1, 2};

		int count = 0;
		int flag = 0;
		int sum = 0;
		for(int i = 0; i < arr.length;i++) {
			
			for(int j = i+1; j < arr.length;j++) {
				
				for(int k = j+1; k < arr.length; k++) {
					
					sum += arr[i] + arr[j] + arr[k];
					
					if(sum == 0) {
						count++;
						sum = 0;
					}else {
						sum = 0;
					}	
				}
				break;			
			}

		}

		System.out.println("The total number of pairs(any three numbers equal to 0) is " + count);
	}


}

