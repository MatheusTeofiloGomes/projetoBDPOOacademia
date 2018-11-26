
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Aluno {
	@Id
	private Integer id;
	private String nome;
	private Integer idade;
	private String sexo;
	private Integer idInstrutor;
	private Integer imc;
	@ManyToMany
	@JoinTable(name = "exercicio_aluno", joinColumns = @JoinColumn(name = "aluno_id"), inverseJoinColumns = @JoinColumn(name = "id_exercicio"))
	private Set<Exercicio> exercicios;

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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdInstrutor() {
		return idInstrutor;
	}

	public void setIdInstrutor(Integer idInstrutor) {
		this.idInstrutor = idInstrutor;
	}

	public Integer getImc() {
		return imc;
	}

	public void setImc(Integer imc) {
		this.imc = imc;
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
		result = prime * result + ((exercicios == null) ? 0 : exercicios.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idInstrutor == null) ? 0 : idInstrutor.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((imc == null) ? 0 : imc.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		Aluno other = (Aluno) obj;
		if (exercicios == null) {
			if (other.exercicios != null)
				return false;
		} else if (!exercicios.equals(other.exercicios))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idInstrutor == null) {
			if (other.idInstrutor != null)
				return false;
		} else if (!idInstrutor.equals(other.idInstrutor))
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (imc == null) {
			if (other.imc != null)
				return false;
		} else if (!imc.equals(other.imc))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", idInstrutor="
				+ idInstrutor + ", imc=" + imc + ", exercicios=" + exercicios + ", getId()=" + getId() + ", getNome()="
				+ getNome() + ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo() + ", getIdInstrutor()="
				+ getIdInstrutor() + ", getImc()=" + getImc() + ", getExercicios()=" + getExercicios() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	public Aluno() {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.idInstrutor = idInstrutor;
		this.imc = imc;
		this.exercicios = exercicios;
	}

}
