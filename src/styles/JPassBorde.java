package styles;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPasswordField;

public class JPassBorde extends JPasswordField {
	
	private Shape shape;
	private Font Focus=new Font("Arial",Font.PLAIN,21);
	private Font DeFocus=new Font("Arial",Font.ITALIC,18);
	private final String holder;
	
	
	public JPassBorde(final String holder) {
		
		//SUPER
		super(holder);
		this.holder=holder;
		
		
		//CHARA
		setForeground(Color.GRAY);
		setFont(DeFocus);
		setCaretColor(Color.WHITE);
		setBackground(new Color(40,40,40));
		setOpaque(false);
		
		
		//FOCUS
		addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				setFont(Focus);
				
				if(new String(getPassword()).equalsIgnoreCase(holder)) {
					setForeground(Color.WHITE);
					setText("");
				}
			}
			
			@Override
			public void focusLost(FocusEvent arg0) {
				if((getText().isEmpty()) || (new String(getText()).equalsIgnoreCase(holder))) {
					setFont(DeFocus);
					setForeground(Color.GRAY);
					setText(holder);
				}
			}
		});
	
	}
	
	//Is holder
	public boolean IsHolder() {
		return (String.valueOf(getPassword()).equalsIgnoreCase(holder))?true:false;
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

	protected void paintComponent(Graphics g) {
	   g.setColor(getBackground());
	   g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	   super.paintComponent(g);
	}
	protected void paintBorder(Graphics g) {
	   g.setColor(Color.GRAY);
	   g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	}
	public boolean contains(int x, int y) {
	   if (shape == null || !shape.getBounds().equals(getBounds())) {
	      shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
	   }
	   return shape.contains(x, y);
	   }
	
	
}