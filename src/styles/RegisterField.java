package styles;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JTextField;

//JTextField Rounded Corners
public class RegisterField extends JTextField {
	
	
	//Atributos
	private Shape shape;
	private Font Focus=new Font("Arial",Font.PLAIN,18);
	private Font DeFocus=new Font("Arial",Font.ITALIC,18);
	private final String holder;
	
	//Constructor del JTextField Rounded Corners
	public RegisterField(final String holder) {
		//Super
		super(holder);
		this.holder=holder;
		
		//Chara
		setForeground(Color.GRAY);
		setFont(DeFocus);
		setCaretColor(Color.WHITE);
		setBackground(new Color(40,40,40));
		setOpaque(false);
	
		//FOCUS
		addFocusListener(new FocusAdapter() {
			//Focus Gain
			@Override
			public void focusGained(FocusEvent arg0) {
				setFont(Focus);
				
				if(getText().equalsIgnoreCase(holder)) {
					setForeground(Color.WHITE);
					setText("");
				}
			}
			
			//Focus lost
			@Override
			public void focusLost(FocusEvent arg0) {
				if((getText().isEmpty()) || (getText().equalsIgnoreCase(holder))) {
					setFont(DeFocus);
					setForeground(Color.GRAY);
					setText(holder);
				}
			}
		});
		
		
		
	}

	//Is Default Value
	public boolean isHolder() {
		return (this.getText().equalsIgnoreCase(holder))?true:false;
	}

	
	//Set holder
	public void setHolder(boolean type) {
		if(type) {
			setFont(DeFocus);
			setForeground(Color.GRAY);
			setText(holder);
		}else {
			setForeground(Color.WHITE);
			setText("");
		}
	}
	
	
	//Painted
	protected void paintComponent(Graphics g) {
	   g.setColor(getBackground());
	   g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	   super.paintComponent(g);
	}
	
	//Painted Border
	protected void paintBorder(Graphics g) {
	   g.setColor(Color.GRAY);
	   g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	}
	
	//Rounded corner
	public boolean contains(int x, int y) {
	   if (shape == null || !shape.getBounds().equals(getBounds())) {
	      shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	   }
	   return shape.contains(x, y);
	}
			
}