package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Mundo 
{
	//Declaración de atributos de Mundo
	private ModCliente modCl;
	private ModProducto modprod;
	private ModProveedor modprov;
	private ModDatosTienda moddat;
	private ModuloFactura modfact;
	private ModGestionVentas modvent;
	
	public Mundo()
	{
		//Inicialización de atributos
		moddat =  new ModDatosTienda();
		modCl = new ModCliente();
		modprod = new ModProducto();
		modprov = new ModProveedor();
		modfact = new ModuloFactura();
		modvent = new ModGestionVentas();

	}
	
	//Getters y Setters: Permiten para tener acceso de los atributos en otras clases
	public ModCliente getModCl() {
		return modCl;
	}

	public void setModCl(ModCliente modCl) {
		this.modCl = modCl;
	}

	public ModProducto getModprod() {
		return modprod;
	}

	public void setModprod(ModProducto modprod) {
		this.modprod = modprod;
	}

	public ModProveedor getModprov() {
		return modprov;
	}

	public void setModprov(ModProveedor modprov) {
		this.modprov = modprov;
	}



	public ModDatosTienda getModdat() {
		return moddat;
	}



	public void setModdat(ModDatosTienda moddat) {
		this.moddat = moddat;
	}



	public ModuloFactura getModfact() {
		return modfact;
	}



	public void setModfact(ModuloFactura modfact) {
		this.modfact = modfact;
	}



	public ModGestionVentas getModvent() {
		return modvent;
	}



	public void setModvent(ModGestionVentas modvent) {
		this.modvent = modvent;
	}
	

}
