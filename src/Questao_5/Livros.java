package Questao_5;

public class Livros extends Produtos{
	
	String nome;
	double preco;
	String autor;
	
	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
		// TODO Auto-generated constructor stub
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
	
	public void setAutor(String autor) {
		
		this.autor = autor;
		
	}

	public String getAutor() {
		
		return autor;
		
	}
	
	public String toString() {
		
		return ("PRODUTO:LIVRO NOME:"+this.nome+" PRECO:"+this.preco+" AUTOR:"+this.autor);
		
	}

}
