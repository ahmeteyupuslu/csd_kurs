public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb =  new java.util.Scanner (System.in);
	    int a, b, c, d;
	    
	    System.out.print ("a değerini giriniz : ");
	    a = kb.nextInt();
	    
	    System.out.print ("b değerini giriniz : ");
	    b = kb.nextInt();
	    
	    c = (2*a*a)+(4*a*b)+8;
	    d = c + a + b;
	    
		System.out.println ("c = " + c);
		System.out.println ("d = " + d);
	}
}
