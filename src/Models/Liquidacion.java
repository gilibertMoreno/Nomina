package Models;

import java.sql.Date;


public class Liquidacion {
	private int codmodelo;
	private String codconcepto;
	private String codempleado;
	private String numproceso;
	private float valor;
	private Date fecha;
	private int id;
	public Liquidacion(int codmodelo, String codconcepto, String codempleado, String numproceso, float valor,
			Date fecha, int id) {
		super();
		this.codmodelo = codmodelo;
		this.codconcepto = codconcepto;
		this.codempleado = codempleado;
		this.numproceso = numproceso;
		this.valor = valor;
		this.fecha = fecha;
		this.id = id;
	}
	public int getCodmodelo() {
		return codmodelo;
	}
	public void setCodmodelo(int codmodelo) {
		this.codmodelo = codmodelo;
	}
	public String getCodconcepto() {
		return codconcepto;
	}
	public void setCodconcepto(String codconcepto) {
		this.codconcepto = codconcepto;
	}
	public String getCodempleado() {
		return codempleado;
	}
	public void setCodempleado(String codempleado) {
		this.codempleado = codempleado;
	}
	public String getNumproceso() {
		return numproceso;
	}
	public void setNumproceso(String numproceso) {
		this.numproceso = numproceso;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Liquidacion [codmodelo=" + codmodelo + ", codconcepto=" + codconcepto + ", codempleado=" + codempleado
				+ ", numproceso=" + numproceso + ", valor=" + valor + ", fecha=" + fecha + ", id=" + id + "]";
	}
	
	

}
