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
