class Square {
 static double areaSquare(int s) {

        double areaSquare=s*s;
        return areaSquare;
}
 static double perimeterSquare(int s) {

        double perimeterSquare=4*s;
        return perimeterSquare;
}
 public static void main(String ar[]) {

	double result=areaSquare(6);
	double result1=perimeterSquare(6);
        System.out.println("The area is "+result);	
	System.out.println("The perimeter is "+result1);
}

}