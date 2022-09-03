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

















