//ortanca değeri bulmak için program//

public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
	    int a,b,c;
	    
	    System.out.print("A sayısını giriniz ");
	    a = kb.nextInt();
	    System.out.print("B sayısını giriniz ");
	    b = kb.nextInt();
	    System.out.print("C sayısını giriniz ");
	    c = kb.nextInt();
	    
	    if (a>b)
	        if (a>c)
	            if(b>c)
	                System.out.print("Ortanca Sayı B");
	            else
	                System.out.print("Ortanca sayı C");
	       else
	            System.out.print("Ortanca sayı A");
	    else
	        if (b>c)
	            if (c>a)
	                System.out.print("Ortanca sayı C");
	            else
	                System.out.print("Ortanca sayı A");
	        else
	            System.out.print("En büyük sayı B");
	            
	}
}
