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

public class ModProveedor {

	private ArrayList<Proveedor>proveedores;
	private int numProveedores;


	public ModProveedor()
	{
		proveedores = new ArrayList<>();
		numProveedores = 0;
	}

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
	public boolean agregarProveedor(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad, String nombreTienda)
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
			leerArchivo(pNit, pNombre, pDireccion, pTelefono, pCiudad, nombreTienda);
			return agregar;
	}
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
	public void leerArchivo(String pNit, String pNombre, String pDireccion, String pTelefono, String pCiudad, String nombreTienda)
	{
		File in = new File("./"+nombreTienda+"/proveedor"+pNombre+".txt");
		File out = new File("./"+nombreTienda+"/proveedor"+pNombre+".txt");
		try {
			in.createNewFile();
			out.createNewFile();
			FileReader fr = new FileReader(in);
			FileWriter fw = new FileWriter(out, true);
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter(fw);
			
			String linea = br.readLine();
			while(linea==null){
			for (int i = 0; i < 1; i++) {
				pw.println("Nombre: "+pNombre);
				pw.println("NIT: "+pNit);
				pw.println("Direccion: "+pDireccion);
				pw.println("Telefono: "+pTelefono);
				pw.println("Ciudad: "+pCiudad);
				
			}
			linea = br.readLine();
			fr.close();
			fw.close();
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
