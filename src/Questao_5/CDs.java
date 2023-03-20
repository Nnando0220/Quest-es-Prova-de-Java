package Questao_5;

public class CDs extends Produtos{
	
	String nome;
	double preco;
	int numFaixa;
	
	public CDs(String nome, double preco, int numFaixa) {
		super(nome, preco);
		this.numFaixa = numFaixa;
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
	
	public void setNumFaixa(int numFaixa) {
		
		this.numFaixa = numFaixa;
		
	}

	public int getNumFaixa() {
		
		return numFaixa;
		
	}
	
	public String toString() {
		
		return ("PRODUTO:CDs NOME:"+this.nome+"PRECO:"+this.preco+"NUMERO DE FAIXAS:"+this.numFaixa);
		
	}
}
