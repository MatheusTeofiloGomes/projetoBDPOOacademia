import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class AvaliacaoNeumotora {
	private Integer resistencia;
	private Integer for�a;
	private Integer potenciaMMSS;
	private Integer vo2Maximo;
	private Integer flexibilidade;
	private Integer massaGorda;
	private Integer massaMagra;
	private Integer massaOssea;
	private Integer massaResidual;
	private Integer gordura;
	@ManyToOne
	private ArrayList<Instrutor> instrutores;
	@Id
	private Date dataAvalia��o;
	public Integer getResistencia() {
		return resistencia;
	}
	public void setResistencia(Integer resistencia) {
		this.resistencia = resistencia;
	}
	public Integer getFor�a() {
		return for�a;
	}
	public void setFor�a(Integer for�a) {
		this.for�a = for�a;
	}
	public Integer getPotenciaMMSS() {
		return potenciaMMSS;
	}
	public void setPotenciaMMSS(Integer potenciaMMSS) {
		this.potenciaMMSS = potenciaMMSS;
	}
	public Integer getVo2Maximo() {
		return vo2Maximo;
	}
	public void setVo2Maximo(Integer vo2Maximo) {
		this.vo2Maximo = vo2Maximo;
	}
	public Integer getFlexibilidade() {
		return flexibilidade;
	}
	public void setFlexibilidade(Integer flexibilidade) {
		this.flexibilidade = flexibilidade;
	}
	public Integer getMassaGorda() {
		return massaGorda;
	}
	public void setMassaGorda(Integer massaGorda) {
		this.massaGorda = massaGorda;
	}
	public Integer getMassaMagra() {
		return massaMagra;
	}
	public void setMassaMagra(Integer massaMagra) {
		this.massaMagra = massaMagra;
	}
	public Integer getMassaOssea() {
		return massaOssea;
	}
	public void setMassaOssea(Integer massaOssea) {
		this.massaOssea = massaOssea;
	}
	public Integer getMassaResidual() {
		return massaResidual;
	}
	public void setMassaResidual(Integer massaResidual) {
		this.massaResidual = massaResidual;
	}
	public Integer getGordura() {
		return gordura;
	}
	public void setGordura(Integer gordura) {
		this.gordura = gordura;
	}
	public ArrayList<Instrutor> getInstrutores() {
		return instrutores;
	}
	public void setInstrutores(ArrayList<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}
	public Date getDataAvalia��o() {
		return dataAvalia��o;
	}
	public void setDataAvalia��o(Date dataAvalia��o) {
		this.dataAvalia��o = dataAvalia��o;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAvalia��o == null) ? 0 : dataAvalia��o.hashCode());
		result = prime * result + ((flexibilidade == null) ? 0 : flexibilidade.hashCode());
		result = prime * result + ((for�a == null) ? 0 : for�a.hashCode());
		result = prime * result + ((gordura == null) ? 0 : gordura.hashCode());
		result = prime * result + ((instrutores == null) ? 0 : instrutores.hashCode());
		result = prime * result + ((massaGorda == null) ? 0 : massaGorda.hashCode());
		result = prime * result + ((massaMagra == null) ? 0 : massaMagra.hashCode());
		result = prime * result + ((massaOssea == null) ? 0 : massaOssea.hashCode());
		result = prime * result + ((massaResidual == null) ? 0 : massaResidual.hashCode());
		result = prime * result + ((potenciaMMSS == null) ? 0 : potenciaMMSS.hashCode());
		result = prime * result + ((resistencia == null) ? 0 : resistencia.hashCode());
		result = prime * result + ((vo2Maximo == null) ? 0 : vo2Maximo.hashCode());
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
		AvaliacaoNeumotora other = (AvaliacaoNeumotora) obj;
		if (dataAvalia��o == null) {
			if (other.dataAvalia��o != null)
				return false;
		} else if (!dataAvalia��o.equals(other.dataAvalia��o))
			return false;
		if (flexibilidade == null) {
			if (other.flexibilidade != null)
				return false;
		} else if (!flexibilidade.equals(other.flexibilidade))
			return false;
		if (for�a == null) {
			if (other.for�a != null)
				return false;
		} else if (!for�a.equals(other.for�a))
			return false;
		if (gordura == null) {
			if (other.gordura != null)
				return false;
		} else if (!gordura.equals(other.gordura))
			return false;
		if (instrutores == null) {
			if (other.instrutores != null)
				return false;
		} else if (!instrutores.equals(other.instrutores))
			return false;
		if (massaGorda == null) {
			if (other.massaGorda != null)
				return false;
		} else if (!massaGorda.equals(other.massaGorda))
			return false;
		if (massaMagra == null) {
			if (other.massaMagra != null)
				return false;
		} else if (!massaMagra.equals(other.massaMagra))
			return false;
		if (massaOssea == null) {
			if (other.massaOssea != null)
				return false;
		} else if (!massaOssea.equals(other.massaOssea))
			return false;
		if (massaResidual == null) {
			if (other.massaResidual != null)
				return false;
		} else if (!massaResidual.equals(other.massaResidual))
			return false;
		if (potenciaMMSS == null) {
			if (other.potenciaMMSS != null)
				return false;
		} else if (!potenciaMMSS.equals(other.potenciaMMSS))
			return false;
		if (resistencia == null) {
			if (other.resistencia != null)
				return false;
		} else if (!resistencia.equals(other.resistencia))
			return false;
		if (vo2Maximo == null) {
			if (other.vo2Maximo != null)
				return false;
		} else if (!vo2Maximo.equals(other.vo2Maximo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AvaliacaoNeumotora [resistencia=" + resistencia + ", for�a=" + for�a + ", potenciaMMSS=" + potenciaMMSS
				+ ", vo2Maximo=" + vo2Maximo + ", flexibilidade=" + flexibilidade + ", massaGorda=" + massaGorda
				+ ", massaMagra=" + massaMagra + ", massaOssea=" + massaOssea + ", massaResidual=" + massaResidual
				+ ", gordura=" + gordura + ", instrutores=" + instrutores + ", dataAvalia��o=" + dataAvalia��o
				+ ", getResistencia()=" + getResistencia() + ", getFor�a()=" + getFor�a() + ", getPotenciaMMSS()="
				+ getPotenciaMMSS() + ", getVo2Maximo()=" + getVo2Maximo() + ", getFlexibilidade()="
				+ getFlexibilidade() + ", getMassaGorda()=" + getMassaGorda() + ", getMassaMagra()=" + getMassaMagra()
				+ ", getMassaOssea()=" + getMassaOssea() + ", getMassaResidual()=" + getMassaResidual()
				+ ", getGordura()=" + getGordura() + ", getInstrutores()=" + getInstrutores() + ", getDataAvalia��o()="
				+ getDataAvalia��o() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	public AvaliacaoNeumotora(Integer resistencia, Integer for�a, Integer potenciaMMSS, Integer vo2Maximo,
			Integer flexibilidade, Integer massaGorda, Integer massaMagra, Integer massaOssea, Integer massaResidual,
			Integer gordura, ArrayList<Instrutor> instrutores, Date dataAvalia��o) {
		super();
		this.resistencia = resistencia;
		this.for�a = for�a;
		this.potenciaMMSS = potenciaMMSS;
		this.vo2Maximo = vo2Maximo;
		this.flexibilidade = flexibilidade;
		this.massaGorda = massaGorda;
		this.massaMagra = massaMagra;
		this.massaOssea = massaOssea;
		this.massaResidual = massaResidual;
		this.gordura = gordura;
		this.instrutores = instrutores;
		this.dataAvalia��o = dataAvalia��o;
	}
	
}
