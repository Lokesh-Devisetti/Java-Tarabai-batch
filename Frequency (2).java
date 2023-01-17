/* 5. Write a program a program to count the occurrence of each element in the array.
Expected Output:
---------------------------------------
 Element | Frequency
 ---------------------------------------
 1 | 2
 8 | 2
 3 | 2
 2 | 1
 5 | 3
 7 | 1
 9 | 1
 ----------------------------------------  
*/
import java.util.*;

public class Frequency {

	public static void main(String args[]) {
		int[] arr = {8,1,5,7,9,8,2,3,1,5,5,3};
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println(" ---------------------------------------");
				for (int key : map.keySet()) {
			System.out.println(" " + key + " | " + map.get(key));
		}
		
		System.out.println(" ----------------------------------------");
	}
}