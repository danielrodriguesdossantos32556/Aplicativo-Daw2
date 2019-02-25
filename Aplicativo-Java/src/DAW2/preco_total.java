package DAW2;

public class preco_total {

	private int id;
	private int taxa_dinamica;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTaxa_dinamica() {
		return taxa_dinamica;
	}

	public void setTaxa_dinamica(int taxa_dinamica) {
		this.taxa_dinamica = taxa_dinamica;
	}

	@Override
	public String toString() {
		return "preco_total [id=" + id + ", taxa_dinamica=" + taxa_dinamica + "]";
	}

	public preco_total(int id, int taxa_dinamica) {
		super();
		this.id = id;
		this.taxa_dinamica = taxa_dinamica;
	}
}
