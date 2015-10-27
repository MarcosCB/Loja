package br.com.taipanet.model;

public class Contato {
	private long id;
	private String valor;
	private TipoContato tipoContato;
	private Contribuinte contribuinte;
	private StatusEndereco statusContato;
	private int prioridade;
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public TipoContato getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(TipoContato tipoContato) {
		this.tipoContato = tipoContato;
	}

	public Contribuinte getContribuinte() {
		return contribuinte;
	}

	public void setContribuinte(Contribuinte contribuinte) {
		this.contribuinte = contribuinte;
	}

	public StatusEndereco getStatusContato() {
		return statusContato;
	}

	public void setStatusContato(StatusEndereco statusContato) {
		this.statusContato = statusContato;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	
}
