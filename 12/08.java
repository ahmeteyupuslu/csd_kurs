//min değeri birinci sayı ile değiştiren program.

public class Main
{
    public static void main(String[] args){
        int a[]={4,8,3,1,18,9,21,20,5,17};
        int i,size,min,k;
        size=10;
        
        min=a[0];
        k=0;
        
        for (i=1; i<size;i=i+1)
            if (a[i]<min){
                min=a[i];
                k=i;}
                
        a[k]=a[0];
        a[0]=min;  
        
        for (i=0;i<size;i=i+1)
            System.out.print(a[i]+" ");
    }
}
