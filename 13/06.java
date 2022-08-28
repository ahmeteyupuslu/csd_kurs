//dizinin elemanlarını sırası kadar yazdıran program

public class Main
{
	public static void main(String[] args) {
    
    int a[]={4,8,3,1,18,9,21,20,5,17};
    int i,k,size;
    size=10;
    
    for(i=0;i<size;i=i+1){
        for(k=0;k<i+1;k=k+1)
        System.out.print(a[i]+" ");
        System.out.println();    
        }
    }
}
