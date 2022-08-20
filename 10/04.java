//dizinin s nolu elemanından başlayarak n adet elemanını ekrana yazdıran program.

public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	int i,s,size,n;
	size = 10;
	
	System.out.print("s değerini giriniz : ");
    s = kb.nextInt();
	System.out.print("n değerini giriniz : ");
    n = kb.nextInt();
    
	    
    for (i=s;i<s+n;i=i+1)
        System.out.print(a[i]+" ");
	}
}
