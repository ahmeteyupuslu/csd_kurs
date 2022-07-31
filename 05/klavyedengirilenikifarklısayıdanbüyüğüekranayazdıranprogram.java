public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
	    int a,b; 
	    
	    System.out.print ("ilk sayıyı giriniz: ");
	    a = kb.nextInt();
	    
	    System.out.print ("ikinci sayıyı giriniz: ");
	    b = kb.nextInt();
        
        if (a > b)
            System.out.println("Büyük sayı : " + a);
        else
            System.out.println("Büyük sayı : " + b);
	}
}
