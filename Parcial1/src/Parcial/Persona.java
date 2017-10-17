package Parcial;


public class Persona {
	
	private String nombre;
	private String apellido;
	private String tipo;
	private String genero;
	private int cedula;
	private int edad;
	private float peso;
	private float altura;
	private String celular;
	private String direccion;


	public Persona(String _nombre, String _apellido, String _tipo, String _genero,int _cedula,int _edad, float _peso, float _altura, String _celular, String _direccion) {
		nombre= _nombre;
		apellido=_apellido;
		tipo = _tipo;
		genero = _genero;
		cedula = _cedula;
		edad = _edad;
		peso = _peso;
		altura = _altura;
		celular = _celular;
		direccion =_direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
