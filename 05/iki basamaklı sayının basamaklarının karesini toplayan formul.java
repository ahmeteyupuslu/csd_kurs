public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
	    int a, b, c, n;
	    
	   	System.out.println("2 basamaklı bir sayı giriniz : ");
	   	n = kb.nextInt();
	   	
	   	a = n / 10;     // onlar basamağı elde ediliyor
	   	b = n % 10;     // birler basamağı elde ediliyor
	   	
	   	c = a * a + b * b;
	   	
	   	System.out.println ("Sonuç : " + c);	
  }
}
