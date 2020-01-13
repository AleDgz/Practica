package org.c10MiMenu.crud;

public abstract class Employee implements Empleable {
	public void Create(String id, String name,String email, String cPhone) {
		System.out.println("Create Employee");
	}
	  @Override
	public void Read(String[][] employee) {
		  System.out.println("Read Employee");
	  }

      @Override
	public void Update(String id, int position,String inf,String[][] employee) {
    	  System.out.println("Update Employee");
	}	  
      @Override
    public void Delete(String[][] employee, String id) {
    	  System.out.println("Delete Employee");
    }
		
	   
} 
