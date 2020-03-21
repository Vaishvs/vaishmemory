package com.zensar.emdb.main;
import java.util.Scanner;


public class MainTest{
	
	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Menu: ");
			System.out.println("1.HR ");
			System.out.println("2.Employee ");
			System.out.println("Enter your choice ");
			int choice,ch;
			ch = sc.nextInt();
			
	         switch(ch) {
	         case 1:
	         {
	        	 
	        	System.out.println("Menu: ");
	     		System.out.println("1.Insert new Employee ");
	     		System.out.println("2.Delete Existing Employee ");
	     		System.out.println("3.Modify Salary of Employee ");
	     		System.out.println("4.Modify Designation of Employee ");
	     		System.out.println("5.Display ALL ");
	     		System.out.println("Enter your choice ");
	    		choice=sc.nextInt();
	        	switch(choice) {
	        	 case 1:
	        		 	allFunctions.insert();
	        		 	break;
	        	 case 2:
	        		 	allFunctions.delete();
	        		 	break;
	        	 case 3:
	        		 	allFunctions.modifySalary();
	        		 	break;
	        	  case 4:
	        		  	allFunctions.modifyDesignation();
	        		  	break;
	        	  case 5:
	        		  System.out.println("Data of all employees are: ");
	        		  allFunctions.displayAll();
	        		  break;
	        		  
	        	 }
	         }
	         case 2:
	           {
	        	   System.out.println("Menu: ");
	        	   System.out.println("1.Display my Details ");
	        	   System.out.println("2.Display my Salary slip");
	        	   System.out.println("Enter your choice: ");
	       		   int ch2;
	       		   ch2=sc.nextInt();
	    	      switch(ch2) {
	    	      case 1:
	    	    	  allFunctions.displayOne();
	    	    	  break;
	         		  
	    	      case 2:
	    	    	  allFunctions.showMySalary();
	    	    	  break;
	    	      }
	           }
	        }
	}
}





