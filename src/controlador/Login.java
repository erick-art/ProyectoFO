package controlador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;

//
public class Login extends JFrame{

	
	private JPanel slider;
	
	//Dimensiones
	private final int X=600,Y=450;
	private final int IY=0;
	
	//
	private JPanel mainPanel;
	private Color logBack=new Color(44,44,44);
	private Color barraLog=new Color(36,36,36);
	
	
	//
	public Login() {
		
	
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 31, 600, 1);
		barraPer.add(panel);
		
		slider = new JPanel();
		slider.setLayout(null);
		slider.setBounds(0, 43, 1200, 396);
		slider.setBackground(null);
		mainPanel.add(slider);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(242,43,1));
		separator.setForeground(separator.getBackground());
		separator.setBounds(20, 91, 575, 11);
		slider.add(separator);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(218, 56, 174, 34);
		slider.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(242,43,1));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(170, 289, 253, 45);
		 
		slider.add(btnNewButton);
		
		JLabel regLabel = new JLabel("Registrarse");
		regLabel.setToolTipText("\u00BFDesea registrarse?");
		regLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		regLabel.setForeground(Color.WHITE);
		regLabel.setBounds(253, 366, 78, 19);
		slider.add(regLabel);
		
		JLabel lblO = new JLabel("o");
		lblO.setForeground(Color.WHITE);
		lblO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblO.setBounds(280, 345, 20, 19);
		slider.add(lblO);
		
		JLabel lblregistrarUsuario = new JLabel(">Registrar Usuario");
		lblregistrarUsuario.setForeground(Color.WHITE);
		lblregistrarUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblregistrarUsuario.setBounds(611, 11, 214, 34);
		slider.add(lblregistrarUsuario);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setForeground(Color.WHITE);
		lblRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblRegresar.setBounds(1112, 356, 78, 29);
		slider.add(lblRegresar);
				
		
		
		//Event
		
			//
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
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(220,37,0));
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(242,43,1));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton.setBackground(new Color(195,32,0));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				if(btnNewButton.getBackground()!=new Color(242,43,1)) {
					
					btnNewButton.setBackground(new Color(220,37,0));
				}
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
			
		});
		
		
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
		
		
		
		
		this.addComponentListener(new ComponentAdapter() {
            @Override
             public void componentResized(ComponentEvent e) {    	 
                 setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
             }
         });
	
		
		
		
		//set the visible
		this.setVisible(true);
		amplier();
	}
	
	
	public void amplier() {
		
		
		javax.swing.Timer t=new javax.swing.Timer(10, new ActionListener() {
			
			public void actionPerformed(ActionEvent ar) {

				setSize(X,(getHeight()+50));
				setLocationRelativeTo(null);
			
			
				if(getHeight()==Y) {
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
					}
				}
				
			});
			
			t.start();
			
		}
		
	}
	
	
}
