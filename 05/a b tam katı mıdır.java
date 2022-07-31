public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
	    int a,b; 
	    
	    System.out.print ("ilk sayıyı giriniz: ");
	    a = kb.nextInt();
	    
	    System.out.print ("ikinci sayıyı giriniz: ");
	    b = kb.nextInt();
        
        if (a % b == 0)
            System.out.println("a sayısı b sayısının tam katıdır");
        else
            System.out.println("a sayısı b sayısının tam katı değildir");
	}
}
