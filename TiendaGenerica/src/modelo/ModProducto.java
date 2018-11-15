package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ModProducto {

	private ArrayList<Producto>Producto;
	private int numProducto;
	private String ruta = "./data";

	public ModProducto()
	{
		Producto = new ArrayList<Producto>();
		numProducto = 0;		
	}

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
}
