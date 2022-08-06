public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb=new java.util.Scanner(System.in);
	    int x,y,k,t;
	    
	    System.out.print("x değerini giriniz : ");
	    x = kb.nextInt();
    	    
	    
	    if ( x > 5 )
	        {
	        k = 3;
	        t = -20;
	        }
	    else    
	        if ( x >= 0 ){
	            k = -1;
	            t = 10;
	        }
	            else{
	                k=2;
	                t=0;
	            }
	    y=k*x+t;
	    System.out.print("Y = " +y);
	            }
	}

