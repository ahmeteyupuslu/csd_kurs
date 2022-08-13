//a'dan b'ye kadar olan sayıları yazan program. bu sefer a ve b arasındaki ilişkiyi bilmiyoruz.

public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
		int a,b,i;
		
	    System.out.print("a değerini giriniz : ");
	    a = kb.nextInt();
	    
	    System.out.print("b değerini giriniz : ");
	    b = kb.nextInt();
		
		
		if (a<=b)
		    for (i=a; i<=b ; i=i+1)
		        System.out.println(i);
		else
		    for (i=a; i>=b; i=i-1)
		        System.out.println(i);
	}
}
	

