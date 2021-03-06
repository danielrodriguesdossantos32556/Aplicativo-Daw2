package DAW2;

public class Cliente {

	private int cpf_c;
	private String nome_c;
	private String enderešo;
	private String cidade;
	private int numero;

	public int getCpf_c() {
		return cpf_c;
	}

	public void setCpf_c(int cpf_c) {
		this.cpf_c = cpf_c;
	}

	public String getNome_c() {
		return nome_c;
	}

	public void setNome_c(String nome_c) {
		this.nome_c = nome_c;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Cliente [cpf_c=" + cpf_c + ", nome_c=" + nome_c + ", enderešo=" + enderešo + ", cidade=" + cidade
				+ ", numero=" + numero + "]";
	}

	public Cliente(int cpf_c, String nome_c, String enderešo, String cidade, int numero) {
		super();
		this.cpf_c = cpf_c;
		this.nome_c = nome_c;
		this.enderešo = enderešo;
		this.cidade = cidade;
		this.numero = numero;
	}
}
