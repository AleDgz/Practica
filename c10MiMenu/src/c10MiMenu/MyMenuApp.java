package c10MiMenu;

import java.util.Scanner;

import org.c10MiMenu.employees.Programmer;

public class MyMenuApp {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Matrix mat = new Matrix();
		forEachLee fel = new forEachLee();
		int option, option2 = 0;
		boolean flag = true;
		Programmer backEnd= new Programmer();
		
	
	
		printMenu();
		
     do {
    	 
    	 option = sc.nextInt();
    	 if(option == 8) {
    		 flag = false;
    		 System.exit(0);
    	 }else if (option>0 && option <8) {
    		 switch(option) {
    		 case 1:

    		 break;
    		 case 2 :
                  backEnd.Read("R2D2",mat.employees);
    	     break;
    		 case 3:
    			 backEnd.Update("R2D2", 2,"princess43@generation", mat.employees);
    		 break;
    		 case 4:
    			 backEnd.Delete(mat.employees,"F64W");
        		 break;
    		 case 5:
        		 break;
    		 case 6:
        		 break;	 
    		 case 7:
    		     
    			 fel.imprimeEmps(mat.employees);    
    		 break;
    		 }
    	 }
    	 System.out.println("\n1.-Desea regresar al menu \n"
    			 + "2.-Desea Salir");
    	 option2= sc.nextInt();
    	 if(option2 == 1 ) {
    		 printMenu();
    	 }else if (option2 == 2) {
    		// System.exit(0);
    		 flag = false;
    	 }   
     }while(flag);
	
     

}
	
	public static void  printMenu() {
		System.out.println(" 1. if-else"
				+ "\n 2. for ReadOne"
				+ "\n 3. while Update"
				+ "\n 4. Do while"
				+ "\n 5. Switch"
				+ "\n 6. Matrix"
				+ "\n 7. For-each ReadAll"   
				+ "\n 8. Exit"
		        + "\n Choose an option: ");

		}
}
