// çözüm 1- 5in katlarını yazdırma iki değer arasındaki

public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
		int a,i,b;
		
		System.out.print("a değerini giriniz : ");
	    a = kb.nextInt();
	    System.out.print("b değerini giriniz : ");
	    b = kb.nextInt();
	    
	    for (i=a+1; i<b ; i=i+1)
	        if (i%5==0)
	            System.out.println(i);
	    
	 
	}
}
	

