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
import java.util.Calendar;
import java.util.Date;

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
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;

import modelo.ConResponsabilidad;
import modelo.Empleado;
import modelo.SinResponsabilidad;

//Ingresar los empleados para los posteriores calculos
public class Ingresar extends JPanel{

	//Atrib
	private Color Focus=new Color(37,37,37);
	
	//FIELDS
	private RegisterField regCedula;
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
	private TablaMeses table;
	private JLabel avisoLog;
	private JRadioButton rdbtnNewRadioButton;
	private JTextArea motivo;
	private JDateChooser ingress;
	private JDateChooser salida;
	
	
	//Tabla de meses
	
	
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
		rdbtnNewRadioButton = new JRadioButton("Con responsabilidad");
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
		
		motivo = new JTextArea();
		motivo.setFont(new Font("Monospaced", Font.PLAIN, 18));
		motivo.setLineWrap(true);
		motivo.setCaretColor(Color.WHITE);
		motivo.setForeground(Color.WHITE);
		motivo.setBackground(new Color(44,44,44));
		motivoPanel.setViewportView(motivo);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.BLACK,2));
		scrollPane.setBounds(690, 59, 347, 231);
		scrollPane.getViewport().setBackground(new Color(43,43,43));
		add(scrollPane);
		
		table = new TablaMeses();
		scrollPane.setViewportView(table);
		
		ingress = new JDateChooser();
		ingress.setBounds(428, 218, 188, 20);
		add(ingress);
		
		salida = new JDateChooser();
		salida.setBounds(428, 249, 188, 20);
		add(salida);
		
		avisoLog = new JLabel("");
		avisoLog.setForeground(Color.WHITE);
		avisoLog.setVerticalAlignment(SwingConstants.TOP);
		avisoLog.setFont(new Font("Tahoma", Font.PLAIN, 15));
		avisoLog.setBounds(268, 448, 611, 57);
		add(avisoLog);
		
		
		
		
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
				if(dataVerifyer()==0) {
					DataGetterAndSaver();
					resetAll();
					avisoLog.setText("<html><body>Calculo realizado exitosamente, por favor verifiquelo en la pestaña de 'Mostrar'</body></html>");
				}
			}
			
		});
		
	}
	
	
	//
	public void DataGetterAndSaver() {
		try {
			Empleado temporal=null;
			//Tipo de despido
			if(rdbtnNewRadioButton.isSelected()) {
				temporal=new ConResponsabilidad();
				temporal.setResponsabilidad(true);
			}else {
				temporal=new SinResponsabilidad();
				temporal.setResponsabilidad(false);
			}
			
			if(temporal!=null) {
				
				//Rellenar informacion basica del Empleado
				temporal.setCedula(regCedula.getText());
				temporal.setApellido(regApellido.getText());
				temporal.setNombre(regNombre.getText());
				temporal.setFechaIngreso(ingress.getDate());
				temporal.setFechaSalida(salida.getDate()); 
				temporal.setVacaciones(Integer.parseInt(registerField.getText()));
				temporal.setSalarios(table.obtenerSalarios());

				
				
				//Empleado con despido con responsabilidad
					if(temporal.isResponsabilidad()) {
					
					if(rdbtnConPreaviso.isSelected()) { 
					
					((ConResponsabilidad) temporal).setPreaviso(true);
					
					}else {
						
					((ConResponsabilidad) temporal).setPreaviso(false);	
					
					}
					
					if(((ConResponsabilidad) temporal).isPreaviso()) {
						
					((ConResponsabilidad) temporal).setCalculoPreaviso(0);
						
						
					}else {
						System.out.println();
						temporal.setDias_trabajados(antiguedad_laboral(temporal.getFechaIngreso(), temporal.getFechaSalida()));
						System.out.println(antiguedad_laboral(temporal.getFechaIngreso(), temporal.getFechaSalida()));

						double preaviso_aux = 0;
						double salario = 0.0;
						int condicion = 0;
						
						for (int i = (temporal.getSalarios().length-1); i>=0; i--) {
							
							if (condicion!= 6 ){
								
							salario+= temporal.getSalarios()[i];	
								
							condicion ++;
							}
							
							

							
						}
						
						temporal.setSalario_seis_meses(salario);
						System.out.println(temporal.getSalario_seis_meses());
											
						if(temporal.getDias_trabajados() >= 91 || temporal.getDias_trabajados() <= 182.5) {
						
						temporal.setMonto_mensual(temporal.getSalario_seis_meses() / 6);
						
						System.out.println(temporal.getMonto_mensual());
						 
						preaviso_aux = temporal.getMonto_mensual() / 30;
						
						System.out.println(preaviso_aux);
						
						((ConResponsabilidad) temporal).setCalculoPreaviso(preaviso_aux * 7);
						
						}
						
						if(temporal.getDias_trabajados() > 182.5 || temporal.getDias_trabajados() <= 365) {
							
							temporal.setMonto_mensual(temporal.getSalario_seis_meses()/ 6);
							System.out.println(temporal.getMonto_mensual());

							 
							preaviso_aux = temporal.getMonto_mensual() / 30;
							System.out.println(preaviso_aux);

							((ConResponsabilidad) temporal).setCalculoPreaviso(preaviso_aux * 15);
							
							}
						
						
						System.out.println(temporal.getDias_trabajados());
						
						if (temporal.getDias_trabajados() > 365) { 
							
							temporal.setMonto_mensual(temporal.getSalario_seis_meses() / 6);
							System.out.println(temporal.getMonto_mensual());

							 
							preaviso_aux = temporal.getMonto_mensual() / 30;
							System.out.println(preaviso_aux);

							
							((ConResponsabilidad) temporal).setCalculoPreaviso(preaviso_aux * 30);
							
							
						}
						
						
						
						//>CALCULO DE PREAVISO
						
						
						
						//((ConResponsabilidad) temporal).setCalculoPreaviso(Resultado?);
					}
					
					//>CALCULO DE CESANTIA
					
					
					
				
					//((ConResponsabilidad) temporal).setCalculoCesantia(Resultado?);
					
					
					//CALCULO DE VACACIONES
					
					for (int i = 0; i < temporal.getSalarios().length ; i++) {
						
					temporal.setSalario_total(temporal.getSalarios()[i]);
						
					}
				
					
				temporal.setCalculoVaciones((temporal.getSalario_total() / 30 * temporal.getVacaciones()));
					
				}else {
				//Empleado con despido sin responsabilidad	
					
					((SinResponsabilidad) temporal).setMotivo(motivo.getText());
				
				}
				
				
				//CALCULO DELEMPLEADO EN GENERAL
				double salario_aux = 0.0;
				for (int i = 0; i < temporal.getSalarios().length ; i++) {
					
					salario_aux += temporal.getSalarios()[i];
					
						
					}
				
				temporal.setSalario_total(salario_aux);
				
				temporal.setCalculoAguinaldo(temporal.getSalario_total() / 12 );
				
				temporal.setCalculoVaciones((temporal.getSalario_total() / 30 * temporal.getVacaciones()));
				
				
				
			}
			
			Main.Mis_Empleado.add(temporal);
			System.out.println(">ALL 0K");
			
		} catch (Exception e) {


		
		}
	}
	
	
	
	//Verificar los datos
	public int dataVerifyer() {
		
		int general=0;
		avisoLog.setText("");
		
		//CEDULA
		if((!regCedula.isHolder()) && (regCedula.getText().length()==9)) {
			
			try {
				int var=Integer.parseInt(regCedula.getText());
			} catch (Exception e) {
				if(general==0) {
					general=2;	
				}
			}
			
		}else if(general==0) {
			general=1;
		}
		
		//NOMBRE
		if((regNombre.isHolder()) && (general==0)) {
			general=3;
		}else if((regNombre.getText().length()==0) && (general==0)) {
			general=30;
		}
		
		//APELLIDO
		if((regApellido.isHolder()) && (general==0)) {
			general=4;
		}else if((regApellido.getText().length()==0) && (general==0)) {
			general=40;
		}
		
		//VACACIONES
		if((!registerField.isHolder())) {
			try {
				int va=Integer.parseInt(registerField.getText());
			
				if(va<0) {
					general=50;
				}
			} catch (Exception e) {
				if(general==0) {
					general=6;	
				}
			}
		}else if(general==0) {
			general=5;
		}
		
		
		//SIN RESPONSABILIDAD
		if(!rdbtnNewRadioButton.isSelected()) {
			if(motivo.getText().length()==0) {
				general=7;
			}
		}
		
		//FECHAS
		Date tempA=null;
		Date tempB=null;
		
		if(((tempA=ingress.getDate())!=null) && ((tempB=salida.getDate())!=null)) {
			if(ingress.getDateFormatString().equals(salida.getDateFormatString())){
				if((tempA.compareTo(tempB))!=-1) {
					general=10;
				}
			}else if(general==0) {
				general=9;
			}
		}else if(general==0) {
			general=8;
		}
		
		
		if((table.dataVerifyer()) && (general==0)) {
			general=11;
		}
		
		
		switch(general) {
		
			case 1:{
				avisoLog.setText("<html><body>Por favor ingrese la cedula del empleado (9 digitos).</body></html>");
			}break;
			
			case 2:{
				avisoLog.setText("<html><body>Ingrese solo valores numéricos enteros en el campo de cedula del empleado.</body></html>");
			}break;
			
			case 3:{
				avisoLog.setText("<html><body>Ingrese el nombre del empleado.</body></html>");
			}break;
			
			case 30:{
				avisoLog.setText("<html><body>Ingrese el nombre del empleado.</body></html>");
			}break;
			
			case 4:{
				avisoLog.setText("<html><body>Ingrese el apellido del empleado.</body></html>");
			}break;
			
			case 40:{
				avisoLog.setText("<html><body>Ingrese el apellido del empleado.</body></html>");
			}break;
			
			
			case 5:{
				avisoLog.setText("<html><body>Ingrese las vacaciones acumuladas del empleado.</body></html>");
			}break;
			
			case 50:{
				avisoLog.setText("<html><body>El campo de vacaciones acumuladas no puede ser menor a 0.</body></html>");
			}break;
			
			case 6:{
				avisoLog.setText("<html><body>Ingrese valores numéricos enteros en el campo de vacaciones acumuladas.</body></html>");
			}break;
			
			case 7:{
				avisoLog.setText("<html><body>Debe ingresar el motivo de despido.</body></html>");
			}break;
			
			case 8:{
				avisoLog.setText("<html><body>Proporcione la fecha de ingreso y salida del empleado.</body></html>");
			}break;
			
			case 9:{
				avisoLog.setText("<html><body>Las fechas proporcionadas no tienen el mismo formato</body></html>");
			}break;
			
			case 10:{
				avisoLog.setText("<html><body>La fecha de salida es menor a la de ingreso.</body></html>");
			}break;
			
			case 11:{
				avisoLog.setText("<html><body>Por favor verifique los valores de la tabla de salarios.</body></html>");
			}break;		
		
		}
		
		
		return general;
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
	
	
	
	//Resetear todo
	public void resetAll() {

		avisoLog.setText("");
		regCedula.setHolder(true);
		regNombre.setHolder(true);
		registerField.setHolder(true);
		regApellido.setHolder(true);
		motivo.setText("");
		ingress.setDate(null);
		salida.setDate(null);
		table.resetAll();
	
}


public long antiguedad_laboral (Date inicio , Date fin) { 

long dias = 0; 

dias= (fin.getTime()-inicio.getTime()) /86400000;

return dias;	
	
} 


}