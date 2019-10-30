
public class PairOf2Challenge {

	public static void main(String[] args) {
		int[] arr = {3, 2 ,-3, -2, 3, 0};

		boolean[] visited = new boolean[arr.length];

		int i = 0;
		int count = 0;

		for(i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if( arr[i] + arr[j] == 0 && !visited[i]) {
					count++;
					visited[j] = true;
					break;
				}
			}
		}
		
		System.out.println("Numer of pairs: " + count);
	}
}




