package Questao_5;

public class Loja {
	
	public static String[] produtos = new String[3];
	
	public static void main(String[] args) {
		
		Produtos livros = new Livros("seila1", 80.0, "Fernando");
		livros.setNome("seila");
		livros.setPreco(80.0);
		Produtos cds = new CDs("seila2", 5.0, 10);
		cds.setNome("seila2");
		cds.setPreco(5.0);
		Produtos dvds = new DVDs("seila3", 10.0, 120);
		dvds.setNome("seila3");
		dvds.setPreco(10);
		
		for(int i=0; i<3; i++) {
			
			produtos[i] = livros.toString();
			if(i==1) {
				produtos[i] = cds.toString();
			}else if(i==2) {
				produtos[i] = dvds.toString();
			}
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(produtos[i]+"/n");
		}
		
	}

}
