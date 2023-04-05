package algorithms;

public class FindNumber {
	static int count = 0;
	
	public static void main(String[] args) {
		int[] numColl = new int[10000000];
		for (int i = 0; i < numColl.length; i ++) {
			numColl[i] = i;
		}
		
		int high = numColl.length - 1;
		
		Long startTime = System.currentTimeMillis();
		
		findNumber(numColl, 0, high, 9999997);
		
		System.out.println("We found the values at " +count + " try");
		
		Long endTime = System.currentTimeMillis();
		
		System.out.println("Total time: " + (endTime - startTime) + " ms");
	}

	private static int findNumber(int[] collection, int start, int end, int x) {
		count ++;
		if(end >= start) {
			int mid = start + (end - start)/2;
			if(collection[mid] == x)
				return mid;			
			if(collection[mid] > x)
				return findNumber(collection, mid + 1, end, x);
			return findNumber(collection, start, mid - 1, x);
			
		}
		return -1;
	}
}
