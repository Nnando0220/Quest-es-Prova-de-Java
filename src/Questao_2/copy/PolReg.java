package Questao_2.copy;

public abstract class PolReg {

	int numL, tamL;
	int area = 0;
	
	public PolReg(int numL, int tamL) {
		
		this.numL = numL;
		this.tamL = tamL;
		
	}
	
	public void setNumL(int numL) {
		
		this.numL = numL;
		
	}
	
	public int getNumL() {
		
		return numL;
		
	}
	
	public void setTamL(int tamL) {
		
		this.tamL = tamL;
		
	}
	
	public int getTamL() {
		
		return tamL;
		
	}
	
	public int calArea() {

		return area;
		
	}

}
