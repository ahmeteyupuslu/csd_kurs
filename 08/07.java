// çözüm2 a ve b arasında 5 ve katlarını yazdırma. 5 yerine n ile genel bir çözüm çıkartılabilir.



public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
		int a,i,b;
		
		System.out.print("a değerini giriniz : ");
	    a = kb.nextInt();
	    System.out.print("b değerini giriniz : ");
	    b = kb.nextInt();
	    
	    for (i=a+(5-a%5); i<b ; i=i+5)
	        System.out.println(i + " ");
	    
	 
	}
}
	

