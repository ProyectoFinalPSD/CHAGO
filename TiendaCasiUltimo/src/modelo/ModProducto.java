package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ModProducto 
{
	//Atributos
	private ArrayList<Producto>Producto;//Un contenedor de productos de tipo Producto
	private int numProducto;
	private String ruta = "./data";

	public ModProducto()
	{
		//Inicialización
		Producto = new ArrayList<Producto>();
		numProducto = 0;		
	}
	
	/*Método auxiliar de tipo booleano que permite saber si existe o no un producto por su código si es
	igual a la que esta por parametro*/
	public boolean existeProducto(String codigo)
	{
		boolean existeProducto =  false;

		for (int i = 0; i < Producto.size() && existeProducto == false; i++)
		{
			if(Producto.get(i).getCodigo() == codigo )
			{
				existeProducto =  true;				
			}			
		}		
		return existeProducto;		
	}
	
	
	/*
	 * Método de tipo booleano que permite agregar un producto con ayuda del método auxiliar anterior
	 * agregar un producto por parametros necesarios para registrarlo
	 */
	public boolean crearProducto(String codigo, String nombreProducto,String precioCompra,String precioVenta, String nit_proveedor)
	{
		boolean crear = false;
		boolean existePro = existeProducto(codigo);

		if(existePro == false) 
		{
			Producto producto =  new Producto(codigo, nombreProducto, precioCompra,precioVenta, nit_proveedor);
			Producto.add(producto);
			numProducto ++;
			crear = true;
		}
		leerArchivo(codigo,nombreProducto, precioCompra,precioVenta, nit_proveedor);
		return crear;
	}
	
	/*
	 * Método que lee una ruta donde esta un file que contiene a los productos registrados
	 */
	private void leerArchivo(String codigo, String nombreProducto, String precioCompra, String precioVenta, String nit_proveedor) {
		File in = new File(ruta+"/producto.txt");
		File out = new File(ruta+"/producto.txt");
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
				for (int i = 0; i < 1; i++) {
					pw.println("Código: "+codigo);
					pw.println("Nombre del producto: " + nombreProducto);
					pw.println("Precio de compra: " + precioCompra);
					pw.println("Precio de venta: "+ precioVenta);
					pw.println("Nit de proveedor del producto: "+nit_proveedor);
				}
			}
			linea = br.readLine();
			fr.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	//public tipoDedato leeProducto()
	
	/*
	 * Método que actualiza los datos de un producto por parámetros
	 */

	public void actualizarCliente(String codigo, String nombreProducto,String  precioCompra,String  precioVenta)
	{
		for (int i = 0; i < Producto.size(); i++) 
		{
			if(Producto.get(i)!= null)
			{
				Producto.get(i).setCodigo(codigo);
				Producto.get(i).setNombreProducto(nombreProducto);
				Producto.get(i).setPrecioCompra(precioCompra);
				Producto.get(i).setPrecioVenta(precioVenta);

			}
		}
	}

	/*
	 * Método que borra a un producto por su código, si su código es igual al que está establecido
	 * por parámetro, lo borra.
	 */
	public String borrarProducto(String  codigo) 
	{
		String borrar = "";

		for (int i = 0; i < Producto.size(); i++) 
		{
			if(Producto.get(i) != null && Producto.get(i).getCodigo() == codigo)
			{
				borrar = "Se eliminó producto";
				Producto.remove(i);
				numProducto--;
			}
		}
		return borrar;
	}

	public ArrayList<Producto> getProducto() {
		return Producto;
	}

	public void setProducto(ArrayList<Producto> producto) {
		Producto = producto;
	}

}
