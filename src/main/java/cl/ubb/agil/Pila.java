package cl.ubb.agil;



public class Pila {
	 private int[] stck = new int [10];
	 private int tos = -1;
	 
	public Pila(){
		
	     
	}
	
	public boolean pilavacia() {
		if(tos == -1){
			return true;
		}else{
			return false;
		}
	}
	
	public int agrega (int i) {
		if(tos == -1){
			return i;
		}else{
			return 2;
		}
	}
		
	
	
	
	
	

}
