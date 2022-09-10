/* while deyimi
   while(döngü devam koşulu)
      döngünün içindeki deyim(ler)

   döngünün gövdesinde birden fazla deyim olabilir. (loop body)
   {} ile birleşik deyim oluşturulur.

   çevrim sayısının belli olduğu durumlarda for, olmadığı durumlarda while kullanılacak
 */

public class Main {

  public static void main(String[] args) {
    int i;

    i = 1;
    while (i <= 10) {
      System.out.println(i);
      i = i + 1;
    }
  }
}

//klavyeden sürekli sayı giriliyor. 0 girildiğinde programdan çıkılıyor.
public class Main {

  public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n;

    while (n != 0) {
      System.out.print("n'yi giriniz : ");
      n = kb.nextInt();
    }
  }
}

//klavyeye girilen sayıları toplayan,1000'i geçtiğinde toplamı yazıdırıp programı sonlandıran kod.
public class Main {

  public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n, z;

    z = 0;

    while (z <= 1000) {
      System.out.print("n'yi giriniz : ");
      n = kb.nextInt();
      z = z + n;
    }
    System.out.print("Toplam: " + z);
  }
}

//dizideki ilk tek sayıyı bulan program
public class Main {

  public static void main(String[] args) {
    int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
    int i;
    i = 0;
    while (a[i] % 2 == 0) {
      i = i + 1;
    }
    System.out.print("Serideki ilk tek sayı: " + a[i]);
  }
}

//klavyeden girilen sayıyı basamaklarına ayıran program.
public class Main {

  public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n;

    System.out.print("n'yi giriniz : ");
    n = kb.nextInt();

    while (n > 0) {
      System.out.println(n % 10);
      n = n / 10;
    }
  }
}
