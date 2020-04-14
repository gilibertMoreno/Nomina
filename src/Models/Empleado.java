package Models;

import java.sql.Date;

public class Empleado {
private String codigo;
private String cedula;
private String nombre;
private Date fechanacimiento;
private Date fechaingreso;
private Date fecharetiro;
public Empleado(String codigo, String cedula, String nombre, Date fechanacimiento, Date fechaingreso,
		Date fecharetiro) {
	super();
	this.codigo = codigo;
	this.cedula = cedula;
	this.nombre = nombre;
	this.fechanacimiento = fechanacimiento;
	this.fechaingreso = fechaingreso;
	this.fecharetiro = fecharetiro;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Date getFechanacimiento() {
	return fechanacimiento;
}
public void setFechanacimiento(Date fechanacimiento) {
	this.fechanacimiento = fechanacimiento;
}
public Date getFechaingreso() {
	return fechaingreso;
}
public void setFechaingreso(Date fechaingreso) {
	this.fechaingreso = fechaingreso;
}
public Date getFecharetiro() {
	return fecharetiro;
}
public void setFecharetiro(Date fecharetiro) {
	this.fecharetiro = fecharetiro;
}
@Override
public String toString() {
	return "Empleado [codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", fechanacimiento="
			+ fechanacimiento + ", fechaingreso=" + fechaingreso + ", fecharetiro=" + fecharetiro + "]";
}


}
