
public class Conta {
	private int id;
	private String nomeDoCliente;
	private int score;
	
	public Conta(int id, String nome, int score) {
		this.id = id;
		this.nomeDoCliente = nome;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	

}
