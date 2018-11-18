package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.swing.JOptionPane;


public class ModDatosTienda {
	
	//Atributos
	private Properties p;
	File configuracion;
	
	public ModDatosTienda()
	{ 
		//Ruta donde se guardaran los datos de la tienda
		configuracion = new File ("./data/configuracion.properties");
	}
	

	public Properties getP() {
		return p;
	}


	public void setP(Properties p) {
		this.p = p;
	}

//Método que crea las caracteristicas de la tienda
	public void crearArchivos(String nombreTienda, String tipoComercio, String NIT, String ciudadOrigen, String valorIva, String tasaInteres, String nombreBanco, String numeroCuenta,String nombreGerente)
	{
		try {
		configuracion.createNewFile();
		FileInputStream fs = new FileInputStream(configuracion);
		p = new Properties();
		p.load(fs);
		
		p.setProperty("nombreTienda", nombreTienda);
		p.setProperty("TipoComercio", tipoComercio);
		p.setProperty("NIT", NIT);
		p.setProperty("CiudadOrigen", ciudadOrigen);
		p.setProperty("IVA", valorIva);
		p.setProperty("TasaI", tasaInteres);
		p.setProperty("NombreBanco", nombreBanco);
		p.setProperty("NumeroCuenta", numeroCuenta);
		p.setProperty("NombreGerente", nombreGerente);
		
	
		p.store(new FileOutputStream(configuracion), null);
		

			
		} catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Error");
		}
	}
	public void getProp()
	{
		
	}
	
	//Método que carga las caracterisiticas de la tienda.
	public boolean cargarArchivos(String nombreTienda, String pregunta)
	{
		boolean cargar = false;
		
			p.getProperty("nombreTienda");
			if(nombreTienda.equalsIgnoreCase(pregunta) )
			{
				cargar = true;
			}
			return cargar;
	}


	public File getConfiguracion() {
		return configuracion;
	}


	public void setConfiguracion(File configuracion) {
		this.configuracion = configuracion;
	}
	
	
	
}