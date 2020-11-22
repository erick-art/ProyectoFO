package controlador;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//Clase tabla meses
public class TablaMeses extends JTable{

	//Tabla
	private DefaultTableModel modeloTabla;
	private Font Focus=new Font("Arial",Font.PLAIN,15);
	private String meses[]= {"Diciembre (Año anterior)","Enero","Febrero","Marzo","Abril","Mayo","Junio",
			"Julio","Agosto","Setiembre","Octubre","Noviembre"};
	
	//Constructor TablaMeses
	public TablaMeses() {
	
		//Características del modelo de Tabla de procesos
		modeloTabla=new DefaultTableModel(
			
			new Object[][] {
			},
			
			
			new String[] {
				"Mes","Salario","Pagado"
			}
		);
		
		this.setFont(Focus);
		this.setForeground(Color.WHITE);
		this.setBackground(new Color(43,43,43));
		this.setGridColor(Color.BLACK);
		this.setModel(modeloTabla);//Establecer el modelo de la tabla
		this.getTableHeader().setBackground(new Color(46,46,46));
		this.getTableHeader().setBorder(new LineBorder(Color.BLACK,1));
		this.getTableHeader().setFont(Focus);
		this.getTableHeader().setForeground(Color.WHITE);
		this.getColumnModel().getColumn(2).setMaxWidth(60);
		this.getColumnModel().getColumn(2).setMinWidth(60);
		this.getColumnModel().getColumn(1).setMaxWidth(120);
		this.getColumnModel().getColumn(1).setMinWidth(120);
		
		filler();
		
	}
	
	//ResetAll
	public void resetAll() {
		for(int cont=0;cont<meses.length;cont++) {
			try {
				modeloTabla.setValueAt((String) "", cont, 1);
				modeloTabla.setValueAt((boolean) true, cont, 2);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	
	//Obtener salarios
	public double[] obtenerSalarios() {
		
		double salarios[]= {0,0,0,0,0,0,0,0,0,0,0,0};
		
		for(int cont=0;cont<salarios.length;cont++) {
			try {
				if((boolean)modeloTabla.getValueAt(cont, 2)) {
					try {
						salarios[cont]=Double.parseDouble(modeloTabla.getValueAt(cont, 1).toString());
					} catch (Exception e) {
						//Excepcion vacia
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		return salarios;
	}
	
	
	
	
	//Verificar la tabla
	public boolean dataVerifyer() {
		boolean bool=false;
		
		try {
		
			for(int cont=0;cont<meses.length;cont++) {
				if(((boolean)modeloTabla.getValueAt(cont, 2)) && (!bool)) {
					try {
						double curren=Double.parseDouble(modeloTabla.getValueAt(cont, 1).toString());
					} catch (Exception e) {
						bool=true;
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return bool;
	}
	
	
	
	
	
	@Override
    public boolean isCellEditable(int row, int column) {                
		if(column==0) {
			return false;
		}else {
			return true;
		}               
    };
	
    
    
    @Override
    public Class getColumnClass(int columnIndex) {
       if(columnIndex==2) {
    	   return Boolean.class;
       }else {
    	   return String.class;
       }
    }
    
	
	//
	public void filler() {
		modeloTabla.setRowCount(0);
		for(int cont=0;cont<meses.length;cont++) {
			modeloTabla.addRow(new Object[] {meses[cont],"",true});
		}
	}
}
