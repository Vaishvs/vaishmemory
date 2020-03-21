-- create table Employee
create table Employee (Ecode number(4) primary key,
                        Ename Varchar(20) not null,
                        Designation varchar(4) Not null ,
                        Age number(2) not null ,
                        Basic_Pay Decimal(8,2) not null
                        );
                        

insert  into Employee values(1101, 'kajal', 'Man' , 20, 12000.0); 
insert  into Employee values(1102, 'Sakshi', 'Emp' , 26, 12000.0); 
insert  into Employee values(1103, 'Vivek', 'clk' , 25, 118000.0); 
insert  into Employee values(1104, 'Vaishanvi', 'CEO' , 40, 121000.0); 


select *from Employee;

select Ecode from Employee where Ecode = 1100;

create table EmployeeLog( ECode number(4) primary key, 
                            EName varchar(20), 
                            Designation varchar(4), 
                            Last_Drawn_Salary decimal(8,2),
                            Leaving_date Date
                            );

 create table UpdateLog (  Modification_id number(4) primary key, 
                            Modification_date Date,
                            Details_of_Modification varchar(10)
                            );
                            
                            
CREATE OR REPLACE TRIGGER UpdateBasicPay
	AFTER UPDATE of Basic_Pay ON Employee
	   FOR EACH ROW 
       begin
       Insert INTO UpdateLog VALUES
	   ( :old.eCode,
	     sysdate(),
	     'Updation of Basic Pay' );

END;

	
	
	
CREATE OR REPLACE TRIGGER UpdateDesignation
AFTER UPDATE of Designation ON Employee FOR EACH ROW 
begin
    INSERT INTO UpdateLog VALUES
	   ( :old.eCode,
	     sysdate(),
	     'Updated Designation' );

	END;
		
	
CREATE OR REPLACE TRIGGER deleteEmp
AFTER DELETE ON Employee FOR EACH ROW 
    begin 
       INSERT INTO EmployeeLog VALUES
	   ( :old.ECode,:old.EName,:old.Designation,:old.Basic_Pay,
	     sysdate());

	END;

create table EmployeeSalary (Ecode number(4) primary key,
                        Ename Varchar(20) not null,
                        Designation varchar(4) Not null,
                        Basic_Pay Decimal(8,2) not null,
                        DA Decimal(8,2) not null, 
                        HRA Decimal(8,2) not null,
                        Salary Decimal(8,2) not null
            );
