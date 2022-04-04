package application_part_for_Goshopping;
import java.util.*;
public class GSShopFactory {
	Scanner sc=new Scanner(System.in);
	int flag;
	float OverAllCharges;
	int delivery_charges=100;
	float product_charges;
		
	public void GetNewPrimeAccount()// create prime account	
	{		System.out.println("enter the your website account no or userid:");
			int acc_no=sc.nextInt();
			System.out.println("how many months you want prime subscribtion:");
			int months=sc.nextInt();
			System.out.println("enter your bank account no:");
			long bank_acc=sc.nextLong();
			int charges=0;
			System.out.println("enter your product charges:");
			 product_charges=sc.nextFloat();
			
		
		switch(months)
		{
		case 1:
			{System.out.println("charges=100");
			charges=100;
			break;}
			
		case 2:
		{System.out.println("charges=200");
		charges=200;
		break;}	
		
		case 3:
		{System.out.println("charges=300");
		charges=300;
		break;}
		
		case 4:
		{System.out.println("charges=400");
		charges=400;
		break;}
		
		case 5:
		{System.out.println("charges=100");
		charges=500;
		break;}
		
		case 6:
		{System.out.println("charges=600");
		charges=600;
		break;}
		
		case 7:
		{System.out.println("charges=700");
		charges=700;
		break;}
		
		case 8:
		{System.out.println("charges=800");
		charges=800;
		break;}
		
		case 9:
		{System.out.println("charges=900");
		charges=900;
		break;}
		
		
		case 10:
		{System.out.println("charges=1000");
		charges=1000;
		break;}
		
		case 11:
		{System.out.println("charges=1100");
		charges=1100;
		break;}
		
		case 12:
		{System.out.println("charges=1200");
		charges=1200;
		break;}
		
		default:
			System.out.println("invalid month");
			break;
		
	   }//end switch case foe month
		
		if(charges>100)
		{
			 flag=1;
			System.out.println("now this is prime account");
		}
		else {
			System.out.println("this is not a prime account");
			  flag=0;
		}
		System.out.println("enter the product charges:");
		float product_charges=sc.nextFloat();
		if(flag==0) {
			getNewNormalAcc();
			//OverAllCharges=delivery_charges+product_charges;
			//System.out.println("over all charges for your order is "+OverAllCharges);
			
		}
		else {
			OverAllCharges=product_charges;
			System.out.println("over all charges for your order is "+OverAllCharges);
		}
		
}
	public void getNewNormalAcc()//create normal account
	 {
		 System.out.println("enter the your website account no or userid");
		 int acc_no=sc.nextInt();
		 System.out.println("enter your bank account no:");
			long bank_acc=sc.nextLong();
		System.out.println("enter your product charges:");
		 product_charges=sc.nextFloat();
		System.out.println("delivery charges for this product is 100rs per order");
		OverAllCharges=product_charges+delivery_charges;
		System.out.println("over all charges for your order is "+OverAllCharges);
	
		 
	 }
}