package br.com.tiss.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.tiss.enums.CaraterAtendimentoEnum;
import br.com.tiss.enums.IndicacaoAcidenteEnum;
import br.com.tiss.enums.TipoAtendimentoEnum;
import br.com.tiss.enums.TipoConsultaEnum;

@Document(collection="spsadt")
public class GuiaSpSadt implements Serializable {

	private static final long serialVersionUID = 4235884762992808071L;

	@Id
	private UUID id;
	
	private String registroAns;

	private String numGuiaPrestador;
	
	private String numGuiaPrincipal;
	
	private LocalDate dataAutorizacao;
	
	private String senha;
	
	private LocalDate dataValidadeSenha;
	
	private String numGuiaOperadora;
	
	private String numCarteira;
	
	private LocalDate dataValidadeCarteira;
	
	private String nomeBeneficiario;
	
	private String numCartaoSaude;
	
	private String atendimentoRn;
	
	private String codigoContratadoSolicitante;
	
	private String nomeContratadoSolicitante;
	
	private String nomeProfissionalSolicitante;
	
	private String conselhoProfissionalSolicitante;
	
	private String numConselhoProfissionalSolicitante;

	private Uf ufConselhoProfissionalSolicitante;
	
	private Cbo cboProfissionalSolicitante;
	
	private CaraterAtendimentoEnum caraterAtendimento;
	
	private LocalDate dataSolicitacao;
	
	private String indicacaoClinica;
	
	private String nomeContratadoExecutante;
	
	private String codigoContratadoExecutante;
	
	private String CnesContratadoExecutante;
	
	private TipoAtendimentoEnum tipoAtendimento;
	
	private IndicacaoAcidenteEnum indicacaoAcidente;
	
	private TipoConsultaEnum tipoConsulta;
	
	private String motivoEncerramento;
	
	private String observacao;
	
	private BigDecimal totalProcedimento;
	
	private BigDecimal totalTaxaAluguel;
	
	private BigDecimal totalMaterial;
	
	private BigDecimal totalMedicamento;
	
	private BigDecimal totalOpme;
	
	private BigDecimal totalGases;
	
	private BigDecimal totalGeral;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getRegistroAns() {
		return registroAns;
	}

	public void setRegistroAns(String registroAns) {
		this.registroAns = registroAns;
	}

	public String getNumGuiaPrestador() {
		return numGuiaPrestador;
	}

	public void setNumGuiaPrestador(String numGuiaPrestador) {
		this.numGuiaPrestador = numGuiaPrestador;
	}

	public String getNumGuiaPrincipal() {
		return numGuiaPrincipal;
	}

	public void setNumGuiaPrincipal(String numGuiaPrincipal) {
		this.numGuiaPrincipal = numGuiaPrincipal;
	}

	public LocalDate getDataAutorizacao() {
		return dataAutorizacao;
	}

	public void setDataAutorizacao(LocalDate dataAutorizacao) {
		this.dataAutorizacao = dataAutorizacao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDataValidadeSenha() {
		return dataValidadeSenha;
	}

	public void setDataValidadeSenha(LocalDate dataValidadeSenha) {
		this.dataValidadeSenha = dataValidadeSenha;
	}

	public String getNumGuiaOperadora() {
		return numGuiaOperadora;
	}

	public void setNumGuiaOperadora(String numGuiaOperadora) {
		this.numGuiaOperadora = numGuiaOperadora;
	}

	public String getNumCarteira() {
		return numCarteira;
	}

	public void setNumCarteira(String numCarteira) {
		this.numCarteira = numCarteira;
	}

	public LocalDate getDataValidadeCarteira() {
		return dataValidadeCarteira;
	}

	public void setDataValidadeCarteira(LocalDate dataValidadeCarteira) {
		this.dataValidadeCarteira = dataValidadeCarteira;
	}

	public String getNomeBeneficiario() {
		return nomeBeneficiario;
	}

	public void setNomeBeneficiario(String nomeBeneficiario) {
		this.nomeBeneficiario = nomeBeneficiario;
	}

	public String getNumCartaoSaude() {
		return numCartaoSaude;
	}

	public void setNumCartaoSaude(String numCartaoSaude) {
		this.numCartaoSaude = numCartaoSaude;
	}

	public String getAtendimentoRn() {
		return atendimentoRn;
	}

	public void setAtendimentoRn(String atendimentoRn) {
		this.atendimentoRn = atendimentoRn;
	}

	public String getCodigoContratadoSolicitante() {
		return codigoContratadoSolicitante;
	}

	public void setCodigoContratadoSolicitante(String codigoContratadoSolicitante) {
		this.codigoContratadoSolicitante = codigoContratadoSolicitante;
	}

	public String getNomeContratadoSolicitante() {
		return nomeContratadoSolicitante;
	}

	public void setNomeContratadoSolicitante(String nomeContratadoSolicitante) {
		this.nomeContratadoSolicitante = nomeContratadoSolicitante;
	}

	public String getNomeProfissionalSolicitante() {
		return nomeProfissionalSolicitante;
	}

	public void setNomeProfissionalSolicitante(String nomeProfissionalSolicitante) {
		this.nomeProfissionalSolicitante = nomeProfissionalSolicitante;
	}

	public String getConselhoProfissionalSolicitante() {
		return conselhoProfissionalSolicitante;
	}

	public void setConselhoProfissionalSolicitante(String conselhoProfissionalSolicitante) {
		this.conselhoProfissionalSolicitante = conselhoProfissionalSolicitante;
	}

	public String getNumConselhoProfissionalSolicitante() {
		return numConselhoProfissionalSolicitante;
	}

	public void setNumConselhoProfissionalSolicitante(String numConselhoProfissionalSolicitante) {
		this.numConselhoProfissionalSolicitante = numConselhoProfissionalSolicitante;
	}

	public Uf getUfConselhoProfissionalSolicitante() {
		return ufConselhoProfissionalSolicitante;
	}

	public void setUfConselhoProfissionalSolicitante(Uf ufConselhoProfissionalSolicitante) {
		this.ufConselhoProfissionalSolicitante = ufConselhoProfissionalSolicitante;
	}

	public Cbo getCboProfissionalSolicitante() {
		return cboProfissionalSolicitante;
	}

	public void setCboProfissionalSolicitante(Cbo cboProfissionalSolicitante) {
		this.cboProfissionalSolicitante = cboProfissionalSolicitante;
	}

	public CaraterAtendimentoEnum getCaraterAtendimento() {
		return caraterAtendimento;
	}

	public void setCaraterAtendimento(CaraterAtendimentoEnum caraterAtendimento) {
		this.caraterAtendimento = caraterAtendimento;
	}

	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(LocalDate dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public String getIndicacaoClinica() {
		return indicacaoClinica;
	}

	public void setIndicacaoClinica(String indicacaoClinica) {
		this.indicacaoClinica = indicacaoClinica;
	}

	public String getNomeContratadoExecutante() {
		return nomeContratadoExecutante;
	}

	public void setNomeContratadoExecutante(String nomeContratadoExecutante) {
		this.nomeContratadoExecutante = nomeContratadoExecutante;
	}

	public String getCodigoContratadoExecutante() {
		return codigoContratadoExecutante;
	}

	public void setCodigoContratadoExecutante(String codigoContratadoExecutante) {
		this.codigoContratadoExecutante = codigoContratadoExecutante;
	}

	public String getCnesContratadoExecutante() {
		return CnesContratadoExecutante;
	}

	public void setCnesContratadoExecutante(String cnesContratadoExecutante) {
		CnesContratadoExecutante = cnesContratadoExecutante;
	}

	public TipoAtendimentoEnum getTipoAtendimento() {
		return tipoAtendimento;
	}

	public void setTipoAtendimento(TipoAtendimentoEnum tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

	public IndicacaoAcidenteEnum getIndicacaoAcidente() {
		return indicacaoAcidente;
	}

	public void setIndicacaoAcidente(IndicacaoAcidenteEnum indicacaoAcidente) {
		this.indicacaoAcidente = indicacaoAcidente;
	}

	public TipoConsultaEnum getTipoConsulta() {
		return tipoConsulta;
	}

	public void setTipoConsulta(TipoConsultaEnum tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}

	public String getMotivoEncerramento() {
		return motivoEncerramento;
	}

	public void setMotivoEncerramento(String motivoEncerramento) {
		this.motivoEncerramento = motivoEncerramento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public BigDecimal getTotalProcedimento() {
		return totalProcedimento;
	}

	public void setTotalProcedimento(BigDecimal totalProcedimento) {
		this.totalProcedimento = totalProcedimento;
	}

	public BigDecimal getTotalTaxaAluguel() {
		return totalTaxaAluguel;
	}

	public void setTotalTaxaAluguel(BigDecimal totalTaxaAluguel) {
		this.totalTaxaAluguel = totalTaxaAluguel;
	}

	public BigDecimal getTotalMaterial() {
		return totalMaterial;
	}

	public void setTotalMaterial(BigDecimal totalMaterial) {
		this.totalMaterial = totalMaterial;
	}

	public BigDecimal getTotalMedicamento() {
		return totalMedicamento;
	}

	public void setTotalMedicamento(BigDecimal totalMedicamento) {
		this.totalMedicamento = totalMedicamento;
	}

	public BigDecimal getTotalOpme() {
		return totalOpme;
	}

	public void setTotalOpme(BigDecimal totalOpme) {
		this.totalOpme = totalOpme;
	}

	public BigDecimal getTotalGases() {
		return totalGases;
	}

	public void setTotalGases(BigDecimal totalGases) {
		this.totalGases = totalGases;
	}

	public BigDecimal getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(BigDecimal totalGeral) {
		this.totalGeral = totalGeral;
	}

}
