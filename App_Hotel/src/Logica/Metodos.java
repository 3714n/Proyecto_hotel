package Logica;
import java.awt.BorderLayout;
import java.awt.Container;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.toedter.calendar.DateUtil;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import Com.Proyecto_Hotel.Registro_Clientes.Datos_Habitacion;
import Grafica.HabitacioPanel;



public class Metodos {  
			
	public static void Casillavacia(String v,JTextField b) {
		if(v.isEmpty()) {
			b.setText("Ingresar dato");
		}else {	b.setText("");	
		}
	}	
	public static void SeleccionCasilla(String v,JTextField b) {
		if(v.equalsIgnoreCase("Seleccione")) {
			b.setText("Seleccione Dato");
		}else {	 b.setText("");	
		}
	}
	public static void IngreseFecha(Date v,JTextField b) {
		if(v == null) {
			b.setText("Seleccione Dato");
		}else {	b.setText("");	 
		}
	}
	public static void online(int i, int i2, JTextField i3) {
		if (i != 0 && i2 != 0) {
			i3.setText(String.valueOf(i-i2));
		}
	}
	public static void Reflejar(JTextField a1, JTextField a2) {
	    DocumentListener listener = new DocumentListener() {
	        @Override
	        public void insertUpdate(DocumentEvent e) {
	            copyValue();
	        }

	        @Override
	        public void removeUpdate(DocumentEvent e) {
	            copyValue();
	        }

	        @Override
	        public void changedUpdate(DocumentEvent e) {
	            copyValue();
	        }

	        private void copyValue() {
	            try {
	                if (a1 != null && !a1.getText().isEmpty()) {
	                    int value1 = Integer.parseInt(a1.getText());
	                    a2.setText(String.valueOf(value1));
	                } 
	                
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "El valor en pagos no es un número válido");
	            }
	        }
	    };

	    // Agregar el DocumentListener
	    a1.getDocument().addDocumentListener(listener);
	}
	public static void Reflejar1 (JTextField a1,JTextField a2,JTextField a3) {
		
		
		
	       
	        class SumDocumentListener implements DocumentListener {
	            private JTextField a1;
	            private JTextField a2;
	            private JTextField a3;
	            
	            public SumDocumentListener(JTextField value1Field, JTextField value2Field, JTextField resultField) {
	                this.a1 = value1Field;
	                this.a2 = value2Field;
	                this.a3 = resultField;
	            }

			@Override
			public void insertUpdate(DocumentEvent e) {
				updateResult();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				updateResult();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				updateResult();
				
			}
			private void updateResult() {
		        try {
		            int value1 = Integer.parseInt(a1.getText());
		            int value2 = Integer.parseInt(a2.getText());
		            int sum = value1 - value2;
		            a3.setText(String.valueOf(sum));
		        } catch (NumberFormatException ex) {
		            // Manejar errores si los valores no son números válidos
		            
		        }
		    }
	        }
	        a1.getDocument().addDocumentListener(new SumDocumentListener(a1, a2, a3));
	        a2.getDocument().addDocumentListener(new SumDocumentListener(a1, a2, a3));         
	}
	public static void Reflejar2 (JTextField a1,JTextField a2,JTextField a3,JTextField a4) {
		
		
		
	       
        class SumDocumentListener implements DocumentListener {
            private JTextField a1;
            private JTextField a2;
            private JTextField a3;
            private JTextField a4;
            
            public SumDocumentListener(JTextField value1Field, JTextField value2Field, JTextField value3Field,JTextField resultField) {
                this.a1 = value1Field;
                this.a2 = value2Field;
                this.a3 = value3Field;
                this.a4 = resultField;
            }

		@Override
		public void insertUpdate(DocumentEvent e) {
			updateResult();
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			updateResult();
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			updateResult();
			
		}
		private void updateResult() {
	        try {
	            int value1 = Integer.parseInt(a1.getText());
	            int value2 = Integer.parseInt(a2.getText());
	            int value3 = Integer.parseInt(a3.getText());
	            int sum = value1 * value2 * value3;
	            
	            a4.setText(String.valueOf(sum));
	        } catch (NumberFormatException ex) {
	            // Manejar errores si los valores no son números válidos
	            
	        }
	    }
        }
        a1.getDocument().addDocumentListener(new SumDocumentListener(a1, a2, a3, a4));
        a2.getDocument().addDocumentListener(new SumDocumentListener(a1, a2, a3, a4));
        a3.getDocument().addDocumentListener(new SumDocumentListener(a1, a2, a3, a4));
}
	public static String Formato_miles (int q) {
		DecimalFormat formatear = new DecimalFormat("###,###");
		
		return formatear.format(q);
		
	}
	public static void limpiarFecha (JDateChooser as) {
		as.setDate(null);		
	}
	public static void limpiarString (JTextField t) {
		 t.setText("");	
	}
	public static void limpiarCbx (JComboBox c) {
		 c.setSelectedIndex(0);	
	}
	public static void limpiarRBoton (JRadioButton r) {
		 r.setSelected(false);	
	}
	public static void mostrarHabitaciones(JPanel p, Container c) {
		p.setSize(454, 578);
		p.setLocation(0,0);
		
		c.removeAll();
		c.setLayout(null);
		c.add(p, BorderLayout.CENTER);
		c.revalidate();
		c.repaint();
	
	}
	

}		
