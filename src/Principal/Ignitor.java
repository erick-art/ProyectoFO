package Principal;

import java.util.ArrayList;
import controlador.Login;
import modelo.Empleado;
import modelo.Usuario;

//Iniciar el programa
public class Ignitor {

	
	//ArrayList de entidades
	public static ArrayList<Empleado> empleados=new ArrayList<Empleado>();
	public static ArrayList<Usuario> usuarios=new ArrayList<Usuario>();	
	
	//Usuario actual
	public static Usuario current=null;
	
	//Constructor del Ignitor
	public Ignitor() {
		new Login();
	}
	
	
	
}
