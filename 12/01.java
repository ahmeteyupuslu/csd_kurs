public class Main
{
    public static void main(String[] args){
        int a[]={4,8,3,1,18,9,21,20,5,17};
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i,size,s,n,temp;
        size=10;
        
        System.out.print("s'yi giriniz : ");
        s = kb.nextInt();
        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();
    
        for (i=0; i<n/2;i=i+1){
            temp=a[s+i];
            a[s+i]=a[s+n-1-i];
            a[s+n-1-i]=temp;
        }
        
        for (i=0;i<size;i=i+1)
            System.out.print(a[i]+" ");
     
    }
}
