//10dan 90a kadar 4er 4er artarak giden Fahrenheit cinsinden sıcaklık değerlerinin Celcious karşılıklarını ekrana yazdıran program.

public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
		double c,f;
	 
	    for (f=10; f<=90 ; f=f+4)
	    {
	        c=5.0/9.0*(f-32);
	        System.out.println("C :" +c +" F: " +f);    }
	}
}

