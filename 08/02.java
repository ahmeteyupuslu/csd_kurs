// birden girilen n değerine kadar sayıları yazan program

public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
		int n,i;
		
		System.out.print("n değerini giriniz : ");
	    n = kb.nextInt();
		
		for (i=1; i<=n ; i=i+1)
		    System.out.println(i);
	}
}
	
