package modelo;

public class Factura 
{
	//Declaración de atributos
	private ModProducto p;
	private ModCliente c;
	private double precioVenta;
	private int CantidadProductos;
	
	public Factura()
	{
		//Inicialización de atributos
		p = new ModProducto();
		c = new ModCliente();
		CantidadProductos = 0;
		precioVenta = 0.0;
	}
	// Busca un cliente por su cedula, si es igual a la que está por parámetro, lo encuentra.
	public void BuscarCliente(String id)
	{
		for (int i = 0; i <c.getCl().size(); i++) 
		{
			if(c.getCl().get(i).getCedula() == id)
			{
				c.getCl().get(i);
			}
		}
	}
	
	//Selecciona un producto por su codigo, si el codigo es igual al parametro, lo selecciona
	public void seleccionarProducto(String codigo)
	{
		for (int i = 0; i < p.getProducto().size(); i++) {
			if(p.getProducto().get(i).getCodigo()==codigo)
			{
				String precio = p.getProducto().get(i).getPrecioVenta();
				precioVenta = Double.parseDouble(precio);
			}	
		}
	}
	//public double precioVenta()
	{
		
	}

}
