java.util.Scanner kb=new java.util.Scanner(System.in);
	    int a;
	    
	    System.out.print("a'yı giriniz : ");
	    a = kb.nextInt();
    	    
	    
	    if (a >= 100 )
	        System.out.println("0-100 arasında değil");
	    else    
	        if (a > 0 )
	            System.out.println("0-100 arasında");
	        else
	            System.out.println("0-100 arasında değil");
