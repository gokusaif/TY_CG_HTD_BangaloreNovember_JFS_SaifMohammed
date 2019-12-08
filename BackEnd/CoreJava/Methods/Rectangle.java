class Rectangle {
 static double areaRectangle(int a,int b) {

        double areaRectangle=a*b;
        return areaRectangle;
}
 static double perimeterRectangle(int a,int b) {

        double perimeterRectangle=2*(a+b);
        return perimeterRectangle;
}
 public static void main(String ar[]) {

	double result=areaRectangle(6,4);
	double result1=perimeterRectangle(6,4);
        System.out.println("The area is "+result);	
	System.out.println("The perimeter is "+result1);
}

}