//dizinin son n adet elemanını baştan sonra doğru yazdıran program

public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	int i, n,size;
	size = 10;
	
	System.out.print("n değerini giriniz : ");
    n = kb.nextInt();
	    
    for (i=size-n;i<size;i=i+1)
        System.out.println(a[i]);
	}
}
