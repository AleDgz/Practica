package org.c10MiMenu.employees;

import org.c10MiMenu.crud.Employee;

public class Lawyer extends Employee {
	@Override
    public void Create(String id, String name, String email, String cPhone) {
  	super.Create(id, name, email, cPhone);
  	System.out.println("Create Employee Lawyer");
     }
    @Override
    public void Read(String[][] employee) {
  	super.Read(employee);
  	System.out.println("Read Employee Lawyer");
     }
    @Override
    public void Update(String id,int position,String inf,String[][] employee) {
  	super.Update(id, position,inf,employee);
  	System.out.println("Update Employee Lawyer");
     }
    @Override
    public void Delete(String[][] employee, String id) {
  	super.Delete(employee,id);
  	System.out.println("Delete Employee Lawyer");
     }
}
