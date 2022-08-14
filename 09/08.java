//serideki tek sayıları ve onların toplamını, ortalamasını, adetini yazdıran program.
public class Main
{
    public static void main(String[] args) 
    {
        int a[]= {4,8,3,1,18,9,21,20,5,17};
    	int i,size,count;	    
        double sum,avg;
    	   
        size = 10;
    	count = 0;
    	sum = 0;
    	
    	for (i = 0; i < size; i = i+1) 
            if (a[i] % 2 != 0){
    		System.out.println(a[i]);
    		        sum=sum+a[i];
    		        count=count+1;    }
    	        
    	  System.out.println("Tek sayı adedi: "+count);
    	  System.out.println("Tek sayıların toplamı: " +sum);   
        avg=sum/count;
    	  System.out.println("Sayıların ortalaması: " +avg);
    	        
    	   
    	}
    }
