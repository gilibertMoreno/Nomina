package Util;

import java.util.Date;

import Dao.EmpleadoDao;
import Dao.EmpleadoDaoMySQL;
import Models.Empleado;


/*import convencion.dao.ParticipanteDao;
import convencion.dao.ParticipanteDaoMySQL;
import convencion.model.Participante;
*/
public class Prueba {

	public static void main(String[] args) {
       EmpleadoDao pDao = new EmpleadoDaoMySQL();
		
		Empleado n = new Empleado();
		n.setCodigo("1234");
		n.setCedula("12345678899");
		n.setNombre("gilmor");
		n.setFechanacimiento(null);
		n.setFechaingreso(null);
		n.setFecharetiro(null);
		
		
		pDao.insertar(n);
		/*
		 * // objeto para manipular el dao ParticipanteDao pDao = new
		 * ParticipanteDaoMySQL();
		 * 
		 * Participante n = new Participante(); n.setEmail("email");
		 * n.setEstado("activo"); n.setNombre("nombre"); n.setTelefono("telefono");
		 * 
		 * pDao.insertar(n);
		 * 
		 * // imprimir los clientes pDao.listar().forEach(System.out::println);
		 * 
		 * // obtner un cliente Participante participante = pDao.obtener(1);
		 * participante.setNombre("Pardo"); //actualizar cliente
		 * pDao.actualizar(participante);
		 */
 /*
		// imprimir los clientes
		System.out.println("*****");
		clienteDao.obtenerClientes().forEach(System.out::println);
		*/
	}

}
