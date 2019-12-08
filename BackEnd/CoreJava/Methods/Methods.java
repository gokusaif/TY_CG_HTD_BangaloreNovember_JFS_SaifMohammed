class Methods {


  static void mul(int a,int b) {

 System.out.println("The product of a & b is "+(a*b));
 

}

  static void add(int a,int b) {

 System.out.println("The sum of a & b is "+(a+b));
 

}

  static void sub(int a,int b) {

 System.out.println("The difference of a & b is "+(a-b));
 

}

  static void mod(int a,int b) {

 System.out.println("The remainder of a % b is "+(a%b));
 

}
  static void div(int a,int b) {

 System.out.println("The  quotient of a / b is "+(a/b));
 

}


 public static void main(String ar[]) {

   add(20,30);
   sub(20,10);
   mul(30,40);
   mod(50,5);
	div(50,5);

}


}