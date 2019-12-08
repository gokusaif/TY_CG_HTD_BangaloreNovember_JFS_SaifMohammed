class ElseIf {
 public static void main(String ar[]) {
	
   int a=50;
   int b=100;
   int c=150;
   int d =85;
	if ( a>b && a>c && a>d)
{        System.out.println("A is greatest");
    }
else if ( b>c && b>d)
{        System.out.println("b is greatest");
    }
else if (c>d)
{        System.out.println("c is greatest");
    }
else 
{   System.out.println("d is greatest");
}






	}	
}