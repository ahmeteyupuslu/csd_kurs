public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
	    int a,b,c;
	    
	    System.out.print("a kenarının uzunluğunu giriniz : ");
	    a = kb.nextInt();
    	    
	    System.out.print("b kenarının uzunluğunu giriniz : ");
	    b = kb.nextInt();
	    
	    System.out.print("c kenarının uzunluğunu giriniz : ");
	    c = kb.nextInt();
	    
	    
	    if ( (a+b) <= c )
	        System.out.print("bu değerler ile üçgen oluşturulamaz");
	    else    
	        if ( (a+c) <= b )    
	        System.out.print("bu değerler ile üçgen oluşturulamaz");
	        else
	            if ( (b+c) <= a ) 
	                System.out.print("bu değerler ile üçgen oluşturulamaz");
	            else
	                System.out.print("bu değerler ile üçgen oluşturulabilir");
	            }
	}

