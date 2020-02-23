package Sprint1.HealthCareSystem.UI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Sprint1.HealthCareSystem.DiagnosticCenter;
import Sprint1.HealthCareSystem.User;
import Sprint1.HealthCareSystem.Service.Service;
import Sprint1.HealthCareSystem.Service.ServiceImpl;
import Sprint1.HealthCareSystem.*; 
public class HCSUI {
public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	Service hs=new ServiceImpl();
	ArrayList<Test>listsOfTests=new ArrayList<Test>();
	int choice=0;
	Test test=new Test();

	do 
	{
		try{
			
		System.out.println("Admin");
		System.out.println("1.add center");
		System.out.println("2.display center");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			try
			{
				sc.nextLine();
				DiagnosticCenter dc=new DiagnosticCenter();
				System.out.println("enter center name");
				
				String centerName=sc.nextLine();
				dc.setCenterName(centerName);
				hs.addCenter(dc);
				String centerId=dc.getCenterId();
				System.out.println("id="+centerId);
				System.out.println("Center added successfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			break;	
				
		case 2:
			try
			{
				sc.nextLine();
				List<DiagnosticCenter>l=hs.displaycenter();
				for(DiagnosticCenter d:l)
				{
					String ci=d.getCenterId()+" "+d.getCenterName();
					System.out.println(ci);
					List<Test>t=d.getListOfTests();
					for(Test y:t){
						String tname=y.getTestName();
						System.out.println(tname);
					}
				}
		}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		
		}
		}
		catch(Exception e)
		{
			throw new Exception("Choose only 2 options");
		}
		
	}while(choice!=5);
		}
}

		

	

	








