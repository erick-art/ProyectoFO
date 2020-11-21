package controlador;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import styles.RegisterField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

//Ingresar los empleados para los posteriores calculos
public class Ingresar extends JPanel{

	//Atrib
	private Color Focus=new Color(37,37,37);
	
	//FIELDS
	private JTextField regCedula;
	private RegisterField regNombre;
	private RegisterField regApellido;
	private RegisterField registerField;
	
	//CON RESP
	private JRadioButton rdbtnConPreaviso;
	private JLabel lblHuboPreaviso;
	private JRadioButton rdbtnSinPreaviso;
	
	//SIN RESP
	private JLabel motivol;
	private JScrollPane motivoPanel;
	
	
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
		
		JLabel lblNewLabel_1 = new JLabel("<html><body>Si usted desea realizar el calculo sobre la liquidacion laboral de un empleado, deber\u00E1 ingresar los datos que a continuacion se le solicitan, cerci\u00F3rese que est\u00E9n correctos y presione el bot\u00F3n \u2018Calcular\u2019.</body></html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(10, 251, 197, 231);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre del empleado:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(268, 109, 156, 14);
		add(lblNewLabel_2);
		
		JLabel lblCedulaDelEmpleado = new JLabel("Cedula del empleado:");
		lblCedulaDelEmpleado.setForeground(Color.WHITE);
		lblCedulaDelEmpleado.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblCedulaDelEmpleado.setBounds(268, 70, 156, 14);
		add(lblCedulaDelEmpleado);
		
		JLabel lblApellidoDelEmpleado = new JLabel("Apellido del empleado:");
		lblApellidoDelEmpleado.setForeground(Color.WHITE);
		lblApellidoDelEmpleado.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblApellidoDelEmpleado.setBounds(268, 148, 156, 14);
		add(lblApellidoDelEmpleado);
		
		regCedula = new RegisterField("9 digitos");
		regCedula.setBounds(428, 62, 188, 28);
		add(regCedula);
		regCedula.setColumns(10);
		
		regNombre = new RegisterField("Nombre");
		regNombre.setColumns(10);
		regNombre.setBounds(428, 101, 188, 28);
		add(regNombre);
		
		regApellido = new RegisterField("Apellido");
		regApellido.setColumns(10);
		regApellido.setBounds(428, 140, 188, 28);
		add(regApellido);
		
		JLabel lblVacionesAcomuladas = new JLabel("Vaciones acomuladas:");
		lblVacionesAcomuladas.setForeground(Color.WHITE);
		lblVacionesAcomuladas.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblVacionesAcomuladas.setBounds(268, 187, 156, 14);
		add(lblVacionesAcomuladas);
		
		registerField = new RegisterField("Vacaciones");
		registerField.setColumns(10);
		registerField.setBounds(428, 179, 188, 28);
		add(registerField);
		
		JLabel lblFecha = new JLabel("Fecha ingreso:");
		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblFecha.setBounds(268, 221, 156, 14);
		add(lblFecha);
		
		JLabel lblFechaSalida = new JLabel("Fecha salida:");
		lblFechaSalida.setForeground(Color.WHITE);
		lblFechaSalida.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblFechaSalida.setBounds(268, 255, 156, 14);
		add(lblFechaSalida);
		
		JLabel lblTipoDeDespido = new JLabel("Despido:");
		lblTipoDeDespido.setForeground(Color.WHITE);
		lblTipoDeDespido.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblTipoDeDespido.setBounds(268, 289, 70, 14);
		add(lblTipoDeDespido);
		
		
		//Accion
		ActionListener accion=Event->typeChanger(((JRadioButton)Event.getSource()).getText().toString());
		
		//Botones radio
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Con responsabilidad");
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(344, 285, 169, 23);
		rdbtnNewRadioButton.setBackground(Focus);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.addActionListener(accion);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSinResponsabilidad = new JRadioButton("Sin responsabilidad");
		rdbtnSinResponsabilidad.setForeground(Color.WHITE);
		rdbtnSinResponsabilidad.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		rdbtnSinResponsabilidad.setBounds(515, 285, 169, 23);
		rdbtnSinResponsabilidad.setBackground(Focus);
		rdbtnSinResponsabilidad.addActionListener(accion);
		add(rdbtnSinResponsabilidad);
		
		//Grupo 1
		ButtonGroup buttonG=new ButtonGroup();
		buttonG.add(rdbtnSinResponsabilidad);
		buttonG.add(rdbtnNewRadioButton);
		
		rdbtnSinPreaviso = new JRadioButton("Sin Preaviso");
		rdbtnSinPreaviso.setForeground(Color.WHITE);
		rdbtnSinPreaviso.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		rdbtnSinPreaviso.setBackground(new Color(37, 37, 37));
		rdbtnSinPreaviso.setBounds(515, 323, 135, 23);
		add(rdbtnSinPreaviso);
		
		rdbtnConPreaviso = new JRadioButton("Con Preaviso");
		rdbtnConPreaviso.setSelected(true);
		rdbtnConPreaviso.setForeground(Color.WHITE);
		rdbtnConPreaviso.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		rdbtnConPreaviso.setBackground(new Color(37, 37, 37));
		rdbtnConPreaviso.setBounds(375, 323, 113, 23);
		rdbtnConPreaviso.setSelected(true);
		add(rdbtnConPreaviso);
		
		lblHuboPreaviso = new JLabel("Preaviso:");
		lblHuboPreaviso.setForeground(Color.WHITE);
		lblHuboPreaviso.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		lblHuboPreaviso.setBounds(299, 327, 70, 14);
		add(lblHuboPreaviso);
		
		//Grupo 2
		ButtonGroup buttonT=new ButtonGroup();
		buttonT.add(rdbtnConPreaviso);
		buttonT.add(rdbtnSinPreaviso);
		
		
		//Sin Resp
		
		motivol = new JLabel("Motivo de despido:");
		motivol.setForeground(Color.WHITE);
		motivol.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		motivol.setBounds(299, 327, 189, 14);
		motivol.setVisible(false);
		add(motivol);
		
		motivoPanel = new JScrollPane();
		motivoPanel.setBounds(309, 352, 357, 85);
		motivoPanel.setBorder(new LineBorder(Color.BLACK,2));
		motivoPanel.setVisible(false);
		add(motivoPanel);
		
		JTextArea motivo = new JTextArea();
		motivo.setFont(new Font("Monospaced", Font.PLAIN, 18));
		motivo.setLineWrap(true);
		motivo.setCaretColor(Color.WHITE);
		motivo.setForeground(Color.WHITE);
		motivo.setBackground(new Color(44,44,44));
		motivoPanel.setViewportView(motivo);
		
		
		
		
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
		
		//Boton de calcular
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
	
	
	
	//Sin responsabilidad / con responsabilidad
	public void typeChanger(String referencia) {
		
		rdbtnConPreaviso.setVisible(false);
		lblHuboPreaviso.setVisible(false);
		rdbtnSinPreaviso.setVisible(false);
		motivol.setVisible(false);
		motivoPanel.setVisible(false);
		
		
		if(referencia.equalsIgnoreCase("Con Responsabilidad")) {
			rdbtnConPreaviso.setVisible(true);
			lblHuboPreaviso.setVisible(true);
			rdbtnSinPreaviso.setVisible(true);
		}else {
			motivol.setVisible(true);
			motivoPanel.setVisible(true);
		}
	}
}
