package br.com.tiss.enums;

public enum CaraterAtendimentoEnum {
	
	ELETIVO(1,"Eletivo"),
	URGENCIA_EMERGENCIA(2,"Urgencia/Emergencia");
	
	private Integer codigo;
	
	private String descricao;
	
	private CaraterAtendimentoEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
