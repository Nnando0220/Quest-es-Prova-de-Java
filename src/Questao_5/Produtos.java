package Questao_5;

public class Produtos {
	
	String nome;
	double preco;
	int duracao;
	
	
	public Produtos(String nome, double preco) {
		
		this.nome = nome;
		this.preco = preco;
		
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
		
	}
	
	public String getNome() {
		
		return nome;
		
	}
	
	public void setPreco(double preco) {
		
		this.preco = preco;
		
	}
	
	public double getPreco() {
		
		return preco;
		
	}

}
