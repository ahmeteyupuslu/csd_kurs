//son n değerlerini sağdan sola yazdırır.
public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	int i, n,size;
	size = 10;
	
	System.out.print("n değerini giriniz : ");
  n = kb.nextInt();
	    
  for (i=size-1;i>=size-n;i=i-1)
    System.out.println(a[i]);
	}
}
