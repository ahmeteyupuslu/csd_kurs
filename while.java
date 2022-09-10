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

//klavyeden girilen sayıyı basamaklarına ayıran, sonrasında diziye kaydeden program.
public class Main {

  public static void main(String[] args) {
    int a[] = new int[10];
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n, size, i, b;

    System.out.print("n'yi giriniz : ");
    n = kb.nextInt();

    i = 0;
    size = 0;

    while (n != 0) {
      a[i] = n % 10;
      i = i + 1;
      n = n / 10;
      size = size + 1;
    }
    i = 0;
    for (i = 0; i < size; i = i + 1) System.out.printf(a[i] + " ");
  }
}

//klavyeden girilen sayının tersiyle yeni bir sayı elde eden program ve bunu 2 ile çarpan program.
public class Main {

  public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n, size, k, a, m, c;

    System.out.print("n'yi giriniz : ");
    n = kb.nextInt();

    k = 0;
    c = 1;
    m = n;

    while (m != 0) {
      m = m / 10;
      c = c * 10;
    }

    while (n != 0) {
      a = n % 10;
      n = n / 10;
      c = c / 10;
      k = k + (a * c);
    }
    System.out.println("yeni sayı: " + k);
    System.out.printf("yeni sayının iki katı: " + (2 * k));
  }
}

//klavyeden girilen sayının basamaklarındaki sayılarla elde edilebilecek en büyük sayıyı bulan program.

