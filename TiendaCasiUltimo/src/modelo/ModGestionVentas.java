package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class ModGestionVentas
{
	//Atributos
	private ModProducto modpro;
	private ModCliente modc;
	private double IVA, valTotalMaIva;	
	String valTotal;
	private String ruta = "/.data";
	private String properties = "configuracion.properties";
	private Properties prop;


	public ModGestionVentas()
	{
		
	}
	
	
	public String buscarCliente(String pCedula)
	{
		String buscar = "";

		for (int i = 0; i<modc.getCl().size();i++) {
			if(modc.getCl().get(i).getCedula() == pCedula)
				buscar = modc.getCl().get(i).getNombre();
		}
		return buscar;
	}
	public String buscarProducto(String pCodigo)
	{
		String buscar = "";
		for (int i = 0; i <modpro.getProducto().size(); i++) {
			if(modpro.getProducto().get(i).getCodigo() == pCodigo)
			{
				buscar = modpro.getProducto().get(i).getNombreProducto();
			}
		}
		return buscar;
	}
	
	//Método que calcula el IVA
	public double calcularIVA() throws FileNotFoundException, IOException
	{
		prop.load(new FileInputStream(properties));
		IVA = Double.parseDouble(prop.getProperty("IVA"))*100;
		return IVA;
	}
	
	//Método que calcula el valor total	
	public String valTotal()
	{
		valTotal = "";

		for (int contador = 0; contador < modpro.getProducto().size(); contador++){
			String valoTotal = modpro.getProducto().get(contador).getPrecioVenta();

			System.out.println("El total es: " + valTotal);
		}
		System.out.println(valTotal);
		return valTotal;
	}
	
	//Método que calcula el valor total más IVA
	public String calcularValorTotalConIVA()
	{
		double total = Double.parseDouble(valTotal);
		valTotalMaIva = (total + this.IVA);
		return ""+valTotal;
	}

	//Método que registra los datos de la tienda
	public void registrarDatosVenta()
	{
		File in = new File(ruta+"/datosVenta.txt");
		File out = new File(ruta+"/datosVenta.txt");
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
					pw.println("Valor total: " + this.valTotal);
					pw.println("IVA: " + this.IVA);
					pw.println("Valor con IVA: " + this.valTotalMaIva);
				}
			}
			linea = br.readLine();
			fr.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
	
	//Getters y Setters: Permiten para tener acceso de los atributos en otras clases
	public ModProducto getModpro() {
		return modpro;
	}
	public void setModpro(ModProducto modpro) {
		this.modpro = modpro;
	}
	public ModCliente getModc() {
		return modc;
	}
	public void setModc(ModCliente modc) {
		this.modc = modc;
	}
	public double getIVA() {
		return IVA;
	}
	public void setIVA(double iVA) {
		IVA = iVA;
	}
	public double getValTotalMaIva() {
		return valTotalMaIva;
	}
	public void setValTotalMaIva(double valTotalMaIva) {
		this.valTotalMaIva = valTotalMaIva;
	}
	public String getValTotal() {
		return valTotal;
	}
	public void setValTotal(String valTotal) {
		this.valTotal = valTotal;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
}
