//dizinin en büyük elemanını ve indis numarasını bulan program.

public class Main
{
    public static void main(String[] args){
        int a[]={4,8,3,1,18,9,21,20,5,17};
        int i,size,max,p;
        size=10;
        
        max=a[0];
        p=0;
          
        for (i=1; i<size;i=i+1)
            if (a[i]>max){  
                max=a[i];
                p=i;
            }
        
        System.out.println("Dizinin en büyük elemanı : " + max);
        System.out.println("İndis numarası:" + p);
    }        
}
