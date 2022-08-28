/*klavyeden girilen n'ye göre belirtilen deseni ekrana bastıran program.
n 5 ise 
*****
*****
*****
*****
*****    
altıya 6x6
*/

public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i,k;
    
    System.out.print("n'yi giriniz : ");
        n = kb.nextInt();
    
    for(i=1;i<=n;i=i+1){
        for(k=1;k<=n;k=k+1)
        System.out.print("*");
        System.out.println();    
        }
    }
}
