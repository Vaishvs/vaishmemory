

package com.zensar.emdb.bean;

public class Employee {

	int eCode;
	String eName,designation;
	int age;
	double basicPay;
	public Employee() {}
	public Employee(int eCode, String eName, String designation, int age, double basicPay) {
		super();
		this.eCode = eCode;
		this.eName = eName;
		this.designation = designation;
		this.age = age;
		this.basicPay = basicPay;
	}
	public int geteCode() {
		return eCode;
	}
	public void seteCode(int eCode) {
		this.eCode = eCode;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {

		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

       @Override
	public String toString() {
		return "Employee [eCode=" + eCode + ", eName=" + eName + ", designation=" + designation + ", age=" + age
				+ ", basicPay=" + basicPay + "]";
	}
	
}
