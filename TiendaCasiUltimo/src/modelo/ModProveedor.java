package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ModProveedor 
{
	//Atributos Declaración
	private ArrayList<Proveedor>proveedores;
	private Proveedor p;
	private int numProveedores;


	public ModProveedor()
	{
		//Inicialización
		proveedores = new ArrayList<>();
		numProveedores = 0;
	}

	/*Método auxiliar de tipo booleano que permite saber si existe o no un proveedor por su NIT si es
	igual a la que esta por parametro*/
	public boolean existeProveedor(String pNit)
	{
		boolean existe = false;

		for (int i = 0; i <proveedores.size() && existe == false; i++) {
			if(proveedores.get(i).getNIT() == pNit)
			{
				existe = true;
			}
		}

		return existe;
	}
	
	/*
	 * Método de tipo booleano que permite agregar un proveedor con ayuda del método auxiliar anterior
	 * agregar un proveedor parametros necesarios para registrarlo
	 */
	public boolean agregarProveedor(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad)
	{
		boolean agregar = false;
		boolean existe = existeProveedor(pNit);
		if(existe == false)
		{
			Proveedor proveedor = new Proveedor(pNit, pNombre, pDireccion, pTelefono, pCiudad);
			proveedores.add(proveedor);
			numProveedores ++;	
			agregar = true;
		}
			leerArchivo(pNit, pNombre, pDireccion, pTelefono, pCiudad);
			return agregar;
	}
	
	/*
	 * Método que borra a un proveedor por su NIT, si su NIT es igual al que está establecido
	 * por parámetro, lo borra.
	 */
	public String eliminarProveedor(String pNit)
	{
		String eliminar = "";
		for (int i = 0; i < proveedores.size(); i++) {
			if(proveedores.get(i)!= null && proveedores.get(i).getNIT()==pNit)
			{
				proveedores.remove(i);
				numProveedores --;
				eliminar = "Se eliminó el proveedor";
			}
		}
		return eliminar;
	}
	
	/*
	 * Método que actualiza los datos de un proveedor por parámetros
	 */
	public void actualizarProveedor(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad)
	{

		for (int i = 0; i < proveedores.size(); i++) {
			if(proveedores.get(i)!= null)
			{
				proveedores.get(i).setNombre(pNombre);
				proveedores.get(i).setNIT(pNit);
				proveedores.get(i).setDireccion(pCiudad);
				proveedores.get(i).setCiudad(pCiudad);
				proveedores.get(i).setTelefono(pTelefono);
			}

		}
	}
	
	/*
	 * Método que lee una ruta donde está un file que contiene a los proveedore registrados
	 */
	public void leerArchivo(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad)
	{
		try {
			File in = new File("./data/proveedor"+pNombre+".txt");
			File out = new File("./data/proveedor"+pNombre+".txt");
			
			in.createNewFile();
			out.createNewFile();
			FileReader fr = new FileReader(in);
			FileWriter fw = new FileWriter(out, true);
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter(fw);
			
			String linea = br.readLine();
			
			for (int i = 0; i < 1; i++) {
				
				pw.println("Nombre: "+pNombre);
				pw.println("NIT: "+pNit);
				pw.println("Direccion: "+pDireccion);
				pw.println("Telefono: "+pTelefono);
				pw.println("Ciudad: "+pCiudad);
		
		
			linea = br.readLine();
			fr.close();
			fw.close();
			
		}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Proveedor Agregado");
		}
	}

	//Getters y Setters: Permiten para tener acceso de los atributos en otras clases
	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public Proveedor getP() {
		return p;
	}

	public void setP(Proveedor p) {
		this.p = p;
	}

	public int getNumProveedores() {
		return numProveedores;
	}

	public void setNumProveedores(int numProveedores) {
		this.numProveedores = numProveedores;
	}
	
	
}
