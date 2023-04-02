package aitvEnum;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.Status;

public class Projeto {
	private String nome;
	private Date dt_inicio;
	private Date dt_termino;
	private List<Contratacao> listaContratacoes = new ArrayList<Contratacao>();

	public Projeto(String nome, Date dt_inicio, Date dt_termino) {
		this.nome = nome;
		this.dt_inicio = dt_inicio;
		this.dt_termino = dt_termino;
	}

	public List<Contratacao> getListaContratacoes() {
		return listaContratacoes;
	}

	public boolean adicionarContratacao(Contratacao contratacao) {
		if (! this.listaContratacoes.contains(contratacao)) {
			this.listaContratacoes.add(contratacao);
			return true;
		}
		return false;
	}

	public boolean removerContratacao(Contratacao contratacao) {
		if (this.listaContratacoes.contains(contratacao)) {
			this.listaContratacoes.remove(contratacao);
			return true;
		}
		return false;
	}
	
	public void listarContratacao() {
		System.out.println("***Contratações");
		System.out.printf("Projeto:" + "\n" + "\t" + this.nome + "\n");
		System.out.println("Funcionario(s):");
		for(int i = 0; i < this.listaContratacoes.size(); i++) {
			if(this.listaContratacoes.get(i).getStatus() != Status.DEMITIDO) {				
				System.out.printf("\t" + this.listaContratacoes.get(i).getFuncionario().getNome() + " [Status:" + this.listaContratacoes.get(i).getStatus() + "]" +"\n");
			}
		}
		System.out.println();
	}
}
