package array2;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TestSort {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]= new int[size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter "+i+" element");
			a[i]=sc.nextInt();
		}
		
		
			Instant start=Instant.now();
			BubbleSort.bubbleSort(a);
			Instant end=Instant.now();
			long duration = Duration.between(start, end).toMillis();
			double seconds=duration /1000.0;
			System.out.println("bubble sort takes "+seconds+" seconds");
	
			Instant start1=Instant.now();
	        MergeSort.sort(a, 0, a.length-1); 
	        MergeSort.printArray(a);
	        Instant end1=Instant.now();
			long duration1 = Duration.between(start1, end1).toMillis();
			double seconds1=duration1 /1000.0;
			System.out.println("merge sort takes "+seconds1+" seconds");
		
		}
	}

