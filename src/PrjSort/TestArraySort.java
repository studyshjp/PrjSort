package PrjSort;


import java.util.Arrays;
import java.util.Collections;




public class TestArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int [] arr1 = new int [] {};
		int [] arr1 = {1,5,3,2,4};
		System.out.println(arr1);		// [I@8bcc55f
		System.out.println(Arrays.toString(arr1));

		
		Collections.reverse(arr1);
		System.out.println(Arrays.toString(arr1));

		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		// Stream
		arr1 = Arrays.stream(arr1)
				.boxed()
				.sorted(Collections.reverseOrder())
				.mapToInt(Integer::intValue)
				.toArray();
		System.out.println(Arrays.toString(arr1));
		
		// 람다식 class
		// Arrays.sort(arr1, (a,b)-> {return b-a;});
		Integer [] arr2 = {1,5,3,2,4};
		Arrays.sort(arr2, (a,b) -> {return b-a;});
		System.out.println(Arrays.toString(arr2));
		
		String	[] names = {"a","b","c"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names, (a,b)-> b.compareTo(a));
		System.out.println(Arrays.toString(names));
	}

}
