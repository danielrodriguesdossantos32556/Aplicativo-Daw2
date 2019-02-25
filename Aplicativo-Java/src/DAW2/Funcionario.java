package DAW2;

public class Funcionario {

	private String nome_f;
	private String endereco_f;
	private String rua_f;
	private int numero_f;
	private String cidade_f;
	private int id;
	private String especializacao;

	public String getNome_f() {
		return nome_f;
	}

	public void setNome_f(String nome_f) {
		this.nome_f = nome_f;
	}

	public String getEndereco_f() {
		return endereco_f;
	}

	public void setEndereco_f(String endereco_f) {
		this.endereco_f = endereco_f;
	}

	public String getRua_f() {
		return rua_f;
	}

	public void setRua_f(String rua_f) {
		this.rua_f = rua_f;
	}

	public int getNumero_f() {
		return numero_f;
	}

	public void setNumero_f(int numero_f) {
		this.numero_f = numero_f;
	}

	public String getCidade_f() {
		return cidade_f;
	}

	public void setCidade_f(String cidade_f) {
		this.cidade_f = cidade_f;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	@Override
	public String toString() {
		return "Funcionario [nome_f=" + nome_f + ", endereco_f=" + endereco_f + ", rua_f=" + rua_f + ", numero_f="
				+ numero_f + ", cidade_f=" + cidade_f + ", id=" + id + ", especializacao=" + especializacao + "]";
	}

	public Funcionario(String nome_f, String endereco_f, String rua_f, int numero_f, String cidade_f, int id,
			String especializacao) {
		super();
		this.nome_f = nome_f;
		this.endereco_f = endereco_f;
		this.rua_f = rua_f;
		this.numero_f = numero_f;
		this.cidade_f = cidade_f;
		this.id = id;
		this.especializacao = especializacao;
	}
}
