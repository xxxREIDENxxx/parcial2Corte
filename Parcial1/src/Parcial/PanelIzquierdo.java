package Parcial;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class PanelIzquierdo extends JPanel implements ActionListener{
		
	
	private GridBagConstraints c;
	private Insets in;
	
	private JLabel Jl_nombre;
	private JLabel Jl_apellido;
	private JLabel Jl_tipo;
	private JLabel Jl_genero; 
	private JLabel Jl_cedula;
	private JLabel Jl_edad;
	private JLabel Jl_peso;
	private JLabel Jl_altura;
	private JLabel Jl_celular;
	private JLabel Jl_direccion;
	private JButton Jbt_agregar;
	private JTextField Jtf_nombre;
	private JTextField Jtf_apellido;
	private JComboBox Jtf_tipo;
	private JComboBox Jtf_genero;
	private JTextField Jtf_cedula;
	private JTextField Jtf_edad;
	private JTextField Jtf_peso;
	private JTextField Jtf_altura;
	private JTextField Jtf_celular;
	private JTextField Jtf_direccion;
	private VentanaPrincipal referenciaVentaPrincipal;
		
	public PanelIzquierdo(VentanaPrincipal _referenciaVentaPrincipal) {

		referenciaVentaPrincipal=_referenciaVentaPrincipal;
		
		setLayout(new GridBagLayout());
		Border borde1 = BorderFactory.createTitledBorder("Formulario");
		setBorder (borde1);
		
		Jl_nombre= new JLabel("Nombre: ");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Jl_nombre,c);
        
        
        Jtf_nombre = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=1;
        c.fill=GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_nombre,c);
        
        
        Jl_apellido = new JLabel("Apellido: ");
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=2;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets=in;
        add(Jl_apellido,c);
        		
        
        Jtf_apellido = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=3;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_apellido,c);
        
        
        
        Jl_tipo = new JLabel("Tipo: ");
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=4;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets=in;
        add(Jl_tipo,c);
        		
        
        Jtf_tipo = new JComboBox();
        Jtf_tipo.setModel(new DefaultComboBoxModel(new String[] {"Seleccione","T.I","C.C"}));
        Jtf_tipo.setSelectedIndex(0);
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=5;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_tipo,c);
        
        Jl_genero = new JLabel("Genero: ");
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=6;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets=in;
        add(Jl_genero,c);
        		
        
        Jtf_genero = new JComboBox();
        Jtf_genero.setModel(new DefaultComboBoxModel(new String[] {"Seleccione","Masculino","Femenino"}));
        Jtf_genero.setSelectedIndex(0);
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=7;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_genero,c);
        
        Jl_cedula= new JLabel("Numero: ");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=8;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Jl_cedula,c);
        
        
        Jtf_cedula = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=9;
        c.fill=GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_cedula,c);
       
        Jl_edad= new JLabel("Edad: ");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=10;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Jl_edad,c);
        
        
        Jtf_edad = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=11;
        c.fill=GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_edad,c);
        
        
        
        Jl_peso= new JLabel("Peso: ");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=12;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Jl_peso,c);
        
        
        Jtf_peso = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=13;
        c.fill=GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_peso,c);
        
        Jl_altura= new JLabel("Altura: ");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=14;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Jl_altura,c);
        
        
        Jtf_altura = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=15;
        c.fill=GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_altura,c);
        
        Jl_celular= new JLabel("Celular: ");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=16;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Jl_celular,c);
        
        
        Jtf_celular = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=17;
        c.fill=GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_celular,c);
        
        Jl_direccion= new JLabel("Direccion: ");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=18;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( Jl_direccion,c);
        
        
        Jtf_direccion = new JTextField();
        c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=19;
        c.fill=GridBagConstraints.BOTH;
        in = new Insets(5, 10, 5, 10);
        c.insets= in;
        add(Jtf_direccion,c);
        
        
        
        Jbt_agregar = new JButton("Agregar");
        Jbt_agregar.addActionListener(this);
        Jbt_agregar.setActionCommand("a");
        c=new GridBagConstraints();
        c.gridx=0;
        c.gridy=20;
        c.fill = GridBagConstraints.BOTH;
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;
        add(Jbt_agregar,c);
        
        
        
        
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola ...");
		if(validarDatos()){
			
			int aux1 = Integer.parseInt(this.Jtf_edad.getText().trim());
			int aux2 = Integer.parseInt(this.Jtf_cedula.getText().trim());
			float aux3 = Float.parseFloat(this.Jtf_peso.getText().trim());
			//referenciaVentaPrincipal.agregarPersona(Jtf_nombre.getText(), Jtf_apellido.getText(), aux1, aux2, aux3);
			JOptionPane.showMessageDialog(null,"Persona agregada. ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
			reset();	
			}
		
		
	}
	 public boolean validarDatos(){
	        if(!Jtf_edad.getText().trim().equals("") && !Jtf_nombre.getText().trim().equals("") && !Jtf_apellido.getText().trim().equals("") && !Jtf_cedula.getText().trim().equals("") && !Jtf_peso.getText().trim().equals("")){
	            
	            try{
	                int iedad = Integer.parseInt(this.Jtf_edad.getText().trim());
	            }catch(Exception error){
	                JOptionPane.showMessageDialog(null, "La edad no es valida!");
	                return false;
	            }
	            try{
	                float ipeso = Float.parseFloat(this.Jtf_peso.getText().trim());
	            }catch(Exception error){
	                JOptionPane.showMessageDialog(null, "El peso no es valida!");
	                return false;
	            }
	            try{
	                int icedula = Integer.parseInt(this.Jtf_cedula.getText().trim());
	            }catch(Exception error){
	                JOptionPane.showMessageDialog(null, "La cedula no es valida!");
	                return false;
	            }
	            
	        }
	        else{
	            JOptionPane.showMessageDialog(null, "Llene todos los campos!");
	            return false;
	        }
	        
	        
	        return true;
	    }
	 public void reset(){
	        this.Jtf_nombre.setText("");
	        this.Jtf_edad.setText("");
	        this.Jtf_apellido.setText("");
	        this.Jtf_cedula.setText("");
	        this.Jtf_peso.setText("");
	        
	    }
	
}
