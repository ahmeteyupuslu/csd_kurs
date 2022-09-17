//klavyeden girilen sayıyı listeye sırasına göre ekleyen program. 
public class Main {
	public static void main (String[] args) {
    		java.util.Scanner kb = new java.util.Scanner(System.in);
                int a[] = {1, 5, 12, 15, 19, 28, 35, 46, 60, 0};
                int i, k, size, n;
                size = 10;
                
                System.out.print("Bir sayı giriniz : ");
                n = kb.nextInt();
		
		if (n >= a[size - 2])
			a[size - 1] = n;
		else {                
			i = 0;
			while (n >= a[i])
				i = i + 1;
			for (k = size - 2; k >=i; k = k - 1)
				a[k + 1] = a[k];
			a[i] = n;
		}
                
                for (i = 0; i < size; i = i + 1)
                        System.out.print(a[i] + " ");
	}
}

//üstteki örnek, başka bir yöntem ile.
public class Main {
	public static void main (String[] args) {
    		java.util.Scanner kb = new java.util.Scanner(System.in);
                int a[] = {1, 5, 12, 15, 19, 28, 35, 46, 60, 0};
                int i, size, temp;
                size = 10;
                
                System.out.print("Bir sayı giriniz : ");
                a[size - 1] = kb.nextInt();
                
                for (i = size - 2; i >= 0; i = i - 1)
		        if (a[i] > a[i+1]) {
		                temp = a[i];
		                a[i] = a[i + 1];
		                a[i + 1] = temp;
		        }
                
                for (i = 0; i < size; i = i + 1)
                        System.out.print(a[i] + " ");
	}
}

// basamaklarının küplerinin toplamı kendisine eşit olan üç basamaklı sayıları bulan program.
public class Main {
	public static void main (String[] args) {
    		int i, k, m, c,size;
    		size = 10;
    		
                for (i = 1; i < size; i = i + 1)
		        for (k = 0; k < size; k = k + 1)
		                for (m = 0; m < size; m = m + 1){
		                c = i * 100 + k * 10 + m * 1;
		                if ((i * i * i + k * k * k + m * m * m) == c)
		                        System.out.println(c);
		        }
	}
}

// hocanın gösterdiği başka bir yöntem
public class Main {
	public static void main (String[] args) {
    		int i, a, b, c, a3, b3, c3;
    		
    		for (i = 100; i <= 999; i = i + 1) {
    		        a = i / 100;
    		        b = i / 10 % 10;
    		        c = i % 10;
    		        a3 = a * a * a;
    		        b3 = b * b * b;
    		        c3 = c * c * c;
    		        
    		        if (i == a3 + b3 + c3)
    		                System.out.println(i);
                }
	}
}
