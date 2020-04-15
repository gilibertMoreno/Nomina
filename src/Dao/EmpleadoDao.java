package Dao;

import java.util.List;

import Models.Empleado;


public interface EmpleadoDao {
	
	public List<Empleado> listar();
	public Empleado obtener(int id);
	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public void eliminar(Empleado empleado);

}
