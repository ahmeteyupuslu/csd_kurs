public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
	    int a;
	    
	    System.out.print("Ders notunu giriniz ");
	    a = kb.nextInt();
	    
	    if (a<=100)
	        if (a>80)
	        System.out.print("Harf notu: A");
	        else
	            if (a>60)
	            System.out.print("Harf notu: B");   
	            else
	                if (a>40)
	                System.out.print("Harf Notu: C");
	                else    
	                    if(a>20)
	                    System.out.print("Harf notu: D");
	                    else
	                        if(a>0)
	                        System.out.print("Harf notu: E");
	                        else    
	                        System.out.print("Lütfen 0-100 arası bir değer giriniz!");
	    else
	    System.out.print("Lütfen 0-100 arası bir değer giriniz!");
	}
}
