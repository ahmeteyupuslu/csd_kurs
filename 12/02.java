//a dizisindeki tek sayıları b dizisinin başına, çift sayıları sonuna atayan program.
public class Main
{
    public static void main(String[] args){
        int a[]={4,8,3,1,18,9,21,20,5,17};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int b[]=new int[10];
        int i,size,s,po,pe;
        size=10;
        
        po=0;
        pe=size-1;
    
        for (i=0; i<size;i=i+1)
            if(a[i]%2!=0)
                {
                b[po]=a[i];
                po=po+1;
                }
            else
                {
                b[pe]=a[i];
                pe=pe-1;
                }
        for (i=0;i<size;i=i+1)
            System.out.print(b[i]+" ");
     
    }
}
