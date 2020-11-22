package modelo;

import java.util.Date;

public abstract class Empleado {
	
	//Variables informativas
	private String cedula;
	private String nombre;
	private String apellido;
	private Date FechaIngreso;
	private Date FechaSalida;
	private double salarios[]=new double[12];
	private boolean responsabilidad;
	private int vacaciones;
	
	//Calculos
	private int calculoVaciones;
	private int calculoAguinaldo;
	
	//Constructor Empleado
	public Empleado() {
		
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

	public int getVacaciones() {
		return vacaciones;
	}

	public void setVacaciones(int vacaciones) {
		this.vacaciones = vacaciones;
	}

	public int getCalculoVaciones() {
		return calculoVaciones;
	}

	public void setCalculoVaciones(int calculoVaciones) {
		this.calculoVaciones = calculoVaciones;
	}

	public int getCalculoAguinaldo() {
		return calculoAguinaldo;
	}

	public void setCalculoAguinaldo(int calculoAguinaldo) {
		this.calculoAguinaldo = calculoAguinaldo;
	}

	
	
	
}
