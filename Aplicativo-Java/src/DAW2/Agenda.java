package DAW2;

public class Agenda {

	private int id;
	private String notificacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(String notificacao) {
		this.notificacao = notificacao;
	}

	@Override
	public String toString() {
		return "Agenda [id=" + id + ", notificacao=" + notificacao + "]";
	}

	public Agenda(int id, String notificacao) {
		super();
		this.id = id;
		this.notificacao = notificacao;
	}
}
