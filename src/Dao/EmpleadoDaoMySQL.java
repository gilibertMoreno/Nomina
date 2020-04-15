package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Conexiones.Conexion;
import Models.Empleado;


public class EmpleadoDaoMySQL implements EmpleadoDao {
	
	private Conexion cn;
	List<Empleado> Empleados;

	public EmpleadoDaoMySQL() {
		this.cn = Conexion.getConexion();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		String sql="select * from Empleado";
		Empleados = new ArrayList<Empleado>();
		
		try {			
			
			ResultSet res=cn.query(sql);
			while (res.next()) {
				Empleado Empleado = new Empleado();
				Empleado.setCodigo(res.getString(1));
        	    Empleado.setCedula(res.getString(2));
        	    Empleado.setNombre(res.getString(3));
        	    Empleado.setFechanacimiento(res.getDate(4));
        	    Empleado.setFechaingreso(res.getDate(5));
        	    Empleado.setFecharetiro(res.getDate(6));
				Empleados.add(Empleado);
			}
			res.close();

		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}
		return Empleados;
	}
	
	

	@Override
	public Empleado obtener(int id) {
		// TODO Auto-generated method stub
		try {
     	   ResultSet res = cn.query("SELECT * FROM Empleado where id = " + id + " ");
     	   while(res.next()){
	        	    Empleado Empleado = new Empleado();
	        	    Empleado.setCodigo(res.getString("codigo"));
	        	    Empleado.setCedula(res.getString("cedula"));
	        	    Empleado.setNombre(res.getString("nombre"));
	        	    Empleado.setFechanacimiento(res.getDate("fechanacimiento"));
	        	    Empleado.setFechaingreso(res.getDate("fechaingreso"));
	        	    Empleado.setFecharetiro(res.getDate("fecharetiro"));
	        	    return Empleado;
     	   }
          res.close();

     	  
     	  } catch (Exception e) {
     		  System.out.println(e.getMessage());
     	   //JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
     	  }
     return null;
	}

	@Override
	public void insertar(Empleado Empleado) {
		// TODO Auto-generated method stub
		try {
			String consulta = "INSERT INTO empleado (codigo, cedula, nombre, fechanacimiento, fechaingreso, fecharetiro)  "
					+ "VALUES ('"+Empleado.getCodigo()+"', "+ 
		 			"'" +Empleado.getCedula()+"','" +Empleado.getNombre()+"', "+Empleado.getFechanacimiento()+","+Empleado.getFechaingreso()+","+Empleado.getFecharetiro()+")";
			System.out.println(consulta);
 		   cn.insert(consulta);

 		    
 		  } catch (SQLException e) {
 		            System.out.println(e.getMessage());
 		   //JOptionPane.showMessageDialog(null, "No se Registro la persona");
 		  }

	}

	@Override
	public void actualizar(Empleado Empleado) {
		// TODO Auto-generated method stub
		
		String sql="UPDATE Empleado SET codigo='"+Empleado.getCodigo()+"', cedula='"+Empleado.getCedula()+"', "
				+ "nombre='"+Empleado.getNombre()+"', fechanacimiento='"+Empleado.getFechanacimiento()+"', fechanacimiento='"+Empleado.getFechaingreso()+"', fechanacimiento='"+Empleado.getFecharetiro()+"'" +" WHERE id="+Empleado.getCodigo();
		try {
			cn.insert(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}	

	}

	@Override
	public void eliminar(Empleado Empleado) {
		// TODO Auto-generated method stub

	}

}
