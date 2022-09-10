/* while deyimi
   while(döngü devam koşulu)
      döngünün içindeki deyim(ler)

   döngünün gövdesinde birden fazla deyim olabilir. (loop body)
   {} ile birleşik deyim oluşturulur.

   çevrim sayısının belli olduğu durumlarda for, olmadığı durumlarda while kullanılacak
 */



public class Main
{
public static void main(String[] args) {
        int i;

        i = 1;
        while(i<=10) {
                System.out.println(i);
                i=i+1;
        }
}
}



//klavyeden sürekli sayı giriliyor. 0 girildiğinde programdan çıkılıyor.
public class Main
{
public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n;

        while(n!=0) {
                System.out.print("n'yi giriniz : ");
                n = kb.nextInt();
        }
}
}



//klavyeye girilen sayıları toplayan,1000'i geçtiğinde toplamı yazıdırıp programı sonlandıran kod.
public class Main
{
public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int n,z;

        z=0;

        while(z<=1000) {
                System.out.print("n'yi giriniz : ");
                n = kb.nextInt();
                z=z+n;
        }
        System.out.print("Toplam: " + z);
}
}



//
