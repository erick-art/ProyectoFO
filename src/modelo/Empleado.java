package modelo;

import java.util.Date;

public abstract class Empleado {
	
	//Variables informativas
	private String cedula;
	private String nombre;
	private String apellido;
	private Date FechaIngreso;
	private Date FechaSalida;
	private String realizador;
	private double salarios[]=new double[12];
	private int vacaciones;
	private boolean responsabilidad;
	private double aguinaldo, salario_seis_meses, monto_mensual, salario_mensual, salario_total;
	private double pre_aviso, cesantia, liquidacion;
	private long dias_trabajados;
	
	
	
	//Calculos
	private double calculoVaciones;
	private double calculoAguinaldo;
	
	//Constructor Empleado
	public Empleado() {
		
	}

	
	
	public void mostrar () { 
		
	
	
		
	}
	
	
	
	/*public void calcularCensatia(int dias) {
		
	double cesantia_aux = 0;	
	salario_mensual = monto_mensual / 6; 	 
	cesantia_aux = salario_mensual / 30;
	cesantia = cesantia_aux * dias;
	//cesantia = cesantia * años_trabajados;  
		 
	} */
	
	
	public void calculo_liquidacion() {
		
	//liquidacion = calculoVacaciones + cesantia + aguinaldo + pre_aviso ;	 
				
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

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

	public Date getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida() {
		return FechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		FechaSalida = fechaSalida;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

	public boolean isResponsabilidad() {
		return responsabilidad;
	}

	public void setResponsabilidad(boolean responsabilidad) {
		this.responsabilidad = responsabilidad;
	}

	
	public void setCalculoAguinaldo(int calculoAguinaldo) {
		this.calculoAguinaldo = calculoAguinaldo;
	}

	
	public double getAguinaldo() {
		return aguinaldo;
	}



	public void setAguinaldo(double aguinaldo) {
		this.aguinaldo = aguinaldo;
	}



	public double getSalario_seis_meses() {
		return salario_seis_meses;
	}



	public void setSalario_seis_meses(double salario_seis_meses) {
		this.salario_seis_meses = salario_seis_meses;
	}



	public double getMonto_mensual() {
		return monto_mensual;
	}



	public void setMonto_mensual(double monto_mensual) {
		this.monto_mensual = monto_mensual;
	}



	public double getSalario_mensual() {
		return salario_mensual;
	}



	public String getRealizador() {
		return realizador;
	}



	public void setRealizador(String realizador) {
		this.realizador = realizador;
	}



	public void setSalario_mensual(double salario_mensual) {
		this.salario_mensual = salario_mensual;
	}



	public double getPre_aviso() {
		return pre_aviso;
	}



	public void setPre_aviso(double pre_aviso) {
		this.pre_aviso = pre_aviso;
	}



	

	public double getCesantia() {
		return cesantia;
	}



	public void setCesantia(double cesantia) {
		this.cesantia = cesantia;
	}



	public double getLiquidacion() {
		return liquidacion;
	}



	public void setLiquidacion(double liquidacion) {
		this.liquidacion = liquidacion;
	}



	public long getDias_trabajados() {
		return dias_trabajados;
	}



	public void setDias_trabajados(long dias_trabajados) {
		this.dias_trabajados = dias_trabajados;
	}



	public double getSalario_total() {
		return salario_total;
	}



	public void setSalario_total(double salario_total) {
		this.salario_total = salario_total;
	}



	public int getVacaciones() {
		return vacaciones;
	}



	public void setVacaciones(int vacaciones) {
		this.vacaciones = vacaciones;
	}



	public double getCalculoVaciones() {
		return calculoVaciones;
	}



	public void setCalculoVaciones(double calculoVaciones) {
		this.calculoVaciones = calculoVaciones;
	}



	public double getCalculoAguinaldo() {
		return calculoAguinaldo;
	}



	public void setCalculoAguinaldo(double calculoAguinaldo) {
		this.calculoAguinaldo = calculoAguinaldo;
	}




	
	
}
