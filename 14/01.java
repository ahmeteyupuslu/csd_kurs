/*n=7 girince
   *
   *
   *
*******
   *
   *
   *
*/         




//benim çözüm

public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i,k;
    
    System.out.print("n'yi giriniz : ");
        n = kb.nextInt();
    
    for(i=1;i<=n/2;i=i+1){
        for(k=1;k<=n/2;k=k+1)
            System.out.print(" ");
    System.out.println("*");}
    for(i=1;i<=n;i=i+1)
        System.out.print("*");
        System.out.println();
    for(i=1;i<=n/2;i=i+1){
        for(k=1;k<=n/2;k=k+1)
            System.out.print(" ");
    System.out.println("*");}        
    }
}








//hocanın çözümü



public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i,k;
    
    System.out.print("n'yi giriniz : ");
        n = kb.nextInt();
    
    for(i=1;i<=n;i=i+1){
        if(i==(n/2+1))
            for (k=1;k<=n;k=k+1)
                System.out.print("*");
        else{
            for (k=1;k<=n/2;k=k+1)
                System.out.print(" ");
            System.out.print("*");}
        System.out.println();
    }
}
}
