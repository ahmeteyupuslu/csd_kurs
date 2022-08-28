//kabarcıklı sıralama

public class Main
{
	public static void main(String[] args) {
    
    int a[]={4,8,3,1,18,9,21,20,5,17};
    int i,k,size,min,p,temp;
    size=10;
    
    for(i=0;i<size-1;i=i+1)
        for(k=0;k<size-1-i;k=k+1)
            if(a[k]>a[k+1]){
                temp=a[k];
                a[k]=a[k+1];
                a[k+1]=temp;
            }
    for(i=0;i<size;i=i+1)
        System.out.print(a[i]+" ");
    System.out.println();
	}
}
