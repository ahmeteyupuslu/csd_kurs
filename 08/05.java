// n tek işe birden n'e kadar olan tek sayıları. çiftse sıfırdan n'e kadar olan çift sayıları yazdıran program.

public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
		int n,i,x;
		
		System.out.print("n değerini giriniz : ");
	    n = kb.nextInt();
	    x = n%2;
	    
		if (x==0)
		    for (i=0; i<=n ; i=i+2)
		        System.out.println(i);
		else
		    for (i=1; i<=n; i=i+2)
		        System.out.println(i);
	}
}
	

