package modelo;

//Clase Usuario
public class Usuario {
	
	//Atributos				
	private String Cedula;
	private String PASSWORD;
	private String NOMBRE;
	private String APELLIDO;
	
	//Constructor Usuario
	public Usuario() {
		
	}
	
	
									//SET & GET
	
	
	
	public String getPASSWORD() {
		return PASSWORD;
	}
	
	public String getCedula() {
		return Cedula;
	}


	public void setCedula(String cedula) {
		Cedula = cedula;
	}


	public String getNOMBRE() {
		return NOMBRE;
	}


	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}


	public String getAPELLIDO() {
		return APELLIDO;
	}


	public void setAPELLIDO(String aPELLIDO) {
		APELLIDO = aPELLIDO;
	}


	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	 
 
}
