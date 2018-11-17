package modelo;

public class Mundo {
	
	private ModCliente modCl;
	private ModProducto modprod;
	private ModProveedor modprov;
	private ModDatosTienda moddat;
	private ModuloFactura modfact;
	
	public Mundo()
	{
		
		setModdat(new ModDatosTienda());
		modCl = new ModCliente();
		modprod = new ModProducto();
		modprov = new ModProveedor();
		modfact = new ModuloFactura();
	}



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
	

}
