import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Academia implements Identificavel {
	private String nome;
	private String endere�o;
	@Id
	private Integer numeroAlvara;
	@ManyToMany
	@JoinTable(name = "instrutor_academia", joinColumns = @JoinColumn(name = "id_academia"), inverseJoinColumns = @JoinColumn(name = "id_instrutor"))
	private Set<Instrutor> instrutores;
	@ManyToMany
	@JoinTable(name = "exercicio_academia", joinColumns = @JoinColumn(name = "academia_id"), inverseJoinColumns = @JoinColumn(name = "id_exercicio"))
	private Set<Exercicio> exercicios;
	
	@OneToMany
	@JoinColumn(name="id_academia")
	private Set<Aluno>aluno;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public Integer getNumeroAlvara() {
		return numeroAlvara;
	}

	public void setNumeroAlvara(Integer numeroAlvara) {
		this.numeroAlvara = numeroAlvara;
	}

	public Set<Instrutor> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(Set<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}

	public Set<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(Set<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endere�o == null) ? 0 : endere�o.hashCode());
		result = prime * result + ((exercicios == null) ? 0 : exercicios.hashCode());
		result = prime * result + ((instrutores == null) ? 0 : instrutores.hashCode());
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
		if (endere�o == null) {
			if (other.endere�o != null)
				return false;
		} else if (!endere�o.equals(other.endere�o))
			return false;
		if (exercicios == null) {
			if (other.exercicios != null)
				return false;
		} else if (!exercicios.equals(other.exercicios))
			return false;
		if (instrutores == null) {
			if (other.instrutores != null)
				return false;
		} else if (!instrutores.equals(other.instrutores))
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
		return "Academia [nome=" + nome + ", endere�o=" + endere�o + ", numeroAlvara=" + numeroAlvara + ", instrutores="
				+ instrutores + ", exercicios=" + exercicios + ", getNome()=" + getNome() + ", getEndere�o()="
				+ getEndere�o() + ", getNumeroAlvara()=" + getNumeroAlvara() + ", getInstrutores()=" + getInstrutores()
				+ ", getExercicios()=" + getExercicios() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	public Academia(String nome, String endere�o, Integer numeroAlvara, ArrayList<Instrutor> instrutores,
			ArrayList<Exercicio> exercicios) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.numeroAlvara = numeroAlvara;
		this.instrutores = (Set<Instrutor>) instrutores;
		this.exercicios = (Set<Exercicio>) exercicios;
	}

	public Set<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(Set<Aluno> aluno) {
		this.aluno = aluno;
	}

	private DAO<Academia> daoAcademia;
}