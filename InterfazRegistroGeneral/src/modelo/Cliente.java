package modelo;

public class Cliente {
	
	private String idPersona;
	private String nombrePersona;
	private String edadPersona;
	private String profesionPersona;
	private String telefonoPersona;
	public String getIdPersona() {
		return idPersona;
	}
	public Cliente(String id, String nombre, String edad, String profesion, String telefono)
	{
		this.idPersona = id;
		this.nombrePersona = nombre;
		this.edadPersona = edad;
		this.profesionPersona = profesion;
		this.telefonoPersona = telefono;
	}
	
	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getEdadPersona() {
		return edadPersona;
	}
	public void setEdadPersona(String edadPersona) {
		this.edadPersona = edadPersona;
	}
	public String getProfesionPersona() {
		return profesionPersona;
	}
	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}
	public String getTelefonoPersona() {
		return telefonoPersona;
	}
	public void setTelefonoPersona(String telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}
	
	
	
	
}
