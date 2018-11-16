import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Academia {
	private String nome;
	private String enderešo;
	@Id
	private Integer numeroAlvara;
	@ManyToOne
	private ArrayList<Instrutor> instrutores;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public Integer getNumeroAlvara() {
		return numeroAlvara;
	}
	public void setNumeroAlvara(Integer numeroAlvara) {
		this.numeroAlvara = numeroAlvara;
	}
	public ArrayList<Instrutor> getInstrutores() {
		return instrutores;
	}
	public void setInstrutores(ArrayList<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enderešo == null) ? 0 : enderešo.hashCode());
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
		if (enderešo == null) {
			if (other.enderešo != null)
				return false;
		} else if (!enderešo.equals(other.enderešo))
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
		return "Academia [nome=" + nome + ", enderešo=" + enderešo + ", numeroAlvara=" + numeroAlvara + ", instrutores="
				+ instrutores + ", getNome()=" + getNome() + ", getEnderešo()=" + getEnderešo() + ", getNumeroAlvara()="
				+ getNumeroAlvara() + ", getInstrutores()=" + getInstrutores() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	public Academia(String nome, String enderešo, Integer numeroAlvara, ArrayList<Instrutor> instrutores) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		this.numeroAlvara = numeroAlvara;
		this.instrutores = instrutores;
	}

}
