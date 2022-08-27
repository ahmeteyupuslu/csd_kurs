//a dizisinde tekleri başa,çiftleri sona atayan program.
public class Main
{
    public static void main(String[] args){
        int a[]={4,8,3,1,18,9,21,20,5,17};
        int i,size,temp,p;
        size=10;
        p=0;
        
        for (i=0; i<size;i=i+1)
            if (a[i]%2!=0)
            {
            temp=a[i];
            a[i]=a[p];
            a[p]=temp;
            p=p+1;
            }
            
        for (i=0;i<size;i=i+1)
            System.out.print(a[i]+" ");
     
    }
}
