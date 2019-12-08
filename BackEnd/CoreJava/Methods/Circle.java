class Circle {
 static double areaCircle(int r) {

        double areaCircle=3.14*r*r;
        return areaCircle;
}
 static double perimeterCircle(int r) {

        double perimeterCircle=3.14*r*r;
        return perimeterCircle;
}
 public static void main(String ar[]) {

	double result=areaCircle(6);
	double result1=perimeterCircle(7);
        System.out.println("The area is "+result);	
	System.out.println("The perimeter is "+result1);
}

}