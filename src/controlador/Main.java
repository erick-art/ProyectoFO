package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Clase Main, interfaz principal
public class Main extends JFrame{
	
	
	//Dim
	private final int X=1100,Y=650;
	private JPanel mainPanel;
	
	//Pestans
	private Color Focus=new Color(37,37,37);
	private Color UnFocus=new Color(45,45,45);
	private Color Hover=new Color(43,43,43);
	
	//Buttons
	private JPanel calcButton;
	private JPanel insButton;
	private JPanel mostButton;
	private JPanel modifyButton;
	private JPanel calculos;
	private JPanel modificar;
	private JPanel ingresar;
	private JPanel mostrar;
	
	//Constructor Main
	public Main() {
		
		mainPanel=new JPanel();
		mainPanel.setSize(new Dimension(0, 15));
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(50,50,50));
		
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
		
		calcButton = new JPanel();
		calcButton.setBounds(26, 68, 160, 37);
		calcButton.setBorder(BorderFactory.createMatteBorder(1,1,0,1,Color.black));
		calcButton.setBackground(Focus);
		mainPanel.add(calcButton);
		
		insButton = new JPanel();
		insButton.setBounds(184, 68, 160, 37);
		insButton.setBorder(BorderFactory.createMatteBorder(1,1,0,1,Color.black));
		insButton.setBackground(UnFocus);
		mainPanel.add(insButton);
		
		mostButton = new JPanel();
		mostButton.setBounds(343, 68, 160, 37);
		mostButton.setBorder(BorderFactory.createMatteBorder(1,1,0,1,Color.black));
		mostButton.setBackground(UnFocus);
		mainPanel.add(mostButton);
		
		modifyButton = new JPanel();
		modifyButton.setBounds(503, 68, 160, 37);
		modifyButton.setBorder(BorderFactory.createMatteBorder(1,0,0,1,Color.black));
		modifyButton.setBackground(UnFocus);
		mainPanel.add(modifyButton);
		
		
									//PANELES
		
		calculos = new JPanel();
		calculos.setBounds(26, 105, 1047, 516);
		calculos.setBorder(new LineBorder(Color.BLACK,1));
		calculos.setBackground(Focus);
		mainPanel.add(calculos);
		
		ingresar = new JPanel();
		ingresar.setBounds(26, 105, 1047, 516);
		ingresar.setBorder(new LineBorder(Color.BLACK,1));
		ingresar.setBackground(Focus);
		mainPanel.add(ingresar);
		
		mostrar = new JPanel();
		mostrar.setBounds(26, 105, 1047, 516);
		mostrar.setBorder(new LineBorder(Color.BLACK,1));
		mostrar.setBackground(Focus);
		mainPanel.add(mostrar);
		
		modificar = new JPanel();
		modificar.setBounds(26, 105, 1047, 516);
		modificar.setBackground(Focus);
		mainPanel.add(modificar);
		
		
		
		
							//EVENTOS
		
		insButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(insButton.getBackground()!=Focus) {
					insButton.setBackground(Hover);
				}
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				if(insButton.getBackground()!=Focus) {
					insButton.setBackground(UnFocus);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switcher(insButton);
			}
		});
		
		
		mostButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(mostButton.getBackground()!=Focus) {
					mostButton.setBackground(Hover);
				}
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				if(mostButton.getBackground()!=Focus) {
					mostButton.setBackground(UnFocus);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switcher(mostButton);
			}
		});
		
		
		modifyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(modifyButton.getBackground()!=Focus) {
					modifyButton.setBackground(Hover);
				}
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				if(modifyButton.getBackground()!=Focus) {
					modifyButton.setBackground(UnFocus);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switcher(modifyButton);
			}
		});
		
		calcButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(calcButton.getBackground()!=Focus) {
					calcButton.setBackground(Hover);
				}
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				if(calcButton.getBackground()!=Focus) {
					calcButton.setBackground(UnFocus);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				switcher(calcButton);
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

	
	
	
	//
	public void switcher(JPanel panel) {
		
		insButton.setBackground(UnFocus);
		mostButton.setBackground(UnFocus);
		calcButton.setBackground(UnFocus);
		modifyButton.setBackground(UnFocus);
		
		panel.setBackground(Focus);
	}
	
	
	
	
	//
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
	
	
	

	
}
