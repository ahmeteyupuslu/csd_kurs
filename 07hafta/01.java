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
	            System.out.print("En büyük sayı A ");
	        else
	            System.out.print("En büyük sayı C ");
	    else
	        if (b>c)
	            System.out.print("En büyük sayı B ");
	        else
	            System.out.print("En büyük sayı C ");
	            
	}
}
