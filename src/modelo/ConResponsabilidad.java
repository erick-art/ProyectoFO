package modelo;

public class ConResponsabilidad extends Empleado{

	
	private boolean preaviso;
	private double calculoCesantia;
	private double calculoPreaviso;
	
	
	//Constructor ConResponsabilidad
	public void ConResponsabilidad() {
		
	}


	public boolean isPreaviso() {
		return preaviso;
	}


	public void setPreaviso(boolean preaviso) {
		this.preaviso = preaviso;
	}


	public double getCalculoCesantia() {
		return calculoCesantia;
	}


	public void setCalculoCesantia(double calculoCesantia) {
		this.calculoCesantia = calculoCesantia;
	}


	public double getCalculoPreaviso() {
		return calculoPreaviso;
	}


	public void setCalculoPreaviso(double calculoPreaviso) {
		this.calculoPreaviso = calculoPreaviso;
	}
	
	
}
