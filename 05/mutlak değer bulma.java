public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
	    int a,b; 
	    
	    System.out.print ("mutlak değeri bulunacak sayıyı giriniz: ");
	    a = kb.nextInt();
        
      b = a * (-1);
        
      if (a > 0)
        System.out.println("|a| = " +a);
      else
        System.out.println("|a| = " +b);
	}
}
