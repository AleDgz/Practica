package c10MiMenu;

public class forEachLee {
    public void imprimeEmps(String[][] matrix){
    	
    	
    	for (String[] obj: matrix) {
    		   System.out.print("\n");
    		for (String obje: obj) {
    			System.out.print("[" + obje + "]");
    		}
    	}
    }
}
