package br.univel;

import net.sf.jasperreports.engine.JRDataSource;

public class DsFactory {
	
	public static JRDataSource create(){
		return new CustomDs();
	}

}
