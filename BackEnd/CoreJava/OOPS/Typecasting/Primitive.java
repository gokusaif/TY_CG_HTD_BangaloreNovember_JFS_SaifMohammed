package com.tyss.typecasting.pack1;

public class Primitive {
//	implicit type casting
	byte b=5;
	
	short s=b;
	
	int i=s;
	
	long l=i;
	
	float f=l;
	
	double d=f;
	
	void display() {
		
		System.out.println("byte :"+b);
		System.out.println("short :"+s);
		System.out.println("int :"+i);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double :"+d);
	}
//      explicit type casting
	
	double d1=3.142;
	int i1=(int) d1;

	void details() {
		System.out.println("int :"+i1);
		System.out.println("double :"+d1);
	}
	
}
