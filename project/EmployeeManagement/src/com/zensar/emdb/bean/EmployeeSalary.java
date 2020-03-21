package com.zensar.emdb.bean;

public class EmployeeSalary {
	int eCode;
	String eName;
	String designation;
	double basicPay,DA,HRA,salary;

	public EmployeeSalary(){}
	
	public EmployeeSalary(int eCode, String eName, String designation, double basicPay, double dA, double hRA,
			double salary) {
		super();
		this.eCode = eCode;
		this.eName = eName;
		this.designation = designation;
		this.basicPay = basicPay;
		DA = dA;
		HRA = hRA;
		this.salary = salary;
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

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getDA() {
		return DA;
	}

	public void setDA(double dA) {
		DA = dA;
	}

	public double getHRA() {
		return HRA;
	}

	public void setHRA(double hRA) {
		HRA = hRA;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeSalary [eCode=" + eCode + ", eName=" + eName + ", designation=" + designation + ", basicPay="
				+ basicPay + ", DA=" + DA + ", HRA=" + HRA + ", salary=" + salary + "]";
	}
}
