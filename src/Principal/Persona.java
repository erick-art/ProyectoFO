package Principal;
/**
 * 
 * @author Pablo D
 * @author Cris T
 * @author Jurgen A
 * @author Cesar M
 * @author Erick V
 *
 */
public class Persona {
	
	//atributos de la clase
	private String nombre, apellido;
	private String cedula;
	private int cant_meses_trabajados, años_trabajados;
	private double salario_total, aguinaldo, salario_seis_meses, monto_mensual, salario_semanal, salario_mensual;
	private double pre_aviso, pago_vacaciones, cesantia, liquidacion;
	//maximo doce meses de salario
	private String fechaIngreso, fechaSalida;
	private int diasVacaciones;
	
	
	//contructor
	public Persona() {
		

		
		
	}
	

	public void calcularAguinaldo() {
	aguinaldo = (salario_total * cant_meses_trabajados) / cant_meses_trabajados;
		

		
	}
	
	public void mostrar () { 
		
	
	
		
	}
	
	public void calcularPreaviso(Boolean bandera_quincenal) {
	
		double preaviso_aux = 0;
		
	if(bandera_quincenal == true) { //Si es true lo divide entre 26
	
	 monto_mensual = (salario_seis_meses*6 ) / 6 ;   
	 
	 preaviso_aux = monto_mensual / 26;
	
	 pre_aviso = preaviso_aux * 15;
		
	} else { //Sino lo hace por 30
		
		 monto_mensual = (salario_seis_meses * 6 ) / 6 ;   
		 
		 preaviso_aux = monto_mensual / 30 ;
		
		 pre_aviso = preaviso_aux * 15;
						
	}
		
		
		
		
		
		
	}
	
	public void calculo_vacaciones (Boolean bandera_semanal ) { 
	
		if (bandera_semanal == true) { 
			
	pago_vacaciones = (salario_semanal / 6 ) * 12; //Metodo no terminado
			
			
		}else { 
			
			pago_vacaciones = (salario_mensual / 30 ) * 14; //Metodo no terminado

			
		}
		
		
		
		
		
	}
	
	
	
	
	public void calcularCensatia(int forma_pago, int dias) {
		
	double cesantia_aux = 0;	
	salario_mensual = (monto_mensual * 6) / 6; 	 
	cesantia_aux = salario_mensual / forma_pago;
	cesantia = cesantia_aux * dias;
	cesantia = cesantia * años_trabajados;  
		 
	}
	
	
	public void calculo_liquidacion() {
		
	liquidacion = pago_vacaciones + cesantia + aguinaldo + pre_aviso ;	 
		
		
		
	}
	
	
	
	
	/**
	 * 
	 * Metodos Setter and Getter
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}


	public int getCant_meses_trabajados() {
		return cant_meses_trabajados;
	}


	public void setCant_meses_trabajados(int cant_meses_trabajados) {
		this.cant_meses_trabajados = cant_meses_trabajados;
	}


	public double getSalario_total() {
		return salario_total;
	}


	public void setSalario_total(double salario_total) {
		this.salario_total = salario_total;
	}


	public double getAguinaldo() {
		return aguinaldo;
	}


	public void setAguinaldo(double aguinaldo) {
		this.aguinaldo = aguinaldo;
	}


}
