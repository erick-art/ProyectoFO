package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import styles.CustomButton;
import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;

//Clase Main, interfaz principal
public class Main extends JFrame{
	
	
	//Dim
	private final int X=1100,Y=650;
	private JPanel mainPanel;
	
	//Pestanas
	private Color Focus=new Color(37,37,37);
	
	//Buttons
	private CustomButton calcButton;
	private CustomButton insButton;
	private CustomButton mostButton;
	private CustomButton modifyButton;
	//Paneles
	private Calculo calculos;
	private Modificar modificar;
	private Ingresar ingresar;
	private Mostrar mostrar;
	
	//Constructor Main
	public Main() {
		
		mainPanel=new JPanel();
		mainPanel.setSize(new Dimension(0, 15));
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(52,52,52));
		
		///Chara
		this.setSize(X,Y);
		this.setTitle("Aplicacion - Menu Principal");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setOpacity(0.0f);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(mainPanel);
		
		//Barra Personalizada
		JPanel barra = new MotionPanel(this);
		barra.setLayout(null);
		barra.setBackground(new Color(242,43,1));
		barra.setBounds(0, 0, 1100, 57);
		mainPanel.add(barra);
		
		JPanel ins = new JPanel();
		ins.setBounds(0, 49, 1100, 8);
		ins.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.BLACK));
		ins.setBackground(new Color(232,33,0));
		barra.add(ins);
		
						//Botones Pestanas
		
		calcButton = new CustomButton(1,"Calculos","/recursos/calcforpanel.png");
		calcButton.setBounds(26, 68, 160, 37);
		mainPanel.add(calcButton);
		
		insButton = new CustomButton(2,"Ingresar","/recursos/insicon.png");
		insButton.setBounds(184, 68, 160, 37);
		mainPanel.add(insButton);
		
		mostButton = new CustomButton(3,"Mostrar","/recursos/histoicon.png");
		mostButton.setBounds(343, 68, 160, 37);
		mainPanel.add(mostButton);
		
		modifyButton = new CustomButton(4,"Modificar","/recursos/modifyico.png");
		modifyButton.setBounds(503, 68, 160, 37);
		mainPanel.add(modifyButton);
		
		
									//PANELES
		
		calculos = new Calculo();
		calculos.setBounds(26, 105, 1047, 516);
		calculos.setBorder(new LineBorder(Color.BLACK,1));
		calculos.setBackground(Focus);
		mainPanel.add(calculos);
		
		ingresar = new Ingresar();
		ingresar.setVisible(false);
		mainPanel.add(ingresar);
		
		mostrar = new Mostrar();
		mostrar.setBounds(26, 105, 1047, 516);
		mostrar.setBorder(new LineBorder(Color.BLACK,1));
		mostrar.setBackground(Focus);
		mostrar.setVisible(false);
		mainPanel.add(mostrar);
		
		modificar = new Modificar();
		modificar.setBounds(26, 105, 1047, 516);
		modificar.setBorder(new LineBorder(Color.BLACK,1));
		modificar.setBackground(Focus);
		modificar.setVisible(false);
		mainPanel.add(modificar);
		
		
		
		
							//EVENTOS BOTONES JPANEL
		
		calcButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switcher(calcButton);
			}
		});
		
		insButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switcher(insButton);
			}
		});
		
		mostButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switcher(mostButton);
			}
		});
		
		modifyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				switcher(modifyButton);
			}
		});
		
		
		
		
							//EVENTOS JFRAME
		
		//Rounded Corner
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10));
			}
		});
		
		
		
		
		//JFrame V
		this.setVisible(true);
		Opacus();
	}

	
	
	
	//Switch Options
	public void switcher(CustomButton panel) {
		
			insButton.setFocus(false);
			mostButton.setFocus(false);
			modifyButton.setFocus(false);
			calcButton.setFocus(false);	
			PanelChanger(panel.getRelatedPanel());
		
	}
	
	//Panel Changer
	public void PanelChanger(int number) {
		modificar.setVisible(false);
		ingresar.setVisible(false);
		calculos.setVisible(false);
		mostrar.setVisible(false);
		
		
		switch(number) {
			case 1:{
				calcButton.setFocus(true);	
				calculos.setVisible(true);
			}break;
			
			case 2:{

				insButton.setFocus(true);
				ingresar.setVisible(true);
			}break;
			
			case 3:{
				mostButton.setFocus(true);
				mostrar.setVisible(true);
			}break;
			
			case 4:{
				modifyButton.setFocus(true);
				modificar.setVisible(true);
			}break;
		}
	}
	
	
	//Opacus Efect
	public void Opacus() {
		
		try {
			
			float numbers[]= {0.1f,0.2f,0.3f,0.4f,0.5f,0.7f,0.8f,0.9f,1.0f};
			
			javax.swing.Timer t=new javax.swing.Timer(10,new ActionListener() {
				
				int count=0;
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					setOpacity(numbers[count]);
					count+=1;
					if(count==9) {
						((Timer) e.getSource()).stop();
					}
					
				}
				
			});
			
			t.start();
			
			
		} catch (Exception e) {
			setOpacity(1.0f);
		}
		
	}
	
	
	
	//Cargador de imagenes
	public static void imageResizer(JLabel componente,String dir) {
		try {
					
			URL imagenBuffer= Login.class.getResource(dir);
					
			BufferedImage ima=ImageIO.read(imagenBuffer.openStream());
					
			Image imagenRedimensionada = ima.getScaledInstance(componente.getWidth(),componente.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon icono=new ImageIcon(imagenRedimensionada);
					
			componente.setIcon(icono);
					
		}catch(Exception e) {
			componente.setText("");
		}
	}
}
