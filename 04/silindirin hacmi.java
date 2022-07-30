public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb =  new java.util.Scanner (System.in);
	    int yaricap, yukseklik;
	    double pi, hacim;
	    
	    //
	    
	    System.out.print ("Yarı çapı giriniz : ");
	    yaricap = kb.nextInt();
	    
	    System.out.print ("Yüksekliği giriniz : ");
	    yukseklik = kb.nextInt();
	    
	    pi = 3.14159;
	    
	    
		hacim = pi * yaricap * yaricap * yukseklik ;
		System.out.print ("silidirin hacmi = " + hacim);
	}
}
