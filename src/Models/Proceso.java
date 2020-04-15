package Models;

import java.sql.Date;

public class Proceso {
	private int id;
	private String descripcion;
	private Date fechainicio;
	private Date fechafin;
	public Proceso(int id, String descripcion, Date fechainicio, Date fechafin) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	@Override
	public String toString() {
		return "Proceso [id=" + id + ", descripcion=" + descripcion + ", fechainicio=" + fechainicio + ", fechafin="
				+ fechafin + "]";
	}
	
	

}
