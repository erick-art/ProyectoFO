package controlador;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import javax.swing.table.DefaultTableModel;

import modelo.ConResponsabilidad;
import modelo.SinResponsabilidad;
import styles.CustomButton;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;



//Ingresar los empleados para los posteriores calculos
public class Mostrar extends JPanel{

	//Atrib
	private Color Focus=new Color(37,37,37);
	private CustomButton ConResButton;
	private CustomButton SinResButton;
	private JPanel SinRespanel;
	private JPanel ConRespanel;
	private JTable ConRestable;
	private JScrollPane ConResscrollPane;
	private JTable SinRestable;
	private JScrollPane SinResscrollPane;
	
	private int Rowsel=-1;
	
	private DefaultTableModel SinResModel;
	private DefaultTableModel ConResModel;
	//Constructor
	public Mostrar() {
		
		//Chara
		setBounds(26, 105, 1047, 516);
		setBorder(new LineBorder(Color.BLACK,1));
		setLayout(null);
		setBackground(Focus);
		
		JLabel lblNewLabel = new JLabel("\u2022 Mostrar");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel.setBounds(43, 11, 248, 51);
		add(lblNewLabel);
		
		
		//PANELES
		

		//Botones Pestanas
		
				ConResButton = new CustomButton(1,"Con responsabilidad","/recursos/ConRes.png",160);
				ConResButton.setBounds(26, 68, 220, 37);
				add(ConResButton);
				
				SinResButton = new CustomButton(2,"Sin responsabilidad","/recursos/SinRes.png",160);
				SinResButton.setBounds(245, 68, 220, 37);
				add(SinResButton);
				
				
				//PANELES
				
				 ConRespanel = new JPanel();
				ConRespanel.setBounds(26, 105, 1011, 361);
				ConRespanel.setBorder(new LineBorder(Color.BLACK,1));
				ConRespanel.setBackground(Focus);
				add(ConRespanel);
				ConRespanel.setLayout(null);
				
				ConResscrollPane = new JScrollPane();
				ConResscrollPane.setBounds(10, 11, 991, 339);
				ConRespanel.add(ConResscrollPane);
				
				ConRestable = new JTable();
				
				ConResscrollPane.setViewportView(ConRestable);
				SinRespanel = new JPanel();
				SinRespanel.setBounds(26, 105, 1011, 361);
				SinRespanel.setBorder(new LineBorder(Color.BLACK,1));
				SinRespanel.setVisible(false);
				SinRespanel.setBackground(Focus);
				add(SinRespanel);
				SinRespanel.setLayout(null);
				
				SinResscrollPane = new JScrollPane();
				SinResscrollPane.setBounds(10, 11, 991, 339);
				SinRespanel.add(SinResscrollPane);
				
				SinRestable = new JTable();
				
				SinResscrollPane.setViewportView(SinRestable);
				
				JLabel avisoLog = new JLabel("");
				avisoLog.setForeground(Color.WHITE);
				avisoLog.setVerticalAlignment(SwingConstants.TOP);
				avisoLog.setFont(new Font("Tahoma", Font.PLAIN, 15));
				
				avisoLog.setBounds(43, 464, 398, 29);
				add(avisoLog);;
				JButton btnNewButton = new JButton("Eliminar");
				btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
				btnNewButton.setForeground(Color.WHITE);
				btnNewButton.setFocusPainted(false);
				btnNewButton.setBackground(new Color(5,176,85));
				btnNewButton.setBorder(new LineBorder(Color.BLACK,2));
				btnNewButton.setBounds(460, 466, 148, 39);
				add(btnNewButton);
				
				SinRestable.addFocusListener(new FocusListener() {
					
					@Override
					public void focusLost(FocusEvent arg0) {
						// TODO Auto-generated method stub
						try {
							System.out.println("que chuas hace el focusLost doble elck");
							
							Rowsel =SinRestable.getSelectedRow();
							 System.out.println("sin modificar"+SinRestable.getValueAt(SinRestable.getSelectedRow(), SinRestable.getSelectedColumn()).toString());
						} catch (Exception e) {
							// TODO: handle exception
						}
						
					}
					
					@Override
					public void focusGained(FocusEvent arg0) {
						// TODO Auto-generated method stub
						try {
							Rowsel=-1;
							 System.out.println("modificado"+SinRestable.getValueAt(Rowsel,0 ).toString());
							
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						 
					}
				});
				
				ConRestable.addFocusListener(new FocusListener() {
					
					@Override
					public void focusLost(FocusEvent arg0) {
						// TODO Auto-generated method stub
						try {
							
							
							Rowsel =ConRestable.getSelectedRow();
							 System.out.println("sin modificar"+ConRestable.getValueAt(ConRestable.getSelectedRow(), ConRestable.getSelectedColumn()).toString());
						} catch (Exception e) {
							// TODO: handle exception
						}
						
					}
					
					@Override
					public void focusGained(FocusEvent arg0) {
						// TODO Auto-generated method stub
						try {
							Rowsel=-1;
							 System.out.println("modificado"+ConRestable.getValueAt(Rowsel,0 ).toString());
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						 
					}
				});

				
				

				//EVENTOS BOTONES JPANEL
				ConResButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						switcher(ConResButton);
						try {
							ConResModel=null;
							RellenarTablas();
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						
						
					}
				});
				
				SinResButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						switcher(SinResButton);
						try {
							SinResModel=null;
							RellenarTablas();
						} catch (Exception e) {
							// TODO: handle exception
						}
						
						
					}
				});
				btnNewButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent arg0) {
						btnNewButton.setBackground(new Color(2,148,70));
					}
							
					@Override
					public void mouseExited(MouseEvent arg0) {
						btnNewButton.setBackground(new Color(5,176,85));
					}});
				
				//Boton de calcular
				btnNewButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
							if (Rowsel==-1) {
								avisoLog.setText("<html><body>No ha selecionado ningun empleado para eliminar.</body></html>");
							}else {
								Main.Mis_Empleado.remove(Rowsel);
								Rowsel=-1;
						avisoLog.setText("<html><body>Se elimino corretamente el empleado.</body></html>");
							}
					}
					
				});
	}
	
	public void RellenarTablas() {
		
SinResModel= new DefaultTableModel();
		
		SinResModel.addColumn("Nombre");
		SinResModel.addColumn("Apellido");
		SinResModel.addColumn("Cédula");
		SinResModel.addColumn("Fecha de ingreso");
		SinResModel.addColumn("Fecha de salida");
		SinResModel.addColumn("Agunaldo");
		SinResModel.addColumn("Vacaciones");
		SinResModel.addColumn("Motivo");
		SinResModel.addColumn("ultimo que lo modificacion");
	
		
		ConResModel= new DefaultTableModel();
		
		ConResModel.addColumn("Nombre");
		ConResModel.addColumn("Apellido");
		ConResModel.addColumn("Cédula");
		ConResModel.addColumn("Fecha de ingreso");
		ConResModel.addColumn("Fecha de salida");
		ConResModel.addColumn("Agunaldo");
		ConResModel.addColumn("Vacaciones");
		ConResModel.addColumn("Cesantia");
		ConResModel.addColumn("Preaviso");
		ConResModel.addColumn("ultimo que lo modificacion");
		
		ConRestable.setModel(ConResModel);
		ConRestable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		ConRestable.setRowHeight(20); 
		ConRestable.getColumnModel().getColumn(0).setMinWidth(100);
		ConRestable.getColumnModel().getColumn(1).setMinWidth(120);
		ConRestable.getColumnModel().getColumn(2).setMinWidth(120);
		ConRestable.getColumnModel().getColumn(3).setMinWidth(120);
		ConRestable.getColumnModel().getColumn(4).setMinWidth(120);
		ConRestable.getColumnModel().getColumn(5).setMinWidth(120);
		ConRestable.getColumnModel().getColumn(6).setMinWidth(120);
		ConRestable.getColumnModel().getColumn(7).setMinWidth(120);
		ConRestable.getColumnModel().getColumn(8).setMinWidth(120);
		ConRestable.getColumnModel().getColumn(9).setMinWidth(150);
		
		SinRestable.setModel(SinResModel);
		SinRestable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		SinRestable.setRowHeight(20); 
		SinRestable.getColumnModel().getColumn(0).setMinWidth(100);
		SinRestable.getColumnModel().getColumn(1).setMinWidth(120);
		SinRestable.getColumnModel().getColumn(2).setMinWidth(120);
		SinRestable.getColumnModel().getColumn(3).setMinWidth(120);
		SinRestable.getColumnModel().getColumn(4).setMinWidth(120);
		SinRestable.getColumnModel().getColumn(5).setMinWidth(120);
		SinRestable.getColumnModel().getColumn(6).setMinWidth(120);
		SinRestable.getColumnModel().getColumn(7).setMinWidth(120);
		SinRestable.getColumnModel().getColumn(8).setMinWidth(150);
		for (int i = 0; i < Main.Mis_Empleado.size(); i++) {
			if(Main.Mis_Empleado.get(i).isResponsabilidad()==true) {
					//llenando la tabla con resposabilidad 
					String CRDatos []=new String [10];
					ConResponsabilidad ConRes=(ConResponsabilidad) Main.Mis_Empleado.get(i);
					CRDatos [0]=ConRes.getNombre();
					CRDatos [1]=ConRes.getApellido();
					CRDatos [2]=ConRes.getCedula();
					CRDatos [3]=String.valueOf(ConRes.getFechaIngreso());
					CRDatos [4]=String.valueOf(ConRes.getFechaSalida());
					CRDatos [5]=String.valueOf(ConRes.getCalculoAguinaldo());
					CRDatos [6]=String.valueOf(ConRes.getVacaciones());
					CRDatos [7]=String.valueOf(ConRes.getCalculoCesantia());
					CRDatos [8]=String.valueOf(ConRes.getCalculoPreaviso());
					CRDatos [9]="hola";//Main.EnUso.getCedula();
					ConResModel.addRow(CRDatos);
			}else {
				String SRDatos []=new String [10];
				SinResponsabilidad SinRes=(SinResponsabilidad) Main.Mis_Empleado.get(i);
				SRDatos [0]=SinRes.getNombre();
				SRDatos [1]=SinRes.getApellido();
				SRDatos [2]=SinRes.getCedula();
				SRDatos [3]=String.valueOf(SinRes.getFechaIngreso());
				SRDatos [4]=String.valueOf(SinRes.getFechaSalida());
				SRDatos [5]=String.valueOf(SinRes.getCalculoAguinaldo());
				SRDatos [6]=String.valueOf(SinRes.getVacaciones());
				SRDatos [7]=SinRes.getMotivo();
				SRDatos [8]="hola";//Main.EnUso.getCedula();
				SinResModel.addRow(SRDatos);
			}
			
		}
		
		
		
	}
	
	
	
	
	//Switch Options
		public void switcher(CustomButton panel) {
			
				SinResButton.setFocus(false);
				
				ConResButton.setFocus(false);	
				PanelChanger(panel.getRelatedPanel());
			
		}
		//Panel Changer
		public void PanelChanger(int number) {
			ConRespanel.setVisible(false);
			SinRespanel.setVisible(false);
			
			
			
			switch(number) {
				case 1:{
					ConResButton.setFocus(true);	
					ConRespanel.setVisible(true);
				}break;
				
				case 2:{

					SinResButton.setFocus(true);
					SinRespanel.setVisible(true);
				}break;
				
			}
		}
}
