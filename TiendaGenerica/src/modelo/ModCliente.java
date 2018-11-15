package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ModCliente {

	private ArrayList<Cliente>Cl;
	private int numCliente;
	private String ruta = "./data";

	public ModCliente()
	{
		Cl = new ArrayList<Cliente>();
		numCliente = 0;				
	}

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
	private void leerArchivo(String cedula, String nombre, String direccion, String telefono,String correoElectronico)
	{
		
		File in = new File(ruta+"/cliente.txt");
		File out = new File(ruta+"/cliente.txt");
		try {
			in.createNewFile();
			out.createNewFile();
			FileReader fr = new FileReader(in);
			FileWriter fw = new FileWriter(out, true);
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter(fw);
			
			String linea = br.readLine();
			
			while(linea == null)
			{
				for (int i = 0; i < 1; i++)
				{
					pw.println("Nombre: " + nombre);
					pw.println("Cédula: "+cedula);
					pw.println("Dirección: "+direccion);
					pw.println("Télefono: "+telefono);
					pw.println("Corre electronico: "+correoElectronico);
				}
			}
			
			linea = br.readLine();
			fr.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
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
}
