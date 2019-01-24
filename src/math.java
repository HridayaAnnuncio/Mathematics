import java.util.*;
public class math {
public static void main(String args[])
{	Scanner sc =  new Scanner(System.in);
	int i=1, c ,a,b,r=0;
	System.out.println("Enter 2 numbers:");
	a=sc.nextInt();
	b=sc.nextInt();
	
	while(i==1)
	{System.out.println("Choose: 1) Add 2)Subtract 3) Multiply 4) Divide");
	c= sc.nextInt();
		switch(c)
	{ case 1: r=a+b;
	   		  break;
	 case 2: r=a-b;
		  break;
	 case 3: r=a*b;
		  break;
	 case 4: r=a/b;
		  break;
	 default: System.out.println("Wrong Choice!!!!!!!!!!!!");
		  break;
	
	}
	
	System.out.println("Result:"+ (float)r);
    System.out.println("do you want to choose again?(y=1)");
    i=sc.nextInt();
    
	}
}
}
