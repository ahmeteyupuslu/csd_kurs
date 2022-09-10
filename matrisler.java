//MATRİSLER
public class Main
{
	public static void main(String[] args) {
        int m[][] = new int[4][3];
        int i, k, row, col;
        row = 4;
        col = 3;
        
        
        for (i=0;i<row;i=i+1)
            for(k=0;k<col;k=k+1)
            m[i][k]=7;
            
        for (i=0; i<row; i=i+1){
            for (k=0;k<col;k=k+1)
                System.out.print(m[i][k]+" ");
            System.out.println();
        }
    }
}







/* 1  2  3
   4  5  6 
   7  8  9 
   10 11 12 oluşturan program   */
public class Main
{
	public static void main(String[] args) {
        int m[][] = new int[4][3];
        int i, k, row, col,a;
        row = 4;
        col = 3;
        a = 0;
        
        for (i=0;i<row;i=i+1)
            for(k=0;k<col;k=k+1){
            a=a+1;
            m[i][k]= a;
                
            }
            
        for (i=0; i<row; i=i+1){
            for (k=0;k<col;k=k+1)
                System.out.print(m[i][k]+" ");
            System.out.println();
        }
    }
}








/*
  1-5-9
  2-6-10
  3-7-11
  4-8-12     oluşturan program 
  */
public class Main
{
	public static void main(String[] args) {
        int m[][] = new int[4][3];
        int i, k, row, col,a;
        row = 4;
        col = 3;
        a = 0;
        
        for(k=0;k<col;k=k+1)
            for (i=0;i<row;i=i+1){
            a=a+1;
            m[i][k]= a;
                
            }
            
        for (i=0; i<row; i=i+1){
            for (k=0;k<col;k=k+1)
                System.out.print(m[i][k]+" ");
            System.out.println();
        }
    }
}







/*
1-2-3
1-2-3
1-2-3
1-2-3
*/
public class Main
{
	public static void main(String[] args) {
        int m[][] = new int[4][3];
        int i, k, row, col,count;
        row = 4;
        col = 3;
        
        for (i=0;i<row;i=i+1){
            count=0;
            for(k=0;k<col;k=k+1)
            {
            count=count+1;
            m[i][k]=count;
            }
        }    
        for (i=0; i<row; i=i+1){
            for (k=0;k<col;k=k+1)
                System.out.print(m[i][k]+" ");
            System.out.println();
        }
    }
}







/*
1-1-1
2-2-2
3-3-3
4-4-4
*/
public class Main
{
	public static void main(String[] args) {
        int m[][] = new int[4][3];
        int i, k, row, col,count;
        row = 4;
        col = 3;
        count=0;
        for (i=0;i<row;i=i+1){
            count=count+1;
            for(k=0;k<col;k=k+1)
            {
            m[i][k]=count;
            }
        }    
        for (i=0; i<row; i=i+1){
            for (k=0;k<col;k=k+1)
                System.out.print(m[i][k]+" ");
            System.out.println();
        }
    }
}





//matristeki değerlerin toplamını ve ortalamasını veren program.
public class Main
{
	public static void main(String[] args) {
        int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
        int i, k, row, col,count;
        float toplam;
        row = 4;
        col = 3;
        toplam=0;
        
        for (i=0;i<row;i=i+1)
        {
            for (k=0;k<col;k=k+1)
            {
            toplam=toplam+m[i][k];
            }
        }    
        System.out.println ("Toplam= " +toplam);
        System.out.print ("Ortalama= " +toplam/(row*col));
    }
}






//her satırın toplamını ve ortalamısını yazdıran program
public class Main
{
	public static void main(String[] args) {
        int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
        int i, k, row, col,count;
        float toplam;
        row = 4;
        col = 3;
        
        
        for (i=0;i<row;i=i+1){
            toplam=0;
            
            for (k=0;k<col;k=k+1)
                toplam = toplam + m[i][k];
        System.out.println (i+" numaralı satırın toplamı = " +toplam);
        System.out.println (i+ " numaralı satırın ortalaması = " +toplam/col);
        }
    }
}





//her sütunun toplamını ve ortalamasını yazdıran program
public class Main
{
	public static void main(String[] args) {
        int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
        int i, k, row, col,count;
        float toplam;
        row = 4;
        col = 3;
        
        
        for (k=0;k<col;k=k+1){
            toplam=0;
            for (i=0;i<row;i=i+1)
                toplam = toplam + m[i][k];
        System.out.println (k+" numaralı sütunun toplamı = " +toplam);
        System.out.println (k+ " numaralı sütunun ortalaması = " +toplam/row);
        }
    }
}




//matrisin en büyük değerini gösteren program
public class Main
{
	public static void main(String[] args) {
        int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
        int i, k, row, col,max;
        row = 4;
        col = 3;
        max=m[0][0];
        
        for (i=0;i<row;i=i+1){
            for (k=0;k<col;k=k+1)
                if (m[i][k]>max)
                    max=m[i][k];
        }
        System.out.printf("Matrisin en büyük değeri = " +max);
    }
}





//matrisin en büyük ve en küçük değerini bulan program
public class Main
{
	public static void main(String[] args) {
        int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
        int i, k, row, col,max,min;
        row = 4;
        col = 3;
        max=m[0][0];
        min=m[0][0];
        
        for (i=0;i<row;i=i+1){
            for (k=0;k<col;k=k+1){
                if (m[i][k]>max)
                    max=m[i][k];
                else if (m[i][k]<min)
                    min=m[i][k];}
        }
        System.out.println("Matrisin en büyük değeri = " +max);
        System.out.println("Matrisin en küçük değeri = " +min);
    }
}



//matrisin en büyük elemanını ve yerini bulan program

public class Main
{
	public static void main(String[] args) {
		int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
		
		int i,k,row,col,max,r,c;
		row=4;
		col=3;
		
		max=m[0][0];
		r=0;
		c=0;
		
		for (i=0;i<row;i=i+1)
		    for(k=0;k<col;k=k+1)
		        if (m[i][k]>max) {
		            max=m[i][k];
		            r=i;
		            c=k;
		        }
        System.out.println("Matrisin en büyük elemanı: " +max+" satır no: "+r+" sütun no :"+c);
	    
	}
}




//max değer ile min değerin yerlerini değiştiren program.
public class Main
{
	public static void main(String[] args) {
		int m[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
		
		int i,k,row,col,rMin,rMax,cMin,cMax,max,min;
		row=4;
		col=3;
		
		max=m[0][0];
	    rMax=0;
		cMax=0;
		
		min=m[0][0];
		rMin=0;
	    cMin=0;
	   
		for (i=0;i<row;i=i+1)
		    for(k=0;k<col;k=k+1)
		        if (m[i][k]>max) {
		            max=m[i][k];
		            rMax=i;
		            cMax=k; }
		            
		        else if (m[i][k]<min)   {
		            min=m[i][k];
		            rMin=i;
		            cMin=k; }
		            
	    m[rMax][cMax]=min;
	    m[rMin][cMin]=max;
	    
	    for(i=0;i<row;i=i+1){
	        for(k=0;k<col;k=k+1)
	            System.out.print(m[i][k]+" ");
	           System.out.println();
	    }
	}
}







//her satırın en büyük elemanını ekrana yazdıran program.
public class Main
{
	public static void main(String[] args) {
		int m[][] = {{55,7,3},{-15,-6,-10},{22,9,1},{11,14,18}};
		
		int i,k,row,col,max;
		row=4;
		col=3;
		
		for (i=0;i<row;i=i+1){
		    max=m[i][0];
		    for(k=1;k<col;k=k+1)
		        if (m[i][k]>max)
		            max=m[i][k]; 		    
            System.out.println(i+" numaralı satırın en büyük elemanı: "+ max);
	    }
	}
}


//her sütunun en büyük elemanını ekrana yazdıran program.
public class Main
{
	public static void main(String[] args) {
		int m[][] = {{55,7,3},{-15,-6,-10},{22,9,1},{11,14,18}};
		
		int i,k,row,col,max;
		row=4;
		col=3;
		
		for(k=0;k<col;k=k+1){
		    max=m[0][k];
		    for (i=1;i<row;i=i+1)
		        if (m[i][k]>max)
		            max=m[i][k]; 		    
            System.out.println(k+" numaralı sütunun en büyük elemanı: "+ max);
	    }
	}
}




//matrisin transpozunu alan program.
public class Main
{
	public static void main(String[] args) {
		int a[][] = {{5,7,3},{15,6,10},{22,9,1},{11,14,18}};
		int b[][] = new int[3][4];
		
		int i,k,colA,colB,rowA,rowB;
		
		rowA=4;
		colA=3;
		rowB=3;
		colB=4;
		
		for (i=0;i<rowA;i=i+1)
		    for(k=0;k<colA;k=k+1)
		        b[k][i]=a[i][k];
		
	    for(i=0;i<rowB;i=i+1){
	        for(k=0;k<colB;k=k+1)
	            System.out.print(b[i][k]+" ");
	            System.out.println();
        }
	}
}





/*
10000
01000
00100
00010
00001
*/
public class Main
{
	public static void main(String[] args) {
		int m[][] = new int[5][5];
		
		int i,k,col,row;
		
		row=5;
		col=5;
		
		for (i=0;i<row;i=i+1)
            		m[i][i]=1;
		            
	    	for(i=0;i<row;i=i+1){
	        	for(k=0;k<col;k=k+1)
	          	  System.out.print(m[i][k]+" ");
	          	  System.out.println();
        	}
	}
}





/*
0 0 0 0 1
0 0 0 1 0
0 0 1 0 0 
0 1 0 0 0
1 0 0 0 0
*/
public class Main
{
	public static void main(String[] args) {
		int m[][] = new int[5][5];
		
		int i,k,col,row;
		
		row=5;
		col=5;
		
		for (i=0;i<row;i=i+1)
            m[i][(row-i-1)]=1;
		            
	    for(i=0;i<row;i=i+1){
	        for(k=0;k<col;k=k+1)
	            System.out.print(m[i][k]+" ");
	            System.out.println();
		}
	}
}





/
public class Main
{
	public static void main(String[] args) {
		int m[][] = new int[15][15];
		
		int i,k,col,row;
		
		row=15;
		col=15;
		
	    for (i=0;i<row;i=i+1){
		    m[i][i]=1;
		    m[i][col-1-i]=1;
		    m[row/2][i]=1;
		    m[i][col/2]=1;   	        
	    }         	
		            
	    for(i=0;i<row;i=i+1){
	        for(k=0;k<col;k=k+1)
	            System.out.print(m[i][k]+" ");
	            System.out.println();
        }
	}
}






/*	
1  0  0  0  0 
2  3  0  0  0
4  5  6  0  0 
7  8  9  10 0
11 12 13 14 15
*/
public class Main
    {
	public static void main(String[] args) 
	    {
		int m[][] = new int[5][5];
		
		int i,k,col,row,a;
		
		row=5;
		col=5;
		a=0;
		
	    for (i=0;i<row;i=i+1)
	        for(k=0;k<=i;k=k+1){
	            a=a+1;	       
	            m[i][k]=a;}	             	            	                   	
		            
	    for(i=0;i<row;i=i+1){
	        for(k=0;k<col;k=k+1){
	            if(m[i][k]<10)
	            System.out.print(" ");
	            System.out.print(m[i][k]+" ");}
	            System.out.println();
        	}
	}
}









/*
0  0  0  0  1
0  0  0  2  3
0  0  4  5  6
0  7  8  9  10
11 12 13 14 15
*/
public class Main{
    public static void main(String[] args){
	    int m[][] = new int[5][5];		
		int i,k,col,row,a;
		row=5;
		col=5;
		a=0;
		for (i=0;i<row;i=i+1)
	    for(k=col-i-1;k<col;k=k+1){
	        a=a+1;	       
	        m[i][k]=a;	        
	    }	             	            	                   	
		            
	    for(i=0;i<row;i=i+1){
	        for(k=0;k<col;k=k+1){
	            if(m[i][k]<10)
	                System.out.print(" ");
	                System.out.print(m[i][k]+" ");	            
	        }
	        System.out.println();
	    }
	}
}















