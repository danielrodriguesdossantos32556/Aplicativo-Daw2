package DAW2;

public class Servico_Contratado {

	private int id;
	private String tipo_de_servico;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo_de_servico() {
		return tipo_de_servico;
	}

	public void setTipo_de_servico(String tipo_de_servico) {
		this.tipo_de_servico = tipo_de_servico;
	}

	@Override
	public String toString() {
		return "Servico_Contratado [id=" + id + ", tipo_de_servico=" + tipo_de_servico + "]";
	}

	public Servico_Contratado(int id, String tipo_de_servico) {
		super();
		this.id = id;
		this.tipo_de_servico = tipo_de_servico;
	}
}
