package com.zensar.emdb.main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.zensar.emdb.bean.Employee;
import com.zensar.emdb.bean.EmployeeSalary;
import com.zensar.emdb.dao.DaoClass2;
import com.zensar.emdb.dao.daoClass;
import com.zensar.emdb.exception.AgeException1;
import com.zensar.emdb.exception.BasicPayException;
import com.zensar.emdb.exception.DesignationException;
import com.zensar.emdb.exception.EcodeException;
import com.zensar.emdb.exception.EnameException;


public class allFunctions {
	static Scanner sc = new Scanner(System.in);
	static int choice,eCode,age;
	static String designation,eName;
	static double basicPay;
	static Employee tempEmp = null;
	static daoClass tempDao =  new daoClass();
	
	public static void insert() {

		
			try {
				System.out.println("Enter ID of Employee");
				eCode=sc.nextInt();
		 
				int num=Integer.toString(eCode).length();
				if(num>4 || num<4) 
				{
					throw new EcodeException();
				}
		 
		 System.out.println("Enter Name of Employee");
		 eName=sc.next();
		 
		 if(eName.length() > 20) {
			 throw new EnameException();
		 }
		 
		 char arr[] = eName.toCharArray();
		 for(int lc= 0; lc<arr.length; lc++ ) {
			 if( arr[lc] >= 97 && arr[lc] <= 122 ) 
				 throw new EnameException();
		 }
		 
		 System.out.println("Enter Designation of Employee");
		 designation=sc.next();
		
	     //if(designation.contains("SE")||!designation.contains("SSE")
			 //||!designation.contains("SS")||!designation.contains("SSS"))

			/*
			 * if(!designation.contentEquals("SE")||designation.contentEquals("SSE")
			 * ||!designation.contentEquals("SS")||designation.contentEquals("SSS")){ throw
			 * new DesignationException(); }
			 */
		 
		 if(designation.equals("SE")||designation.equals("SSE")
			  ||designation.equals("SS")||designation.equals("SSS")) {
			 
		 }
		 else {
			 throw new DesignationException();
		 }
	  System.out.println("Enter Age of Employee");
	  age=sc.nextInt();
	  
	  if(age < 18 || age > 80) {
		  throw new AgeException1();
	  }
	  
	  System.out.println("Enter Basic Pay of Employee");
	  basicPay=sc.nextDouble();
	  if(basicPay < 6000) {
		  throw new BasicPayException();
	 }
	  
	 tempEmp= new Employee(eCode , eName, designation , age , basicPay);
	 tempDao.insert(tempEmp);
	 
	 }catch(EnameException e1) {
		 System.out.println("Employee name can be of maximum 20 characters.");
	 }catch(EcodeException e2) {
		 System.out.println("Employee code must be 4 digit");
	 }catch(DesignationException e3) {
		System.out.println("Employee designation should be valid");
	 }
	catch(AgeException1 e4) {
		 System.out.println("Employee age must in between 18 and 80");
	 }catch(BasicPayException e5) {
		 System.out.println("Employee salary must be greater than 6000/- ");
	 }
		
   }

		//delete function
		
		public static void delete() {
			tempEmp =new Employee();
			
			System.out.println("Enter ID of Employee");
			eCode=sc.nextInt();
			tempEmp.seteCode(eCode);
			if(tempDao.delete(tempEmp) ) {
				System.out.println("\nDelete Successfully!!!");
			}else {
				System.out.println("\nDeletion"
						+ " Failed!!!");
			}
		}
		
		public static void modifySalary() {
			tempEmp =new Employee();
			System.out.println("Enter ID of Employee");
   		  	eCode=sc.nextInt();
   		  	System.out.println("Enter new Basic Pay of Employee");
   		  	basicPay=sc.nextDouble();
   		  	tempEmp.seteCode(eCode);
   		  	tempEmp.setBasicPay(basicPay);
   		  
   		  	if(tempDao.modifySalary(tempEmp)) {
   		  		System.out.println("\nModification done Successfully!!!");
   		  	}else {
   		  		System.out.println("\nEntered ID not found!!!");
   		  	}
		}
		
		
		public static void modifyDesignation() {
			tempEmp =new Employee();
			System.out.println("Enter ID of Employee");
			eCode=sc.nextInt();
			System.out.println("Enter new Designation of Employee");
			designation=sc.next();
			tempEmp.seteCode(eCode);
   		  	tempEmp.setDesignation(designation);
   		  
   		  	if(tempDao.modifyDesignation(tempEmp)) {
   		  		System.out.println("\nModification done Successfully!!!");
   		  	}else {
   		  		System.out.println("\nEntered ID not found!!!");
   		  	}
		}
		
		
		public static void showMySalary() {
			 DaoClass2 tempDao = new DaoClass2();
			 EmployeeSalary tempEmp =new EmployeeSalary();
			 System.out.println("Enter ID of Employee");
    		 eCode=sc.nextInt();
    		 tempEmp.seteCode(eCode);
    		 
    		 EmployeeSalary tempSal = tempDao.showMySalary(tempEmp);
    		 System.out.println("Employee  Code: "+tempEmp.geteCode());
    		 System.out.println("Employee Name: " +tempEmp.geteName());
    		 System.out.println("Employee Designation :"+tempEmp.getDesignation());
    		 System.out.println();
    		 System.out.println("Basic Salary: "+tempEmp.getBasicPay());
    		 System.out.println("HRA: "+tempSal.getHRA());
    		 System.out.println("DA: "+tempSal.getDA());
    		 System.out.println("salary: "+tempSal.getSalary());
    	}
		
		public static void displayAll() {
			ArrayList<Employee> arr = new ArrayList<Employee>();
			arr = tempDao.DisplayAll();
			
			Iterator<Employee> it = arr.iterator();
			int count=0;
			while(it.hasNext()) {
				Employee e= it.next();
				System.out.println("Employee : "+ count+"--------------");
				System.out.println("ID: " + e.geteCode());
				System.out.println("Name:"+e.geteName());
				System.out.println("Designation: "+ e.getDesignation());
				System.out.println("Age: "+e.getAge());
				System.out.println("Basic Salary: "+e.getBasicPay());
				count++;
			}
		}
		
		public static void displayOne() {
			Employee e  = new Employee();
			System.out.println("Enter ID of Employee");
   		  	eCode=sc.nextInt();
   		  	tempEmp.seteCode(eCode);
			e = tempDao.DisplayOne(tempEmp);
			
			System.out.println("Employee  information--------------");
			System.out.println("ID: " + e.geteCode());
			System.out.println("Name:"+e.geteName());
			System.out.println("Designation: "+ e.getDesignation());
			System.out.println("Age: "+e.getAge());
			System.out.println("Basic Salary: "+e.getBasicPay());	
		}
		

}
