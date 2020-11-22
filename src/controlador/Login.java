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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;


import modelo.Usuario;
import styles.JPassBorde;
import styles.TextFieldBorde;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

//
public class Login extends JFrame{

	
	private JPanel slider;
	
	//Dimensiones
	private final int X=600,Y=450;
	private final int IY=450;
	
	//Componentes GUI
	private JPanel mainPanel;
	private Color logBack=new Color(44,44,44);
	private Color barraLog=new Color(36,36,36);
	private JTextField username;
	private JPasswordField userpass;
	private JTextField regCedula;
	private JTextField regNombre;
	private JTextField regApellido;
	private JTextField regContro;
	private JTextField verContra;
	
	
	
	//Constructor Login
	public Login() {
		Usuario mipana = new Usuario();
		mipana.setAPELLIDO("davila");
		mipana.setCedula("123456789");
		mipana.setNOMBRE("pablo");
		mipana.setPASSWORD("050100");
		Mis_Panitas.add(mipana);
		//Main Panel
		mainPanel=new JPanel();
		mainPanel.setBorder(null);
		mainPanel.setBackground(logBack);
		mainPanel.setLayout(null);
		mainPanel.setVisible(true);
		
		//General structure
		this.setUndecorated(true);
		this.setSize(X,IY);
		this.setContentPane(mainPanel);
		this.setTitle("Aplicacion - Iniciar Sesion");	
		this.setResizable(false);
		this.setBackground(logBack);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setOpacity(1.0f);
		

		//GUI Components
		JPanel barraPer = new MotionPanel(this);
		barraPer.setBorder(null);
		barraPer.setLayout(null);
		barraPer.setBackground(barraLog);
		barraPer.setBounds(0, 0, 600, 32);
		mainPanel.add(barraPer);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setToolTipText("Cerrar ventana");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(580, 2, 20, 25);
		barraPer.add(lblNewLabel_1);
		
		JLabel lblV = new JLabel("V");
		lblV.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblV.setToolTipText("Minimizar ventana");
		lblV.setForeground(Color.WHITE);
		lblV.setFont(new Font("Arial", Font.PLAIN, 18));
		lblV.setBounds(550, 2, 20, 25);
		barraPer.add(lblV);
		
		//SLIDER
		slider = new JPanel();
		slider.setLayout(null);
		slider.setBounds(0, 43, 1200, 396);
		slider.setBackground(null);
		mainPanel.add(slider);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(242,43,1));
		separator.setForeground(separator.getBackground());
		separator.setBounds(21, 108, 575, 11);
		slider.add(separator);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(219, 78, 174, 29);
		slider.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(242,43,1));
		btnNewButton.setBorder(new LineBorder(Color.BLACK,2));
		btnNewButton.setBounds(171, 317, 236, 34); 
		slider.add(btnNewButton);
		
		
		JLabel regLabel = new JLabel("Registrarse");
		regLabel.setToolTipText("\u00BFDesea registrarse?");
		regLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		regLabel.setForeground(Color.WHITE);
		regLabel.setBounds(252, 377, 78, 19);
		regLabel.requestFocus();
		slider.add(regLabel);
		
		JLabel lblO = new JLabel("o");
		lblO.setForeground(Color.WHITE);
		lblO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblO.setBounds(279, 356, 20, 19);
		slider.add(lblO);
		
		JLabel lblregistrarUsuario = new JLabel(">Registrar Usuario");
		lblregistrarUsuario.setForeground(Color.WHITE);
		lblregistrarUsuario.setFont(new Font("Arial", Font.PLAIN, 21));
		lblregistrarUsuario.setBounds(611, 11, 214, 34);
		slider.add(lblregistrarUsuario);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setForeground(Color.WHITE);
		lblRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblRegresar.setBounds(1112, 356, 78, 29);
		slider.add(lblRegresar);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(252, 7, 66, 71);
		imageResizer(lblNewLabel_2,"/recursos/userLogin.png",66,60);
		slider.add(lblNewLabel_2);
		
		//Nombre de usuario
		username = new TextFieldBorde("Cedula");
		username.setBounds(171, 158, 236, 29);
		slider.add(username);
		username.setColumns(10);
		
		//Contrasena
		userpass = new JPassBorde("Password");
		userpass.setBounds(171, 220, 236, 29);
		slider.add(userpass);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(117, 220, 29, 29);
		imageResizer(lblNewLabel_3,"/recursos/passS.png",29,29);
		slider.add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		label.setBounds(117, 158, 42, 29);
		imageResizer(label,"/recursos/crede.png",42,29);
		slider.add(label);
		
		regCedula = new TextFieldBorde("Minimo 9 digitos");
		regCedula.setBounds(776, 78, 198, 32);
		slider.add(regCedula);
		regCedula.setColumns(10);
		
		regNombre = new TextFieldBorde("Ingrese su nombre");
		regNombre.setColumns(10);
		regNombre.setBounds(776, 126, 198, 32);
		slider.add(regNombre);
		
		regApellido = new TextFieldBorde("Ingrese su apellido");
		regApellido.setColumns(10);
		regApellido.setBounds(776, 173, 198, 32);
		slider.add(regApellido);
		
		regContro = new TextFieldBorde("Ingrese una contraseña");
		regContro.setColumns(10);
		regContro.setBounds(776, 217, 198, 32);
		slider.add(regContro);
		
		verContra =new TextFieldBorde("Repita la contraseña");
		verContra.setColumns(10);
		verContra.setBounds(776, 260, 198, 32);
		slider.add(verContra);
		
		JLabel regIcon = new JLabel("");
		imageResizer(regIcon,"/recursos/regC.png",112,133);
		regIcon.setBounds(1009, 135, 112, 133);
		slider.add(regIcon);
		
		JLabel labelh = new JLabel("Cedula");
		labelh.setForeground(new Color(204, 204, 204));
		labelh.setFont(new Font("Arial", Font.PLAIN, 18));
		labelh.setBounds(621, 83, 108, 25);
		slider.add(labelh);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(204, 204, 204));
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNombre.setBounds(621, 130, 108, 25);
		slider.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setForeground(new Color(204, 204, 204));
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 18));
		lblApellido.setBounds(621, 177, 108, 25);
		slider.add(lblApellido);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setForeground(new Color(204, 204, 204));
		lblContrasea.setFont(new Font("Arial", Font.PLAIN, 18));
		lblContrasea.setBounds(621, 222, 108, 25);
		slider.add(lblContrasea);
		
		JLabel lblRContrasea = new JLabel("R. Contraseña");
		lblRContrasea.setForeground(new Color(204, 204, 204));
		lblRContrasea.setFont(new Font("Arial", Font.PLAIN, 18));
		lblRContrasea.setBounds(621, 269, 131, 25);
		slider.add(lblRContrasea);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnRegistrarse.setFocusPainted(false);
		btnRegistrarse.setBorder(new LineBorder(Color.BLACK,2));
		btnRegistrarse.setBackground(new Color(32,116,172));
		btnRegistrarse.setBounds(747, 326, 236, 34);
		slider.add(btnRegistrarse);
		
		
		
								//EVENTOS
		
		
		
		//Eventos de 'X'
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_1.setForeground(new Color(237,7,7));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblNewLabel_1.setForeground(Color.white);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblNewLabel_1.setForeground(new Color(153,5,5));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if(lblNewLabel_1.getForeground()!=Color.white) {
					lblNewLabel_1.setForeground(new Color(237,7,7));
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		
		//Eventos de 'V'
		lblV.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblV.setForeground(new Color(19,102,238));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblV.setForeground(Color.white);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblV.setForeground(new Color(27,81,169));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if(lblV.getForeground()!=Color.white) {
					lblV.setForeground(new Color(19,102,238));
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
			
			
		});
		
		
		//Eventos de 'ENTRAR'
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(215,30,0));
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(242,43,1));
			}
			
			
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Boolean Encotrado=false;
				if(username.getText()=="Cedula"&&String.valueOf(userpass.getPassword())=="Password") {
					String Contarseña =(String.valueOf(userpass.getPassword()));
				
				
					for (int i = 0; i <Main. Mis_Usuario.size(); i++) {
					
						if (Main.Mis_Usuario.get(i).getPASSWORD().equals(Contarseña) && Main.Mis_Usuario.get(i).getCedula().equals(username.getText())) {
						Encotrado=true;
						System.out.println("si entro papi");	
						Main.EnUso=Main.Mis_Usuario.get(i);
						}
					
					}
						if(Encotrado==false){
							JOptionPane.showMessageDialog(null,"El usuario o la contraseña se incorrecta");
					
						}
				}else {
					JOptionPane.showMessageDialog(null,"Ingrese contraseña o cedula");
				}
				}
		});
		
		//Eventos de 'Registrar'
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRegistrarse.setBackground(new Color(32,116,172));
				
			}
					
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRegistrarse.setBackground(new Color(21,99,151));
			}
					
		});
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuario Nuevo_Pana = new Usuario();
				Boolean Encotrado=false;
				
			if(regCedula.getText()=="Minimo 9 digitos"&&regNombre.getText()=="Ingrese su nombre"&&regApellido.getText()=="Ingrese su apellido"&&regContro.getText()!="Ingrese una contraseña"&&regContro.getText()!="Repita la contraseña") {
				String Contarseña =(String.valueOf(regContro.getText()));
				for (int i = 0; i < Main.Mis_Usuario.size(); i++) {
					
					System.out.println(Contarseña+" y pass"+Main.Mis_Usuario.get(i).getPASSWORD()+" and user "+Main.Mis_Usuario.get(i).getCedula()); 
					if (Main.Mis_Usuario.get(i).getCedula().equals(regCedula.getText())) {
						Encotrado=true;
								
					}
					
				}
				if(Encotrado==false) {
					if(Contarseña.equals(String.valueOf(verContra.getText()))) {
						Nuevo_Pana.setCedula(regCedula.getText());
					
						Nuevo_Pana.setPASSWORD(Contarseña);
						Nuevo_Pana.setNOMBRE(regNombre.getText());
						Nuevo_Pana.setAPELLIDO(regApellido.getText());
						Main.Mis_Usuario.add(Nuevo_Pana);
						
						
						
					}else {
						JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
						verContra.setText("");
						regContro.setText("");
					}
				}else {
					JOptionPane.showMessageDialog(null,"El nombre de usuario "+regCedula.getText() +" no esta disponible");
					regCedula.setText("");
				}
				}else {
					JOptionPane.showMessageDialog(null,"Falta ingreseingresar informacion");
				}
			}
		});
		
		
		//Eventos de 'Registrarse'
		regLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				regLabel.setForeground(new Color(250,60,10));
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				regLabel.setForeground(Color.white);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				regLabel.setForeground(new Color(242,43,1));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				if(regLabel.getForeground()!=Color.white) {
					regLabel.setForeground(new Color(250,60,10));
				}
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				slide(true);
			}
			
		});
		
		
		//Eventos de 'Regresar'
		lblRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblRegresar.setForeground(new Color(250,60,10));
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblRegresar.setForeground(Color.white);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				lblRegresar.setForeground(new Color(242,43,1));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				if(lblRegresar.getForeground()!=Color.white) {
					lblRegresar.setForeground(new Color(250,60,10));
				}
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				slide(false);
			}
			
		});
		
								//EVENTOS DEL JFRAME
		
		
		//Rounded Corner
		this.addComponentListener(new ComponentAdapter() {
            @Override
             public void componentResized(ComponentEvent e) {    	 
                 setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
             }
         });
	
		
		
		
		
		//Set the visible
		this.setVisible(true);
		amplier();
	}
	
	
	
	
	//
	public void amplier() {
		
		
		javax.swing.Timer t=new javax.swing.Timer(10, new ActionListener() {
			
			public void actionPerformed(ActionEvent ar) {

				setSize(X,(getHeight()+50));
				setLocationRelativeTo(null);
			
			
				if(getHeight()==Y) {
					((Timer) ar.getSource()).stop();
				}else if(getHeight()>Y) {
					setSize(X,Y);
					setLocationRelativeTo(null);
					((Timer) ar.getSource()).stop();
				}
				
				
			}
			
		});
		
		t.start();
			
	}
	
	
	
	
	//
	public void slide(boolean type) {
		
		if(type) {
			
			javax.swing.Timer t=new javax.swing.Timer(10, new ActionListener() {
				
				public void actionPerformed(ActionEvent ar) {
					
					slider.setLocation(slider.getX()-30,slider.getY());
					
					if((slider.getX()+slider.getWidth())==600) {
						((Timer) ar.getSource()).stop();
						
					}else if(slider.getX()<-600) {
						slider.setLocation(-600, slider.getY());
						((Timer) ar.getSource()).stop();
					}
				}
				
			});
			
			t.start();
			
		}else {
			
			
			javax.swing.Timer t=new javax.swing.Timer(10, new ActionListener() {
				
				public void actionPerformed(ActionEvent ar) {
					
					slider.setLocation(slider.getX()+30,slider.getY());
					
					if((slider.getX()+slider.getWidth())==1200) {
						((Timer) ar.getSource()).stop();
					}else if(slider.getX()>0) {
						slider.setLocation(0,slider.getY());
						((Timer) ar.getSource()).stop();
					}
				}
				
			});
			
			t.start();
			
		}
		
	}
	

	
	
	//Cargador de imagenes
	public void imageResizer(JLabel componente,String dir,int x,int y) {
		try {
				
			URL imagenBuffer= Login.class.getResource(dir);
				
			BufferedImage ima=ImageIO.read(imagenBuffer.openStream());
				
			Image imagenRedimensionada = ima.getScaledInstance(x,y, Image.SCALE_SMOOTH);
			ImageIcon icono=new ImageIcon(imagenRedimensionada);
				
			componente.setIcon(icono);
				
		}catch(Exception e) {
			componente.setText("");
		}
	}
}