//  1den n'e kadar olan sayıların toplayan program

public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb=new java.util.Scanner(System.in);
	    int i,n,sum;
	    
		System.out.println("Bir sayı giriniz");
		n = kb.nextInt();
		
		sum=0;
		
		for (i = 1; i <= n ; i=i+1)
		    sum = sum + i;
		    
		System.out.println(sum);
		    
	}
}
