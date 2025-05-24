package DTO;

public class Turma {
	
	private Integer idTurma;
	private String nmTurna;
	private String dsTurma;
	private Integer idProfessor;
	
	
	//metodo para criar uma turma
	public void cadastrarTurma(int idProfessor, String nmTurma,String dsTurma) {
		this.idTurma = idTurma;
		this.nmTurna = nmTurma;
		this.dsTurma = dsTurma;
		this.idProfessor = idProfessor;
	}
	
	public Turma() {
		
	}
	
	public Turma(String nm_turna, String ds_turma) {
		super();
		this.nmTurna = nm_turna;
		this.dsTurma = ds_turma;
	}
	public Turma(Integer idTurma, String nm_turna, String ds_turma) {
		super();
		this.idTurma = idTurma;
		this.nmTurna = nm_turna;
		this.dsTurma = ds_turma;
	}
	public Integer getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}
	public String getNm_turna() {
		return nmTurna;
	}
	public void setNm_turna(String nm_turna) {
		this.nmTurna = nm_turna;
	}
	public String getDs_turma() {
		return dsTurma;
	}
	public void setDs_turma(String ds_turma) {
		this.dsTurma = ds_turma;
	}

}
