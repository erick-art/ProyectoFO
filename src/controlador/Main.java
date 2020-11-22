package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import modelo.Empleado;
import modelo.Usuario;
import styles.CustomButton;
import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.Component;
import java.awt.Cursor;
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
	private CustomButton insButton;
	private CustomButton mostButton;
	
	//Paneles
	private Ingresar ingresar;
	private Mostrar mostrar;
	private JLabel iconBanner;
	private JLabel title;
	private JLabel lblNewLabel;
	
	//Iconos
	private ImageIcon FoIco=null;
	private ImageIcon UnFoIco=null;
	//variable static
	static Usuario EnUso;
	//ArrayList 
	static ArrayList <Usuario> Mis_Usuario = new ArrayList <Usuario>();
	static ArrayList <Empleado> Mis_Empleado = new ArrayList <Empleado>();
	//Constructor Main
	public Main() {
		
		//Main
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
		
		//Añadiendo el icono
		//Control de excepciones
		try {
			Image iconoPropio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/recursos/showIco.png"));
			this.setIconImage(iconoPropio);
		}catch(Exception e) {
				//Exepcion vacia
		}
		
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
		
		iconBanner = new JLabel("");
		iconBanner.setBounds(3, 3, 46, 50);
		imageResizer(iconBanner,"/recursos/logo.png");
		barra.add(iconBanner);
		
		title = new JLabel("Calculadora de Liquidaci\u00F3n Laboral");
		title.setForeground(Color.BLACK);
		title.setFont(new Font("Tahoma", Font.PLAIN, 24));
		title.setBounds(66, 3, 563, 43);
		barra.add(title);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(1055, 11, 35, 35);
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		barra.add(lblNewLabel);
		CargarIcono(0,"/recursos/exFo.png");
		CargarIcono(1,"/recursos/exUnFo.png");
		ExitSwitcher(1,lblNewLabel);
		
						//Botones Pestanas
		
		insButton = new CustomButton(1,"Ingresar","/recursos/insicon.png",70);
		insButton.setBounds(26, 68, 160, 37);
		insButton.setFocus(true);
		mainPanel.add(insButton);
		
		mostButton = new CustomButton(2,"Mostrar","/recursos/histoicon.png",70);
		mostButton.setBounds(184, 68, 160, 37);
		mainPanel.add(mostButton);
		
		
									//PANELES
		
		ingresar = new Ingresar();
		mainPanel.add(ingresar);
		
		mostrar = new Mostrar();
		mostrar.setBounds(26, 105, 1047, 516);
		mostrar.setBorder(new LineBorder(Color.BLACK,1));
		mostrar.setBackground(Focus);
		mostrar.setVisible(false);
		mainPanel.add(mostrar);
		
		
		
							//EVENTOS BOTONES JPANEL
		
		
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
		
		//EVENTOS EXIT
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				ExitSwitcher(0,lblNewLabel);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				ExitSwitcher(1,lblNewLabel);
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
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
			PanelChanger(panel.getRelatedPanel());
		
	}
	
	//Panel Changer
	public void PanelChanger(int number) {
		ingresar.setVisible(false);
		mostrar.setVisible(false);
		
		
		switch(number) {
			
			case 1:{

				insButton.setFocus(true);
				ingresar.setVisible(true);
			}break;
			
			case 2:{
				mostButton.setFocus(true);
				mostrar.setVisible(true);
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
	
	
	
	//Exit
	public void ExitSwitcher(int num,JLabel la) {
		if((num==0) && (FoIco!=null)) {
			la.setIcon(FoIco);
		}else if(UnFoIco!=null){
			la.setIcon(UnFoIco);
		}
		la.repaint();
	}
	
	
	
	//Cargador de imagenes
	public void CargarIcono(int i,String dir) {
		try {
						
			URL imagenBuffer= Main.class.getResource(dir);
						
			BufferedImage ima=ImageIO.read(imagenBuffer.openStream());
						
			Image imagenRedimensionada = ima.getScaledInstance(35,35, Image.SCALE_SMOOTH);
			
			if(i==0) {
				FoIco=new ImageIcon(imagenRedimensionada);
			}else {
				UnFoIco=new ImageIcon(imagenRedimensionada);
				
			}
		}catch(Exception e) {
			
		}
	}
	
	
	
	//Cargador de imagenes
	public static void imageResizer(JLabel componente,String dir) {
		try {
					
			URL imagenBuffer= Main.class.getResource(dir);
					
			BufferedImage ima=ImageIO.read(imagenBuffer.openStream());
					
			Image imagenRedimensionada = ima.getScaledInstance(componente.getWidth(),componente.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon icono=new ImageIcon(imagenRedimensionada);
					
			componente.setIcon(icono);
					
		}catch(Exception e) {
			componente.setText("");
		}
	}
}
