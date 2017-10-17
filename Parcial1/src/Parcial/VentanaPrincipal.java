package Parcial;

import java.awt.*;
import java.util.*;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {
	public LinkedHashMap listPersona;
	/*PanelCentral obj_panelcentral;
	PanelDerecho panelderecho;
	PanelSuperior panelarriba;*/
	//PanelIzquierdo obj_panelizquierdo;
	public VentanaPrincipal() {
		super("Mi ventana principal");
		listPersona = new LinkedHashMap();
		inicio();
		componente();
		pack();
        setLocationRelativeTo( null );
	}
	
	private VentanaPrincipal inicio(){
		Dimension dims = new Dimension(500, 600);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane( ).setLayout( new BorderLayout( ) );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}
	
	private void componente() {
		//PanelDerecho obj_panelizquierdo = new PanelDerecho(this);
		PanelIzquierdo panelizquierdo = new PanelIzquierdo(this);
		//panelarriba = new PanelSuperior( );
		//add(panelarriba, BorderLayout.NORTH);
		add(panelizquierdo, BorderLayout.WEST);
		//add(panelderecho, BorderLayout.WEST);
		//obj_panelcentral = new PanelCentral();
		//add(obj_panelcentral, BorderLayout.CENTER);
		
	}
	
	public void  agregarPersona(String _nombre, String _apellido, String _tipo, String _genero, int _cedula,int _edad, float _peso ,float _altura, String _celular, String _direccion) {
		Persona obj = new Persona(_nombre,_apellido,_tipo, _genero, _cedula,_edad,_peso, _altura, _celular, _direccion);
		listPersona.put(_cedula,obj);
		actualizarTabla();
	}
	
	public void actualizarTabla() {
		//obj_panelcentral.refrescarLista(listPersona);
		
	}
	
}
