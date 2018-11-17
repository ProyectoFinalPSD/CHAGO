package modelo;

public class Producto {

	private String codigo;
	private String nombreProducto;
	private String NITdeproveedor;
	private String precioCompra;
	private String precioVenta;

	public Producto(String Pcodigo, String PnompreProducto,String PprecioCompra,String PprecioVenta, String Nit)
	{
		codigo = Pcodigo;
		nombreProducto= PnompreProducto;
		precioCompra = PprecioCompra;
		precioVenta =  PprecioVenta;	
		NITdeproveedor = Nit;
	}
	public String getNombreProducto()
	{
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto)
	{
		this.nombreProducto = nombreProducto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNITdeproveedor() {
		return NITdeproveedor;
	}
	public void setNITdeproveedor(String nITdeproveedor) {
		NITdeproveedor = nITdeproveedor;
	}
	public String getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(String precioCompra) {
		this.precioCompra = precioCompra;
	}
	public String getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(String precioVenta) {
		this.precioVenta = precioVenta;
	}
	





}
