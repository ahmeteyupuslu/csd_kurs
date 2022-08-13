// girilen a değerinden b değerine kadar olan sayıları yazan program. a<b yi biliyoruz.

public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
		int a,b,i;
		
		System.out.print("a değerini giriniz : ");
	    a = kb.nextInt();
	    
	    System.out.print("b değerini giriniz : ");
	    b = kb.nextInt();
		
		for (i=a; i<=b ; i=i+1)
		    System.out.println(i);
	}
}
	

