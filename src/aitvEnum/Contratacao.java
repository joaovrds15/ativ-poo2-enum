package aitvEnum;

import java.util.Date;

import enums.Cargo;
import enums.Status;

public class Contratacao {
	private Projeto projeto;
	private Funcionario funcionario;
	private Date data;
	private Cargo cargo;
	private Status status;
	
	public Contratacao(Date data, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.projeto = projeto;
		this.funcionario = funcionario;
		this.data = data;
		this.cargo = cargo;
		this.status = Status.PENDENTE;
		this.adicionarProjeto();
	}
	
	public void adicionarProjeto() {
		this.projeto.getListaContratacoes().add(this);
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {			
		this.status = Status.CONTRATADO;
	}
	
	public void demitir() {
		this.status = Status.DEMITIDO;
	}
}
