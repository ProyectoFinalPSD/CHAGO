package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ModCliente
{
    //Atributos
	private ArrayList<Cliente>Cl; //Un contenedor de clientes de tipo Cliente
	private int numCliente;

	public ModCliente()
	{
		//Inicialización
		Cl = new ArrayList<Cliente>();
		numCliente = 0;				
	}
	
/*Método auxiliar de tipo booleano que permite saber si existe o no un cliente por su cedula si es
	igual a la que esta por parametro*/
	public boolean existeCliente(String cedula)
	{
		boolean existeCl =  false;

		for (int i = 0; i < Cl.size() && existeCl == false; i++)
		{
			if(Cl.get(i).getCedula() == cedula )
			{
				existeCl =  true;				
			}			
		}		
		return existeCl;		
	}
	
/*
 * Método de tipo booleano que permite agregar un cliente con ayuda del método auxiliar anterior
 * agregar un cliente por parametros necesarios para registrarlo
 */
	public boolean agregarCliente(String cedula, String nombre, String direccion, String telefono, String correoElectronico)
	{
		boolean agregar = false;
		boolean existeCl = existeCliente(cedula);

		if(existeCl == false) 
		{
			Cliente cliente =  new Cliente(cedula, nombre, direccion, telefono, correoElectronico);
			Cl.add(cliente);
			numCliente ++;
			agregar = true;
		}
		leerArchivo(cedula, nombre, direccion, telefono, correoElectronico);
		return agregar;
	}
	
	/*
	 * Método que lee una ruta donde esta un file que contiene a los clientes registrados
	 */
	private void leerArchivo(String cedula, String nombre, String direccion, String telefono,String correoElectronico)
	{
		try {
			
			File in = new File("./data/cliente"+nombre+".txt");
			File out = new File("./data/cliente"+nombre+".txt");
		
			in.createNewFile();
			out.createNewFile();
			FileReader fr = new FileReader(in);
			FileWriter fw = new FileWriter(out, true);
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter(fw);
			
			String linea = br.readLine();
			
			for (int i = 0; i < 1; i++)
				{
					pw.println("Nombre: " + nombre);
					pw.println("Cédula: "+cedula);
					pw.println("Dirección: "+direccion);
					pw.println("Télefono: "+telefono);
					pw.println("Corre electronico: "+correoElectronico);
					
					linea = br.readLine();
					fr.close();
					fw.close();
				}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Cliente Agregado");
		}
	}
	
	/*
	 * Método que actualiza los datos de un cliente por parámetros
	 */
	public void actualizarCliente(String cedula, String nombre, String direccion, String telefono, String correoElectronico)
	{
		for (int i = 0; i < Cl.size(); i++) {
			if(Cl.get(i)!= null)
			{
				Cl.get(i).setCedula(cedula);
				Cl.get(i).setNombre(nombre);
				Cl.get(i).setDireccion(direccion);
				Cl.get(i).setTelefono(telefono);
				Cl.get(i).setCorreoElectronico(correoElectronico);
			}
		}
	}
	
	/*
	 * Método que borra a un cliente por su cedula, si su cedula es igual al que está establecida
	 * por parámetro, lo borra.
	 */
	public String borrarCliente(String cedula) 
	{
		String borrar = "";

		for (int i = 0; i < Cl.size(); i++) 
		{
			if(Cl.get(i) != null && Cl.get(i).getCedula() == cedula)
			{
				borrar = "Se eliminó cliente";
				Cl.remove(i);
				numCliente--;
			}
		}
		return borrar;
	}
	
	
	//Getters y Setters: Permiten para tener acceso de los atributos en otras clases
	public ArrayList<Cliente> getCl() {
		return Cl;
	}

	public void setCl(ArrayList<Cliente> cl) {
		Cl = cl;
	}
	
}
