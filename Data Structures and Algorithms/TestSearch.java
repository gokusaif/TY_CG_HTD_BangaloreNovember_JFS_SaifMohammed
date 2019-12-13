package array2;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TestSearch {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]= new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter "+i+" element");
			a[i]=sc.nextInt();
		}
		System.out.println("enter the element to search");
		int x=sc.nextInt();
		Instant start=Instant.now();
		int result = BinarySearch.binarySearch(a, x);
		Instant end=Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds=duration /1000.0;
		System.out.println("binary search takes "+seconds+" seconds");
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at "
					+ "index " + result); 
	}
}

