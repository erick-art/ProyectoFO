package styles;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


import controlador.Main;

//Class CustomButton
public class CustomButton extends JPanel{


	//Pestanas
	private Color Focus=new Color(37,37,37);
	private Color UnFocus=new Color(52,52,52);
	private Color Hover=new Color(43,43,43);
	private final int relatedPanel;
	
	//Constructor
	public CustomButton(final int relatedPanel,String label,String DIR,int width){
		
		this.relatedPanel=relatedPanel;
		this.setLayout(null);
		
		//Chara
		if(relatedPanel==1) {
			setBorder(BorderFactory.createMatteBorder(1,1,0,1,Color.black));
			setBackground(Focus);
		}else if(relatedPanel!=3){
			setBorder(BorderFactory.createMatteBorder(1,1,0,1,Color.black));
			setBackground(UnFocus);
		}else {
			setBorder(BorderFactory.createMatteBorder(1,1,0,1,Color.black));
			setBackground(UnFocus);
		}
		
		//Cursor
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		//Texto
		JLabel legend = new JLabel(label);
		legend.setFont(new Font("Arial", Font.PLAIN, 16));
		legend.setForeground(Color.WHITE);
		legend.setBounds(60, 3, width, 32);
		
		//Icono
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(7, 7, 23, 23);
		Main.imageResizer(lblNewLabel, DIR);
		
		add(legend);
		add(lblNewLabel);
		
		
		//Events
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(getBackground()!=Focus) {
					setBackground(Hover);
				}
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				if(getBackground()!=Focus) {
					setBackground(UnFocus);
				}
			}
			
		});
		
		
	}
	
	
	//Obtener el panel relacionado
	public int getRelatedPanel() {
		return this.relatedPanel;
	}
	
	
	//Establecer focus
	public void setFocus(boolean option) {
		if(option) {
			setBackground(Focus);
		}else {
			setBackground(UnFocus);
		}
	}
	
	
}
