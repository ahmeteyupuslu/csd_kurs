public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb =  new java.util.Scanner (System.in);
	    int yaricap;
	    double pi, area;
	    
	    //
	    
	    System.out.print ("Yarı çapı giriniz : ");
	    yaricap = kb.nextInt();
	    
	    pi = 3.14159;
	    
	    
		area = pi * yaricap * yaricap ;
		System.out.print ("alan = " + area);
	}
}
