package org.c10MiMenu.employees;

import org.c10MiMenu.crud.Employee;

public class Programmer extends Employee {
	
      @Override
      public void Create(String id, String name, String email, String cPhone) {  // incluir toda la matriz y sobre escribir los nuevos valores en los lugares vacios
    	super.Create(id, name, email, cPhone);
    	System.out.println("Create Employee Programmer");
       }
      @Override
      public void Read(String[][] employee) {
    	super.Read(employee);
    	for (String[] obj: employee) {
 		   System.out.print("\n");
 		for (String obje: obj) {
 			System.out.print("[" + obje + "]");
 		  }
    	}
    	
       }
      
      public void Read(String id,String[][] employee) {
    	  for(int i = 0; i <= 3;i++) {
    		  if(employee[i][0].equals(id)) {
    			  for(int j = 0; j<=3;j++) {
    				  System.out.print(employee[i][j] + "\t" );
    			  }
    		  }
    	  }
      }
      
      @Override
      public void Update(String id, int position,String inf,String[][] employee) {
    	super.Update(id,position,inf,employee);
    	int i =0;
    	while(i<=3) {
    		if(employee[i][0].equals(id)) {
    			employee[i][position] = inf;
    		}
    		i++;
    	}
    	
       }
      @Override
      public void Delete(String[][] employee, String id) {
    	super.Delete(employee,id);
    	int i=0;
    	do{
    		if(employee[i][0].equals(id)) {
    			for(int j=0; j<=3;j++) {
    				employee[i][j] = "";
    			}
    		}
    		i++;
    	}while(i<=3);
       }
}
