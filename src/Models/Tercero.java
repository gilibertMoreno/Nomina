package Models;

public class Tercero {
private String codtercero;
private String descripcion;

public Tercero(String codtercero, String descripcion) {
	super();
	this.codtercero = codtercero;
	this.descripcion = descripcion;
}

public String getCodtercero() {
	return codtercero;
}

public void setCodtercero(String codtercero) {
	this.codtercero = codtercero;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

@Override
public String toString() {
	return "Tercero [codtercero=" + codtercero + ", descripcion=" + descripcion + "]";
}



}
