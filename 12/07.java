//dizinin en büyük elemanı ile en küçük elemanının yerlerini değiştiren program.

public class Main
{
    public static void main(String[] args){
        int a[]={4,8,3,1,18,9,21,20,5,17};
        int i,size,max,min,temp,p,k;
        size=10;
        
        max=a[0];
        min=a[0];
        p=0;
        k=0;
        
        for (i=1; i<size;i=i+1)
            if (a[i]>max){
                max=a[i];
                p=i;}
            else if (a[i]<min){
                min=a[i];
                k=i;}
        
        a[p]=min;
        a[k]=max;
        
        for (i=0;i<size;i=i+1)
            System.out.print(a[i]+" ");


     
    }
}
