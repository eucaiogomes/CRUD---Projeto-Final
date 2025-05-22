package DTO;

public class Turma {
	
	private Integer idTurma;
	private String nm_turna;
	private String ds_turma;
	
	
	public Turma() {
		
	}
	
	public Turma(String nm_turna, String ds_turma) {
		super();
		this.nm_turna = nm_turna;
		this.ds_turma = ds_turma;
	}
	public Turma(Integer idTurma, String nm_turna, String ds_turma) {
		super();
		this.idTurma = idTurma;
		this.nm_turna = nm_turna;
		this.ds_turma = ds_turma;
	}
	public Integer getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}
	public String getNm_turna() {
		return nm_turna;
	}
	public void setNm_turna(String nm_turna) {
		this.nm_turna = nm_turna;
	}
	public String getDs_turma() {
		return ds_turma;
	}
	public void setDs_turma(String ds_turma) {
		this.ds_turma = ds_turma;
	}

}
