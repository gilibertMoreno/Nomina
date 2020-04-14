package Models;

public class Concepto {
private String codconcepto;
private String descripcion;
private int tipo;
private String codtercero;
public Concepto(String codconcepto, String descripcion, int tipo, String codtercero) {
	super();
	this.codconcepto = codconcepto;
	this.descripcion = descripcion;
	this.tipo = tipo;
	this.codtercero = codtercero;
}
public String getCodconcepto() {
	return codconcepto;
}
public void setCodconcepto(String codconcepto) {
	this.codconcepto = codconcepto;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public int getTipo() {
	return tipo;
}
public void setTipo(int tipo) {
	this.tipo = tipo;
}
public String getCodtercero() {
	return codtercero;
}
public void setCodtercero(String codtercero) {
	this.codtercero = codtercero;
}
@Override
public String toString() {
	return "Concepto [codconcepto=" + codconcepto + ", descripcion=" + descripcion + ", tipo=" + tipo + ", codtercero="
			+ codtercero + "]";
}

}
