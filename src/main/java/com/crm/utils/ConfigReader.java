package com.crm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	
	public Properties init_prop() {
		
		prop=new Properties();

			FileInputStream ip;

					try {
						//ip = new FileInputStream("./src/test/resources/config/confiq.properties");
						
						ip=new FileInputStream("C:\\Users\\SAJ\\eclipse-workspace2022-03-R-win32-x86_64\\CucumberBDD\\src\\test\\resources\\config\\confiq.properties");
						System.out.println(ip);
						prop.load(ip);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					return prop;
	}

}
