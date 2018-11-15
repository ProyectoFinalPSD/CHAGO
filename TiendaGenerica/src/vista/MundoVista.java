package vista;


public class MundoVista {
	
	private JFrameVentanaPrincipal vp;
	private JFrameRegistroProveedores rpv;
	private JFrameFacturaVenta fv;
	private JFrameDatosTienda dt;
	private JFrameFormasPago fp;
	private JFrameCompraEfectivo ce;
	
	public MundoVista()
	{
		vp = new JFrameVentanaPrincipal();		
		rpv = new JFrameRegistroProveedores();
		dt = new JFrameDatosTienda();
		fv = new JFrameFacturaVenta();
		fp = new JFrameFormasPago();
		ce = new JFrameCompraEfectivo();
		
	}

	public JFrameVentanaPrincipal getVp() {
		return vp;
	}

	public JFrameRegistroProveedores getRpv() {
		return rpv;
	}

	public void setRpv(JFrameRegistroProveedores rp) {
		this.rpv = rp;
	}

	public JFrameFacturaVenta getFv() {
		return fv;
	}

	public void setFv(JFrameFacturaVenta fv) {
		this.fv = fv;
	}

	public JFrameDatosTienda getDt() {
		return dt;
	}

	public void setDt(JFrameDatosTienda dt) {
		this.dt = dt;
	}

	public JFrameFormasPago getFp() {
		return fp;
	}

	public void setFp(JFrameFormasPago fp) {
		this.fp = fp;
	}

	public JFrameCompraEfectivo getCe() {
		return ce;
	}

	public void setCe(JFrameCompraEfectivo ce) {
		this.ce = ce;
	}
	

}
