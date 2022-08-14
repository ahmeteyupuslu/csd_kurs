//klavyeden girilen 5 sayıyı toplayan program

public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner kb=new java.util.Scanner(System.in);
	    int a,b,c,d,e,sum;
	    
		System.out.println("İlk sayıyı giriniz");
		a = kb.nextInt();
        System.out.println("İkinci sayıyı giriniz");
		b = kb.nextInt();
		System.out.println("Üçüncü sayıyı giriniz");
		c = kb.nextInt();
        System.out.println("Dördüncü sayıyı giriniz");
		d = kb.nextInt();
		System.out.println("Beşinci sayıyı giriniz");
		e = kb.nextInt();
        
		sum=a+b+c+d+e;
		
	    System.out.println(sum);
		    
	}
}
