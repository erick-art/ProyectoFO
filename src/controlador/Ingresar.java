package controlador;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.RegisterField;
import styles.TextFieldBorde;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

//Ingresar los empleados para los posteriores calculos
public class Ingresar extends JPanel{

	//Atrib
	private Color Focus=new Color(37,37,37);
	private JTextField regCedula;
	
	//Constructor
	public Ingresar() {
		
		//Chara
		setBounds(26, 105, 1047, 516);
		setBorder(new LineBorder(Color.BLACK,1));
		setLayout(null);
		setBackground(Focus);
		
		JLabel lblNewLabel = new JLabel("\u2022 Ingresar Empleado");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 27, 248, 51);
		add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(250, 39, 17, 466);
		add(separator);
		
		JLabel newempicon = new JLabel("");
		newempicon.setBounds(53, 89, 124, 119);
		Main.imageResizer(newempicon,"/recursos/newempicon.png");
		add(newempicon);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(5,176,85));
		btnNewButton.setBorder(new LineBorder(Color.BLACK,2));
		btnNewButton.setBounds(889, 466, 148, 39);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("<html><body>Si usted desea ingresar un nuevo empleado, deber\u00E1 ingresar los datos que se le solicitan, cerci\u00F3rese que est\u00E9n correctos y presione el bot\u00F3n \u2018Calcular\u2019.</body></html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(10, 251, 197, 231);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre del empleado");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(268, 109, 156, 14);
		add(lblNewLabel_2);
		
		JLabel lblCedulaDelEmpleado = new JLabel("Cedula del empleado");
		lblCedulaDelEmpleado.setForeground(Color.WHITE);
		lblCedulaDelEmpleado.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblCedulaDelEmpleado.setBounds(268, 70, 156, 14);
		add(lblCedulaDelEmpleado);
		
		JLabel lblApellidoDelEmpleado = new JLabel("Apellido del empleado");
		lblApellidoDelEmpleado.setForeground(Color.WHITE);
		lblApellidoDelEmpleado.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblApellidoDelEmpleado.setBounds(268, 148, 156, 14);
		add(lblApellidoDelEmpleado);
		
		regCedula = new RegisterField("9 digitos");
		regCedula.setBounds(428, 62, 188, 28);
		add(regCedula);
		regCedula.setColumns(10);
		
		RegisterField regNombre = new RegisterField("Nombre");
		regNombre.setColumns(10);
		regNombre.setBounds(428, 101, 188, 28);
		add(regNombre);
		
		RegisterField regApellido = new RegisterField("Apellido");
		regApellido.setColumns(10);
		regApellido.setBounds(428, 140, 188, 28);
		add(regApellido);
		
		JLabel lblVacionesAcomuladas = new JLabel("Vaciones acomuladas");
		lblVacionesAcomuladas.setForeground(Color.WHITE);
		lblVacionesAcomuladas.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblVacionesAcomuladas.setBounds(268, 187, 156, 14);
		add(lblVacionesAcomuladas);
		
		RegisterField registerField = new RegisterField("Vacaciones");
		registerField.setColumns(10);
		registerField.setBounds(428, 179, 188, 28);
		add(registerField);
		
		
		
		//Eventos de 'Ingresar'
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(2,148,70));
			}
					
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(5,176,85));
			}
					
					
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(dataCheck()==0) {
					
				}
			}
		});
		
	}
	
	
	//Checkear los datos ingresados
	public int dataCheck() {
		int general=0;
		
		
		//Message
		switch(general) {
		
		}
		
		
		return general;
	}
}
