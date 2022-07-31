public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
	    int x, y1, y2, z1, z2; 
	    
	    System.out.print ("x değerini giriniz: ");
	    x = kb.nextInt();
        
        y1 = x*x+2*x;
        y2 = x;
        z1 = 3*x;
        z2 = x*x + 10;
        
        if (x < 0){
            System.out.println("y = " +y1);
            System.out.println("z = " +z1);
        }
        else {
            System.out.println("y = " +y2);
            System.out.println("z = " +z2);
        }
	}
}
