package PRODUCT;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		
		 ProductOperation p1=new ProductOperation();
		
		System.out.println("1:Login 2:signup");
		int choice=sc.nextInt();
		if(choice==1)
		{
			
			System.out.println("Enter the user name");
			String user=sc.next();
			System.out.println("Enter the password");
			String pass=sc.next();
			
			boolean b=p1.login(user, pass);
			
			if(b)
			{
				System.out.println("1:Add product");
				System.out.println("2:Update PRoduct");
				System.out.println("3:Delete product");
				System.out.println("4:Display product");
				int mode=sc.nextInt();
				
				if(mode==1)
				{
					
					
				}
				
				
				}
			else {
				System.out.println("Inavalid information");
			}
			
		}
		else if(choice==2)
		{
			
		}

	}
	
	void AddProduct()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the product name");
		String name=sc.next();
		
		System.out.println("Enter the product price");
		
		double price=sc.nextDouble();
		System.out.println("Enter the product category");
		String category=sc.next();
		p1.AddProduct
		
	}

}
