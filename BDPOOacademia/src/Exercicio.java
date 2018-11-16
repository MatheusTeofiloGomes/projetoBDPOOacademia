import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Exercicio {
	@Id
	private Integer id;
	private String nome;
	private String fun��o;
	private String categoria;
	private Integer caloriasGastas;
	@ManyToOne
	private ArrayList<Preescricao> preescricoes;
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
	public String getFun��o() {
		return fun��o;
	}
	public void setFun��o(String fun��o) {
		this.fun��o = fun��o;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Integer getCaloriasGastas() {
		return caloriasGastas;
	}
	public void setCaloriasGastas(Integer caloriasGastas) {
		this.caloriasGastas = caloriasGastas;
	}
	public ArrayList<Preescricao> getPreescricoes() {
		return preescricoes;
	}
	public void setPreescricoes(ArrayList<Preescricao> preescricoes) {
		this.preescricoes = preescricoes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caloriasGastas == null) ? 0 : caloriasGastas.hashCode());
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((fun��o == null) ? 0 : fun��o.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((preescricoes == null) ? 0 : preescricoes.hashCode());
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
		Exercicio other = (Exercicio) obj;
		if (caloriasGastas == null) {
			if (other.caloriasGastas != null)
				return false;
		} else if (!caloriasGastas.equals(other.caloriasGastas))
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (fun��o == null) {
			if (other.fun��o != null)
				return false;
		} else if (!fun��o.equals(other.fun��o))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (preescricoes == null) {
			if (other.preescricoes != null)
				return false;
		} else if (!preescricoes.equals(other.preescricoes))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Exercicio [id=" + id + ", nome=" + nome + ", fun��o=" + fun��o + ", categoria=" + categoria
				+ ", caloriasGastas=" + caloriasGastas + ", preescricoes=" + preescricoes + ", getId()=" + getId()
				+ ", getNome()=" + getNome() + ", getFun��o()=" + getFun��o() + ", getCategoria()=" + getCategoria()
				+ ", getCaloriasGastas()=" + getCaloriasGastas() + ", getPreescricoes()=" + getPreescricoes()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	public Exercicio(Integer id, String nome, String fun��o, String categoria, Integer caloriasGastas,
			ArrayList<Preescricao> preescricoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.fun��o = fun��o;
		this.categoria = categoria;
		this.caloriasGastas = caloriasGastas;
		this.preescricoes = preescricoes;
	}
	
	
	}


