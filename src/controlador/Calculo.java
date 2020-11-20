package controlador;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;


//Ingresar los empleados para los posteriores calculos
public class Calculo extends JPanel{

	//Atrib
	private Color Focus=new Color(37,37,37);
	
	//Constructor
	public Calculo() {
		
		//Chara
		setBounds(26, 105, 1047, 516);
		setBorder(new LineBorder(Color.BLACK,1));
		setLayout(null);
		setBackground(Focus);
		
		
		
		
	}
	
	
	
}
