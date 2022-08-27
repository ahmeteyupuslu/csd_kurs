//dizinin en büyük ve en küçük elemanını bulan program.
public class Main
{
    public static void main(String[] args){
        int a[]={4,8,3,1,18,9,21,20,5,17};
        int i,size,max,min;
        size=10;
        
        max=a[0];
        min=a[0];
        
        for (i=1; i<size;i=i+1)
            if (a[i]>max)
                max=a[i];
            else if (a[i]<min)
                min=a[i];
        
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
     
    }
}
