/*
    *    
   ***
  *****
 *******
*********

*/


public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i,k;
    
    System.out.print("n'yi giriniz : ");
        n = kb.nextInt();
    
    for(i=1;i<=n;i=i+2){
        for(k=1;k<=(n-i)/2;k=k+1)
            System.out.print("x");
        for(k=1;k<=i;k=k+1)
            System.out.print("*");
        System.out.println();}       
    }
}
