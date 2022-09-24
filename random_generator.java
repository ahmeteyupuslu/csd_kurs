//basit random generator oluşturma
public class Main
{
	public static void main(String[] args) {
		java.util.Random generator = new java.util.Random();
		int n;
		
		n = generator.nextInt(10);
		System.out.println(n);
	}
}

//10'dan küçük 1000 adet rastgele sayı üreten ve bunları ekrana yanyana yazdıran program.
public class Main
{
	public static void main(String[] args) {
		java.util.Random generator = new java.util.Random();
		int n, i;
		
		for(i = 0; i < 1000; i = i + 1) {
			n = generator.nextInt(10);
			System.out.print (n + " ");
		}
	}
}

//oluşturulan sayıların kaçı tek kaçı çift?
public class Main
{
	public static void main(String[] args) {
		java.util.Random generator = new java.util.Random();
		int n, i, total, tek, cift;
		 
		total = 1000;
		tek = 0;
		cift = 0;
		
		for(i = 0; i < total; i = i + 1) {
		        n = generator.nextInt(10);
		        if (n % 2 == 0)
		                cift = cift + 1;
		        else 
		                tek = tek + 1;
		}
		
		System.out.print(cift + " tane çift sayı "+ tek + " tane tek sayı oluşturuldu.");
	}
}

//1000 defa iki tane rastgele indis numarası üretip bu elemanları yer değiştiren program
public class Main
{
	public static void main(String[] args) {
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		java.util.Random generator = new java.util.Random();
		int n, i, k, total, temp;
		 
		total = 1000;
		
		for(i = 0; i < total; i = i + 1) {
		        n = generator.nextInt(10);
		        temp = a[n];
		        k = generator.nextInt(10);
		        a[n] = a[k];
		        a[k] = temp;
		}
		
		for(i = 0; i < 10; i = i + 1)
		        System.out.print(a[i] +" ");
	}
}

//dizi karıştırıldıktan sonra aynı yerinde kalan eleman sayısını belirleme.
public class Main
{
	public static void main(String[] args) {
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		java.util.Random generator = new java.util.Random();
		int i, size, ind1, ind2, total, temp, count;
		size = 10;
		 
		total = 1000;
		
		for(i = 0; i < total; i = i + 1) {
		        ind1 = generator.nextInt(10);
		        ind2 = generator.nextInt(10);
		        temp = a[ind1];
		        a[ind1] = a[ind2];
		        a[ind2] = temp;
		}
		
		count = 0;
		for(i = 0; i < size; i = i + 1)
		        if (a[i] == b[i])
		        count = count + 1;
		    
	        System.out.println(count + " adet eleman yerinde kalmış...");	    
	}
}

//hepsi karışana kadar çalışmasını istersek:
public class Main
{
	public static void main(String[] args) {
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		java.util.Random generator = new java.util.Random();
		int i, size, ind1, ind2, temp, count;
		size = 10;
		count = 1;
		
		while (count != 0){
		        ind1 = generator.nextInt(10);
		        ind2 = generator.nextInt(10);
		        temp = a[ind1];
		        a[ind1] = a[ind2];
		        a[ind2] = temp;
		        
		        count = 0;
		        for (i = 0; i < size; i = i + 1)
		                if (a[i] == b[i])
		                count = count + 1;
		       }   
		
		
		for (i = 0; i < 10; i = i + 1)
	                System.out.print (a[i] + " ");	 
	}	          
}

//bir milyon işlemde ortalama kaç kere karışması gerektiğini bulmak istersek. aynı kodun içinde 1 kerelik tamamen farklı sonuca ulaşmak istedi kere karışması gerektiği de var.
//ben seriyi for içine alarak sürekli 2 çıkma hatasını bulmuştum.
public class Main
{
	public static void main(String[] args) {
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		java.util.Random generator = new java.util.Random();
		int i, k, size, ind1, ind2, temp, count, countShuffle, avgcountShuffle;
		size = 10;
		countShuffle = 0;
		
		for(k = 0; k < 1000000 ; k = k + 1) {
			        
		count = 1;
		while (count != 0) {
		        countShuffle = countShuffle + 1;
		        
		        ind1 = generator.nextInt(10);
		        ind2 = generator.nextInt(10);
		        
		        temp = a[ind1];
		        a[ind1] = a[ind2];
		        a[ind2] = temp;
		        
		        count = 0;
		        for (i = 0; i < size; i = i + 1)
		                if (a[i] == b[i])
		                count = count + 1;
		       
		       }   
	        for (i = 0;i < size; i = i + 1)
	                a[i] = b[i];
		}
		
		avgcountShuffle = countShuffle/1000000;
		
		System.out.print("Ortalama " + avgcountShuffle + " defa karıştıktan sonra dizi tamamen karıştı.");
	
        }
}


//kaç defa karışırsa eski haline döner
public class Main
{
	public static void main(String[] args) {
	        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
		java.util.Random generator = new java.util.Random();
		int i, k, size, ind1, ind2, temp, count, countShuffle, countShuffleplus;
		size = 10;
		
		countShuffle = 0;
		
		count = 0;
		while (count != 10) {
		        countShuffle = countShuffle + 1;
		        
		        ind1 = generator.nextInt(10);
		        ind2 = generator.nextInt(10);
		        
		        temp = a[ind1];
		        a[ind1] = a[ind2];
		        a[ind2] = temp;
		        
		        count = 0;
		        for (i = 0; i < size; i = i + 1)
		                if (a[i] == b[i])
		                count = count + 1;
		       
		       }
		
		System.out.print(countShuffle + " defa karıştıktan sonra dizi eski haline döndü.");
        }
}


//
