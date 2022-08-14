// klavyeden x ve y giriliyor. x<y kabul. x'den büyük,y'den küçük dizi elemanlarını ekrana yazdıran program.
public class Main
{
    public static void main(String[] args) 
    {
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a[]= {4,8,3,1,18,9,21,20,5,17};
    int i,size,x,y;	 
    size = 10;
    
    System.out.print("x değerini giriniz : ");
    x = kb.nextInt();
    System.out.print("y değerini giriniz : ");
    y = kb.nextInt();
    
    for (i = 0; i < size; i = i+1)
        if (a[i]<y)
        if (a[i]>x)
        System.out.println(a[i]);
    }
}

