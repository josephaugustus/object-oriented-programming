package aula12.as10b.exercicio04;

public class Processo {
    Status statusAtual;

	public Processo() {
		statusAtual = new Protocolado();
	}

	public Status getStatus() {
		return statusAtual;
	}

	public void setStatus(Status statusAtual) {
		this.statusAtual = statusAtual;
	}

	public void arquivado() {
		statusAtual.arquivado(this);
	}

	void deferido() {
		statusAtual.deferido(this);
	}

	void indeferido() {
		statusAtual.indeferido(this);
	}

	void cancelado() {
		statusAtual.cancelado(this);
	}
}
