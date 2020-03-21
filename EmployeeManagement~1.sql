
set serveroutput on;


create or replace function showMySalary(id in int,  DA out decimal,
                                            HRA out decimal ,Salary out decimal) 
    return BOOLEAN as
    temp decimal(8,2);
    
    begin 
            if sql%found then 
                select Basic_pay into temp from Employee where ECode = id;
                DA := temp * 0.2;
                HRA := temp* 0.1;
                Salary := temp + DA + HRA;
                dbms_output.put_line(DA || ' ' || HRA || ' ' ||  Salary);
            end if;
            RETURN true;
            exception
              when no_data_found then
                 return FALSE;
                 
            
    end;


declare 
      DA  decimal :=10;
      HRA   decimal;
      Salary  decimal ;
      status boolean;
BEGIN
 status:=showMySalary(11,DA ,HRA , Salary);
 dbms_output.put_line(status);
 dbms_output.put_line(DA ||' ' || HRA || ' ' ||  Salary);
end;