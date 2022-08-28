/*  

n=4 için
****
***
**
*
*

*/

public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i,k;
    
    System.out.print("n'yi giriniz : ");
        n = kb.nextInt();
    
    for(i=n;i>0;i=i-1){
        for(k=0;k<i;k=k+1)
        System.out.print("*");
        System.out.println();    
        }
    }
}
