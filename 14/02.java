public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i,k;
    
    System.out.print("n'yi giriniz : ");
        n = kb.nextInt();
    
    for(i=1;i<=n;i=i+1) 
        {
        if(i==1)
            for (k=1;k<=n;k=k+1)
                System.out.print("*");
        else if(i==n)
            for (k=1;k<=n;k=k+1)
                System.out.print("*");
        else {
            System.out.print("*");
            for (k = 1; k <= n-2 ; k = k + 1)
                System.out.print(" ");
            System.out.print("*");
            }
    System.out.println();
        }
    }
}
