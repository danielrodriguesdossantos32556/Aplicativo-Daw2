package DAW2;

public class Avaliacao {

	private int id;
	private String qualidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualidade() {
		return qualidade;
	}

	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}

	@Override
	public String toString() {
		return "Avaliacao [id=" + id + ", qualidade=" + qualidade + "]";
	}

	public Avaliacao(int id, String qualidade) {
		super();
		this.id = id;
		this.qualidade = qualidade;
	}
}
