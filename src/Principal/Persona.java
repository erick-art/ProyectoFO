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
	private int cant_meses_trabajados, años_trabajados, dias_preaviso;
	private double salario_total, aguinaldo, salario_seis_meses, monto_mensual, salario_semanal, salario_mensual;
	private double pre_aviso, pago_vacaciones, cesantia, liquidacion;
	//maximo doce meses de salario
	private String fechaIngreso, fechaSalida;
	private int diasVacaciones;
	
	
	//contructor
	public Persona() {
		

		
		
	}
	

	public void calcularAguinaldo() {
	aguinaldo = salario_total  / 12;
		

		
	}
	
	public void mostrar () { 
		
	
	
		
	}
	
	public void calcularPreaviso() {
	
	double preaviso_aux = 0;
		
	
	 monto_mensual = salario_seis_meses / 6 ;   
	 
	 preaviso_aux = monto_mensual / 30;
	
	 pre_aviso = preaviso_aux * dias_preaviso;
		
	
						
	}
		
		
		
		
		
		
	
	
	public void calculo_vacaciones () { 

	pago_vacaciones = (salario_mensual / 30 ) *  diasVacaciones;		
			
	}
	
	
	
	
	public void calcularCensatia(int dias) {
		
	double cesantia_aux = 0;	
	salario_mensual = monto_mensual / 6; 	 
	cesantia_aux = salario_mensual / 30;
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
