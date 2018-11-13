package modelo;


import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class GestionCliente {
	
	private ArrayList<Cliente> lista;
	private Cliente persona;
	
	public GestionCliente()
	{
		lista = new ArrayList<Cliente>();
	}
	
	public boolean agregarCliente(String cedula, String nombre, String direccion, String telefono, String correoElectronico)
	{
		boolean agregar = false;
		
		if(agregar == false) 
		{
				lista.add(new Cliente(cedula, nombre, direccion, telefono, correoElectronico));
				agregar = true;	
			
		}
		return agregar;
	}
	public ArrayList<Cliente> agregar(String id, String nombre, String edad, String Profesion, String tel)
	{
			Cliente persona = new Cliente(id, nombre, edad, Profesion, tel);
			lista.add(persona);
		
		
		return lista;
	}

	public ArrayList<Cliente> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cliente> lista) {
		this.lista = lista;
	}

	public Cliente getPersona() {
		return persona;
	}

	public void setPersona(Cliente persona) {
		this.persona = persona;
	}
	
	

}
