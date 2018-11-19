import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Instrutor {
	@Id
	private Integer id;
	private String nome;
	private Integer cref;
	private Integer idAluno;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCref() {
		return cref;
	}
	public void setCref(Integer cref) {
		this.cref = cref;
	}
	public Integer getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cref == null) ? 0 : cref.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idAluno == null) ? 0 : idAluno.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Instrutor other = (Instrutor) obj;
		if (cref == null) {
			if (other.cref != null)
				return false;
		} else if (!cref.equals(other.cref))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idAluno == null) {
			if (other.idAluno != null)
				return false;
		} else if (!idAluno.equals(other.idAluno))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Instrutor [id=" + id + ", nome=" + nome + ", cref=" + cref + ", idAluno=" + idAluno + ", getId()="
				+ getId() + ", getNome()=" + getNome() + ", getCref()=" + getCref() + ", getIdAluno()=" + getIdAluno()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	public Instrutor(Integer id, String nome, Integer cref, Integer idAluno) {
		super();
		this.id = id;
		this.nome = nome;
		this.cref = cref;
		this.idAluno = idAluno;
	}
	
}
