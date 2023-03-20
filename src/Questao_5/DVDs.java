package Questao_5;

public class DVDs extends Produtos{
	
	String nome;
	double preco;
	int duracao;
	
	public DVDs(String nome, double preco, int duracao) {
		
		super(nome, preco);
		this.duracao = duracao;
		
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
	
	public void setDuracao(int duracao) {
		
		this.duracao = duracao;
		
	}
	
	public int getDuracao() {
		
		return duracao;
		
	}
	
	public String toString() {
		
		return ("PRODUTO:DVDs NOME:"+this.nome+"PRECO:"+this.preco+"DURACAO:"+this.duracao);
		
	}

}
