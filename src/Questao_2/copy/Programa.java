package Questao_2.copy;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("DIGITE UM PARA CRIAR UM TRIANGULO EQUILATERO/nDIGITE 2 PARA CRIAR UM QUADRADO:");
		int decisao = s.nextInt();
		
		if(decisao==1) {
			
			System.out.println("DIGITE O NUMERO DE LADOS DO TRIANGULO:");
			int numL = s.nextInt();
			
			System.out.println("DIGITE O TAMANHO DA BASE DO TRIANGULO:");
			int tamL = s.nextInt();
			
			TrianguloEq trianguloEq = new TrianguloEq(numL, tamL);
			trianguloEq.setNumL(numL);
			trianguloEq.setTamL(tamL);
			int area = trianguloEq.calArea(trianguloEq.getTamL());
			
			System.out.println("A AREA DO TRIANGULO EH: "+area+" CM");
			
		}else if(decisao==2) {
			
			System.out.println("DIGITE O NUMERO DE LADOS DO QUADRADO:");
			int numL = s.nextInt();
			
			System.out.println("DIGITE O TAMANHO DA BASE DO QUADRADO:");
			int tamL = s.nextInt();
			
			Quadrado quadrado = new Quadrado(numL, tamL);
			quadrado.setNumL(numL);
			quadrado.setTamL(tamL);
			int area = quadrado.calArea(quadrado.getTamL());
			
			System.out.println("A AREA DO QUADRADO EH: "+area+" CM");
			
		}
		
		s.close();
	}

}
