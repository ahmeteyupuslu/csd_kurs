// dizideki ilk tek sayıyı ve devamındakileri 2 ile çarpan program.
public class Main {
	public static void main (String[] args) {
    	int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
    	int i, size, flag;
    	size = 10;

    	flag = 0; //gelmedi

    	for (i = 0; i < size; i = i + 1) {
      	if (a[i] % 2 != 0) flag = 1;
      	if (flag == 1) a[i] = a[i] * 2;
    	}

    	for (i = 0; i < size; i = i + 1) System.out.print(a[i] + " ");
	}
}





// klavyede girilen sayının dizide olup olmadığını ekrana yazdıran program.
public class Main {
	public static void main (String[] args) {
    	java.util.Scanner kb = new java.util.Scanner(System.in);
    	int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
    	int i,n,size,flag;
    	size=20;

    	flag=0;
    
    	System.out.print("n'yi giriniz:");
    	n=kb.nextInt();

    	for (i=0;i<size;i=i+1){
      		if (n==a[i])
        		flag=1;}

    	if (flag==0)
        System.out.print (n + " sayısı seride yoktur.")
        else 
			System.out.print(n + " sayısı seride vardır.")

    }
  }





// klavyeden girilen indis nolu elemanın kendinden önce olup olmadığını ekrana yazdıran program.
public class Main {
	public static void main (String[] args) {
    	java.util.Scanner kb = new java.util.Scanner(System.in);
    	int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
    	int i, ind, size, flag;
    	size = 20;

    	flag = 0;
    	
		System.out.print ("indis numarasını giriniz:");
    	ind=kb.nextInt ();

		for (i=0;i<ind;i=i+1){
			if (a[ind] == a[i])
				flag=1;
			}
		if (flag == 0)
			System.out.print("YOK");
		else
			System.out.print("VAR");
	}
}




// bütün indislerdeki sayıların kendisinden önce olup olmadığını kontrol eden program.
public class Main {
	public static void main (String[] args) {
    	java.util.Scanner kb = new java.util.Scanner(System.in);
    	int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
    	int i, ind, size, flag;
    	size = 20;

		for (ind = 0 ; ind < size; ind = ind + 1) {
		    flag = 0;
		    for (i =0 ; i < ind; i = i + 1)
			    if (a[ind] == a[i])
				    flag = 1;
			System.out.print (ind + " nolu eleman " + a[ind] + "kendinden önce : ");
		    if (flag == 1)
			    System.out.println ("VAR");
		    else
			    System.out.println ("YOK");
    	}
    }
}





// b serisindeki bütün sayıların a'da olup olmadığını kontrol eden program.
public class Main {
	public static void main(String[] args) {
    	java.util.Scanner kb = new java.util.Scanner(System.in);
    	int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
		int b[] = {8, 25, 7, 3, 70};
    	int i, ind, sizeA, sizeB, flag;
    	sizeA = 20;
		sizeB = 5;
		
		for (ind = 0 ; ind < sizeB; ind = ind + 1) {
		    flag = 0;
		    for (i = 0 ; i < sizeA; i = i + 1)
			    if (a[i] == b[ind])
				    flag = 1 ;
			System.out.print ("b serisindeki " + ind + " nolu eleman " + b[ind] + " a serisinde ");
		    if (flag == 1)
			    System.out.println ("VAR");
		    else
			    System.out.println ("YOK");
		}
	}
}





// sadece b dizisinde olan elemanları ekrana yazdıran program.
public class Main {
	public static void main (String[] args) {
    	java.util.Scanner kb = new java.util.Scanner(System.in);
    	int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
		int b[] = {8, 25, 7, 3, 70};
    	int i, ind, sizeA, sizeB, flag;
    	sizeA = 20;
		sizeB = 5;
		
		for (ind = 0; ind < sizeB; ind = ind + 1) {
		    flag = 0;
		    for (i =0 ; i < sizeA; i = i + 1)
			    if (a[i] == b[ind])
				    flag = 1 ;
		    if (flag == 0)
			    System.out.println (b[ind] + " sayısı sadece b serisinde vardır.");
		}
	}
}
