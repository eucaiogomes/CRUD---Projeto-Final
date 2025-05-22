package DTO;

public class Atividade {
	private Integer idAtividade;
	private String nm_atividade;
	private String ds_atividade;
	
	
	
	public Atividade() {
		
	}
	
	public Atividade(String nm_atividade, String ds_atividade) {
		super();
		this.nm_atividade = nm_atividade;
		this.ds_atividade = ds_atividade;
	}
	public Atividade(Integer idAtividade, String nm_atividade, String ds_atividade) {
		this.idAtividade = idAtividade;
		this.nm_atividade = nm_atividade;
		this.ds_atividade = ds_atividade;
	}
	public Integer getIdAtividade() {
		return idAtividade;
	}
	public void setIdAtividade(Integer idAtividade) {
		this.idAtividade = idAtividade;
	}
	public String getNm_atividade() {
		return nm_atividade;
	}
	public void setNm_atividade(String nm_atividade) {
		this.nm_atividade = nm_atividade;
	}
	public String getDs_atividade() {
		return ds_atividade;
	}
	public void setDs_atividade(String ds_atividade) {
		this.ds_atividade = ds_atividade;
	}
	
}
