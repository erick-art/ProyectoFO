package controlador;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;


//Ingresar los empleados para los posteriores calculos
public class Modificar extends JPanel{

	//Atrib
	private Color Focus=new Color(37,37,37);
	
	//Constructor
	public Modificar() {
		
		//Chara
		setBounds(26, 105, 1047, 516);
		setBorder(new LineBorder(Color.BLACK,1));
		setLayout(null);
		setBackground(Focus);
		
		JLabel lblNewLabel = new JLabel("\u2022 Modificar");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel.setBounds(43, 27, 248, 51);
		add(lblNewLabel);
	
		
		
		
		
	}
	
	
	
}
