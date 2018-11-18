package modelo;

public class Proveedor 
{
	//Declaración de atributos
	private String NIT;
	private String nombre;
	private String direccion;
	private String telefono;
	private String ciudad;
	
	public Proveedor(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad)
	{
		//Inicialización de atributos
		pNit = this.NIT;
		pNombre = this.nombre;
		pDireccion = this.direccion;
		pTelefono = this.telefono;
		pCiudad = this.ciudad;
	}
	
	//Getters y Setters: Permiten para tener acceso de los atributos en otras clases
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getNIT() {
		return NIT;
	}



	public void setNIT(String nIT) {
		NIT = nIT;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
}

	

