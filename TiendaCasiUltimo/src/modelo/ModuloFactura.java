package modelo;

import java.util.ArrayList;

public class ModuloFactura {
	
	private ArrayList<Factura>f;
	private int consecutivo;
	
	public ModuloFactura()
	{
		f = new ArrayList<Factura>();
		consecutivo = 0;
	}
	public void crearFactura()
	{
		
	}
	public int darConsecutivo()
	{
		return consecutivo = f.size()+1;
	}
	
	

}
