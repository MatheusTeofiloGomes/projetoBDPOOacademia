import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Preescricao {
	private Date hora0;
	private Date horaF;
	private Date data0;
	private Date dataF;
	@Id
	private Integer repetição;

	public Date getHora0() {
		return hora0;
	}
	public void setHora0(Date hora0) {
		this.hora0 = hora0;
	}
	public Date getHoraF() {
		return horaF;
	}
	public void setHoraF(Date horaF) {
		this.horaF = horaF;
	}
	public Date getData0() {
		return data0;
	}
	public void setData0(Date data0) {
		this.data0 = data0;
	}
	public Date getDataF() {
		return dataF;
	}
	public void setDataF(Date dataF) {
		this.dataF = dataF;
	}
	public Integer getRepetição() {
		return repetição;
	}
	public void setRepetição(Integer repetição) {
		this.repetição = repetição;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data0 == null) ? 0 : data0.hashCode());
		result = prime * result + ((dataF == null) ? 0 : dataF.hashCode());
		result = prime * result + ((hora0 == null) ? 0 : hora0.hashCode());
		result = prime * result + ((horaF == null) ? 0 : horaF.hashCode());
		result = prime * result + ((repetição == null) ? 0 : repetição.hashCode());
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
		Preescricao other = (Preescricao) obj;
		if (data0 == null) {
			if (other.data0 != null)
				return false;
		} else if (!data0.equals(other.data0))
			return false;
		if (dataF == null) {
			if (other.dataF != null)
				return false;
		} else if (!dataF.equals(other.dataF))
			return false;
		if (hora0 == null) {
			if (other.hora0 != null)
				return false;
		} else if (!hora0.equals(other.hora0))
			return false;
		if (horaF == null) {
			if (other.horaF != null)
				return false;
		} else if (!horaF.equals(other.horaF))
			return false;
		if (repetição == null) {
			if (other.repetição != null)
				return false;
		} else if (!repetição.equals(other.repetição))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Preescricao [hora0=" + hora0 + ", horaF=" + horaF + ", data0=" + data0 + ", dataF=" + dataF
				+ ", repetição=" + repetição + ", getHora0()=" + getHora0() + ", getHoraF()=" + getHoraF()
				+ ", getData0()=" + getData0() + ", getDataF()=" + getDataF() + ", getRepetição()=" + getRepetição()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	public Preescricao(Date hora0, Date horaF, Date data0, Date dataF, Integer repetição) {
		super();
		this.hora0 = hora0;
		this.horaF = horaF;
		this.data0 = data0;
		this.dataF = dataF;
		this.repetição = repetição;
	}
	
}
