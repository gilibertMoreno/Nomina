package Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.tag.common.fmt.ParseDateSupport;

import Dao.EmpleadoDao;
import Dao.EmpleadoDaoMySQL;
import Models.Empleado;
//import jdk.internal.org.jline.reader.Parser.ParseContext;

/**
 * Servlet implementation class EmpleadoController
 */
@WebServlet("/EmpleadoC")
public class EmpleadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpleadoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //TODO Auto-generated method stub
		String inicio=request.getParameter("ingreso");
		System.out.println(request.getParameter("ingreso"));
		DateFormat conv=new SimpleDateFormat("YYYY-MM-DD");
		Date iniciof;
		try {
			iniciof = conv.parse(inicio);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(inicio);
		//Date ingreso=new Date(Date.parse());
		
		//Date retiro=new Date(Date.parse(request.getParameter("retiro")));
		//Date fechanac=new Date(Date.parse(request.getParameter("cumpleanios")));
		
		String opcion=request.getParameter("opcion");
		EmpleadoDao empleado=new EmpleadoDaoMySQL();
		Empleado e=new Empleado();
		e.setCodigo(request.getParameter("codigo"));
		e.setCedula(request.getParameter("cedula"));
		e.setNombre(request.getParameter("nombre"));
		e.setFechaingreso(null);
		e.setFechanacimiento(null);
		e.setFecharetiro(null);
		
		empleado.insertar(e);
		
		//doGet(request, response);
	}

}
