package enums;

public enum TipoDeDocumento {
	RG("Registro Geral"),
	CPF("Cadastro de Pessoa Física"),
	CNPJ("Cadastro de Pessoa Juridíca");
	
	private String descricao;
	
	TipoDeDocumento(String descricao) {
		
	}
	
	public String getDescricao() {
		return descricao;
	}
}
