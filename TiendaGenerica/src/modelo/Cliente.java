package modelo;

public class Cliente {
	private String cedula, telefono;
	private String nombre, direccion, correoElectronico;

	public Cliente(String cd, String nom,String direc, String tel, String correoE)
	{
		cedula =  cd;
		telefono = tel;
		nombre = nom;
		direccion =  direc;
		correoElectronico = correoE;
	}

	
	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getDireccion()  
	{
		return direccion;
	}

	public void setDireccion(String direccion) 
	{
		this.direccion = direccion;
	}

	public String getCorreoElectronico() 
	{
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) 
	{
		this.correoElectronico = correoElectronico;
	}

}
