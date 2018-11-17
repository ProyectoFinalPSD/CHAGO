package vista;


public class MundoVista {
	
	private JFrameVentanaPrincipal vp;
	private JFrameRegistroProveedores rpv;
	private JFrameFacturaVenta fv;
	private JFrameDatosTienda dt;
	private JFrameFormasPago fp;
	private JFrameCompraEfectivo ce;
	private JFrameRegistroProductos rpd;
	private JFrameRegistroClientes rcl;
	private JFrameCheque che;
	private JFrameInventario in;
    

	
	public MundoVista()
	{
		in =  new JFrameInventario();
		che =  new JFrameCheque();
		vp = new JFrameVentanaPrincipal();		
		rpv = new JFrameRegistroProveedores();
		dt = new JFrameDatosTienda();
		fv = new JFrameFacturaVenta();
		fp = new JFrameFormasPago();
		ce = new JFrameCompraEfectivo();
		rpd = new JFrameRegistroProductos();
		rcl = new JFrameRegistroClientes();
		
	}

	public JFrameVentanaPrincipal getVp() 
	{
		return vp;
	}

	public JFrameRegistroProveedores getRpv() 
	{
		return rpv;
	}

	public void setRpv(JFrameRegistroProveedores rp) 
	{
		this.rpv = rp;
	}

	public JFrameFacturaVenta getFv()
	{
		return fv;
	}

	public void setFv(JFrameFacturaVenta fv) 
	{
		this.fv = fv;
	}

	public JFrameDatosTienda getDt() 
	{
		return dt;
	}

	public void setDt(JFrameDatosTienda dt) 
	{
		this.dt = dt;
	}

	public JFrameFormasPago getFp()
	{
		return fp;
	}

	public void setFp(JFrameFormasPago fp) 
	{
		this.fp = fp;
	}

	public JFrameCompraEfectivo getCe()
	{
		return ce;
	}

	public void setCe(JFrameCompraEfectivo ce) 
	{
		this.ce = ce;
	}

	public JFrameRegistroProductos getRpd() 
	{
		return rpd;
	}

	public void setRpd(JFrameRegistroProductos rpd) 
	{
		this.rpd = rpd;
	}

	public void setVp(JFrameVentanaPrincipal vp)
	{
		this.vp = vp;
	}

	public JFrameRegistroClientes getRcl() 
	{
		return rcl;
	}

	public void setRcl(JFrameRegistroClientes rcl)
	{
		this.rcl = rcl;
	}

	public JFrameCheque getChe() {
		return che;
	}

	public void setChe(JFrameCheque che)
	{
		this.che = che;
	}

	public JFrameInventario getIn() 
	{
		return in;
	}

	public void setIn(JFrameInventario in) 
	{
		this.in = in;
	}
	

}
