package QUESTAO_6;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("DIGITE:/nOPERACAO(1): SOMA/nOPERACAO(2): SUBTRACAO/nOPERACAO(3): DIVISAO/nOPERACAO(4): MULTIPLICACAO");
		int decisao = s.nextInt();
		
		switch(decisao) {
			case 1:
				System.out.println("DIGITE O PRIMEIRO NUMERO:");
				int soma1 = s.nextInt();
				System.out.println("DIGITE O SEGUNDO NUMERO:");
				int soma2 = s.nextInt();
				OperacaoMatematica soma = new Soma(soma1, soma2);
				System.out.println("RESULTADO DA OPERACAO: "+soma.calcula(soma1, soma2));
				break;
			case 2:
				System.out.println("DIGITE O PRIMEIRO NUMERO:");
				int sub1 = s.nextInt();
				System.out.println("DIGITE O SEGUNDO NUMERO:");
				int sub2 = s.nextInt();
				OperacaoMatematica subtracao = new Subtracao(sub1, sub2);
				System.out.println("RESULTADO DA OPERACAO: "+subtracao.calcula(sub1, sub2));
				break;
			case 3:
				System.out.println("DIGITE O PRIMEIRO NUMERO:");
				int divi1 = s.nextInt();
				System.out.println("DIGITE O SEGUNDO NUMERO:");
				int divi2 = s.nextInt();
				OperacaoMatematica divisao = new Divisao(divi1, divi2);
				System.out.println("RESULTADO DA OPERACAO: "+divisao.calcula(divi1, divi2));
				break;
			case 4:
				System.out.println("DIGITE O PRIMEIRO NUMERO:");
				int multi1 = s.nextInt();
				System.out.println("DIGITE O SEGUNDO NUMERO:");
				int multi2 = s.nextInt();
				OperacaoMatematica multiplicacao = new Multiplicacao(multi1, multi2);
				System.out.println("RESULTADO DA OPERACAO: "+multiplicacao.calcula(multi1, multi2));
				break;
			
		}
		
		s.close();
	
	}

}
