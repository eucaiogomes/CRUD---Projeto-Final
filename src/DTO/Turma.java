package DTO;

public class Turma {
	
	public Integer getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}

	public String getNmTurma() {
		return nmTurma;
	}

	public void setNmTurma(String nmTurma) {
		this.nmTurma = nmTurma;
	}

	public String getDsTurma() {
		return dsTurma;
	}

	public void setDsTurma(String dsTurma) {
		this.dsTurma = dsTurma;
	}

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}
	private Integer idTurma;
	private String nmTurma; // ce
	private String dsTurma;
	private Integer idProfessor;
	
	
	public Turma(Integer idTurma, String nmTurna) {
		
		this.idTurma = idTurma;
		this.nmTurma = nmTurna;
	
	}

	//metodo para criar uma turma
	public void cadastrarTurma(int idProfessor, String nmTurma,String dsTurma) {
		this.idTurma = idTurma;
		this.nmTurma = nmTurma;
		this.dsTurma = dsTurma;
		this.idProfessor = idProfessor;
	}
	
	public Turma() {
		
	}
	
	public Turma(String nm_turna, String ds_turma) {
		super();
		this.nmTurma = nm_turna;
		this.dsTurma = ds_turma;
	}
	public Turma(Integer idTurma, String nm_turna, String ds_turma) {
		super();
		this.idTurma = idTurma;
		this.nmTurma = nm_turna;
		this.dsTurma = ds_turma;
	}
	

}
