package controlador;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import styles.CustomButton;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


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
		
		DefaultTableModel SinResModel= new DefaultTableModel();
		
		SinResModel.addColumn("Nombre");
		SinResModel.addColumn("Apellido");
		SinResModel.addColumn("Cédula");
		SinResModel.addColumn("Fecha de ingreso");
		SinResModel.addColumn("Fecha de salida");
		SinResModel.addColumn("Agunaldo");
		SinResModel.addColumn("Vacaciones");
		SinResModel.addColumn("Motivo");
		SinResModel.addColumn("ultimo que lo modificacion");
	String datos[]= {"jose","4","1","2","5","8","8","8","9"};
		SinResModel.addRow(datos);
		String datos2[]= {"2","2","1","2","5","8","8","8","9"};
		SinResModel.addRow(datos2);
		
		DefaultTableModel ConResModel= new DefaultTableModel();
		
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
		//PANELES
		

		//Botones Pestanas
		
				ConResButton = new CustomButton(1,"Con responsabilidad","/recursos/ConRes.png");
				ConResButton.setBounds(26, 68, 160, 37);
				add(ConResButton);
				
				SinResButton = new CustomButton(2,"Sin responsabilidad","/recursos/SinRes.png");
				SinResButton.setBounds(184, 68, 160, 37);
				add(SinResButton);
				
				
				//PANELES
				
				 ConRespanel = new JPanel();
				ConRespanel.setBounds(26, 105, 1011, 400);
				ConRespanel.setBorder(new LineBorder(Color.BLACK,1));
				ConRespanel.setBackground(Focus);
				add(ConRespanel);
				ConRespanel.setLayout(null);
				
				ConResscrollPane = new JScrollPane();
				ConResscrollPane.setBounds(10, 11, 991, 378);
				ConRespanel.add(ConResscrollPane);
				
				ConRestable = new JTable(ConResModel);
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
				ConResscrollPane.setViewportView(ConRestable);
				SinRespanel = new JPanel();
				SinRespanel.setBounds(26, 105, 1011, 400);
				SinRespanel.setBorder(new LineBorder(Color.BLACK,1));
				SinRespanel.setVisible(false);
				SinRespanel.setBackground(Focus);
				add(SinRespanel);
				SinRespanel.setLayout(null);
				
				SinResscrollPane = new JScrollPane();
				SinResscrollPane.setBounds(10, 11, 991, 378);
				SinRespanel.add(SinResscrollPane);
				
				SinRestable = new JTable(SinResModel);
				
				SinResscrollPane.setViewportView(SinRestable);;
				
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
				
				SinRestable.addMouseListener(new MouseAdapter() {
					  public void mouseClicked(MouseEvent e) {
						  
						  System.out.println("sin modificar"+SinRestable.getValueAt(SinRestable.getSelectedRow(),0 ).toString());
					    if (e.getClickCount() == 1) {
					      
					      System.out.println("modificando"+SinRestable.getValueAt(SinRestable.getSelectedRow(),SinRestable.getSelectedColumn() ).toString());
					      
					     
					      // do some action if appropriate column
					    }
					    System.out.println("modificado"+SinRestable.getValueAt(SinRestable.getSelectedRow(),0 ).toString());
					  }
					});
				ConRestable.addMouseListener(new MouseAdapter() {
					  public void mouseClicked(MouseEvent e) {
						  
						  System.out.println("sin modificar"+ConRestable.getValueAt(ConRestable.getSelectedRow(),0 ).toString());
					    if (e.getClickCount() == 1) {
					      
					      System.out.println("modificando"+ConRestable.getValueAt(ConRestable.getSelectedRow(),ConRestable.getSelectedColumn() ).toString());
					      
					     
					      // do some action if appropriate column
					    }
					    System.out.println("modificado"+ConRestable.getValueAt(ConRestable.getSelectedRow(),0 ).toString());
					  }
					});
				

				//EVENTOS BOTONES JPANEL
				ConResButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						switcher(ConResButton);
					}
				});
				
				SinResButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						switcher(SinResButton);
					}
				});
				
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
