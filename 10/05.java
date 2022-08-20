//dizinin ilk n adet elemanını dizinin sonuna atayan ve baştaki elemanları sıfırlayan program.

public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	int i,size,n;
	size = 10;
	
	System.out.print("n değerini giriniz : ");
    n = kb.nextInt();
    
	for (i=size-1;i>=size-n;i=i-1)
    a[i]=a[i-(size-n)];
    
  for (i=0;i<size-n;i=i+1)
    a[i]=0;
    
  for (i=0;i<size;i=i+1)  
    System.out.print(a[i]+ " ");
	}
}
