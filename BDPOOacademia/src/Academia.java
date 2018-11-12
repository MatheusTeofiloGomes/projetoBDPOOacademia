
public class Academia {
	private String nome;
	private String endereço;
	private Integer numeroAlvara;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public Integer getNumeroAlvara() {
		return numeroAlvara;
	}
	public void setNumeroAlvara(Integer numeroAlvara) {
		this.numeroAlvara = numeroAlvara;
	}
	public Integer getIdInstrutor() {
		return idInstrutor;
	}
	public void setIdInstrutor(Integer idInstrutor) {
		this.idInstrutor = idInstrutor;
	}
	public Integer getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}
	private Integer idInstrutor;
	private Integer idAluno;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
		result = prime * result + ((idAluno == null) ? 0 : idAluno.hashCode());
		result = prime * result + ((idInstrutor == null) ? 0 : idInstrutor.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroAlvara == null) ? 0 : numeroAlvara.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Academia other = (Academia) obj;
		if (endereço == null) {
			if (other.endereço != null)
				return false;
		} else if (!endereço.equals(other.endereço))
			return false;
		if (idAluno == null) {
			if (other.idAluno != null)
				return false;
		} else if (!idAluno.equals(other.idAluno))
			return false;
		if (idInstrutor == null) {
			if (other.idInstrutor != null)
				return false;
		} else if (!idInstrutor.equals(other.idInstrutor))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroAlvara == null) {
			if (other.numeroAlvara != null)
				return false;
		} else if (!numeroAlvara.equals(other.numeroAlvara))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Academia [nome=" + nome + ", endereço=" + endereço + ", numeroAlvara=" + numeroAlvara + ", idInstrutor="
				+ idInstrutor + ", idAluno=" + idAluno + ", getNome()=" + getNome() + ", getEndereço()=" + getEndereço()
				+ ", getNumeroAlvara()=" + getNumeroAlvara() + ", getIdInstrutor()=" + getIdInstrutor()
				+ ", getIdAluno()=" + getIdAluno() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	public Academia(String nome, String endereço, Integer numeroAlvara, Integer idInstrutor, Integer idAluno) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.numeroAlvara = numeroAlvara;
		this.idInstrutor = idInstrutor;
		this.idAluno = idAluno;
	}
	

}
