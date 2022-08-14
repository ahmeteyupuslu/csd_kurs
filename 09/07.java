// dizideki tek sayıların adedini ekrana yazdıran program.

public class Main
    {
    	public static void main(String[] args) {
    	    
    	    int a[]= {4,8,3,1,18,9,21,20,5,17};
    	    int i, sum,size,count;
    	    size=10;
    	    
    	    count=0;
    	
    		for (i=0; i<size; i=i+1) 
    		    if (a[i]%2!=0){
    		    System.out.println(a[i]);
    		    count=count+1;
    	      }
    	        
    	      System.out.println("Tek sayı adedi: "+counnt);
    	    
    	   
    	}
    }

