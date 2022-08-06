public class Main
{
  public static void main (String[]args)
  {
    java.util.Scanner kb = new java.util.Scanner (System.in);
    int a, b, c;

      System.out.print ("a kenarının uzunluğunu giriniz : ");
      a = kb.nextInt ();

      System.out.print ("b kenarının uzunluğunu giriniz : ");
      b = kb.nextInt ();

      System.out.print ("c kenarının uzunluğunu giriniz : ");
      c = kb.nextInt ();


    if ((a + b) <= c)
        System.out.print ("bu değerler ile üçgen oluşturulamaz");
    else 
        if ((a + c) <= b)
        System.out.print ("bu değerler ile üçgen oluşturulamaz");
        else 
    if ((b + c) <= a)
        System.out.print ("bu değerler ile üçgen oluşturulamaz");
    else 
        if (a == b)
            if (a != c)
	        System.out.print ("bu değerler ile bir ikizkenar üçgen oluşturulabilir.");
            else
	        System.out.print ("bu değerler ile eşkenar üçgen oluşturulabilir");
            else 
                if (a == c)
                System.out.print ("bu değerler ile bir ikizkenar üçgen oluşturulabilir");
                else 
                    if (b == c)
                    System.out.print ("bu değerler ile bir ikizkenar üçgen oluşturulabilir");
                    else
                    System.out.print ("bu değerler ile bir üçgen oluşturulabilir.");

  }
}
