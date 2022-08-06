public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb=new java.util.Scanner(System.in);
	    int a;
	    
	    System.out.print("a'yı giriniz : ");
	    a = kb.nextInt();
    	    
	    
	    if ( a >= 100 )
	        System.out.println("sayı 3 basamaklıdır");
	    else    
	        if (a >= 10 )
	            System.out.println("sayı 2 basamaklıdır");
	        else
	            System.out.println("sayı 1 basamaklıdır");
	}
}
