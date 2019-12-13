package com.cap.dsa.algorithms;

import java.time.Duration;
import java.time.Instant;

public class Algorithm1 {
	public static void main(String[] args) {
	
//		long num=99999999l;
//		System.out.println(addUpto(num));
//		System.out.println(addUptoQuick(num));
//		
		countingDuration2();
	countingDuration1();	
	}
	public static long addUpto(long num) {
		long total=0;
		for (long i = 0; i <= num ; i++) {
			total=total+i;

		}
		return total;
	}
	
	public static long addUptoQuick(long num) {
		return num*(num+1)/2;
	}
	
	public static void countingDuration1() {
		long num=9999999999l;
		Instant start=Instant.now();
		System.out.println("add upto "+addUpto(num));
		Instant end=Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds=duration /1000.0;
		System.out.println("addUpto method takes "+seconds+" seconds");
	}
	public static void countingDuration2() {
		long num=9999999999l;
		Instant start=Instant.now();
		System.out.println("add uptoquick "+addUptoQuick(num));
		Instant end=Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds=duration /1000.0;
		System.out.println("addUptoQuick method takes "+seconds+" seconds");
	}

}
