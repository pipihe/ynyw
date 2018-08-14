/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.huawei.ynyw.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtils extends BaseController {
	private static Properties property = new Properties();

	public Properties getProperty(String filePath) {
		try {
			InputStream is = PropertiesUtils.class.getResourceAsStream(filePath);
			property.load(is);
			is.close();
		} catch (FileNotFoundException e) {
			this.log.error("[package]common-[class]PropertiesUtils-[function]getProperty.FileNotFoundException:"
					+ e.toString());
		} catch (IOException e) {
			this.log.error("[package]common-[class]PropertiesUtils-[function]getProperty.IOException:" + e.toString());
		}
		return property;
	}

	public Properties setProperty(String filePath, Map<String, String> map) {
		try {
			OutputStream fos = new FileOutputStream(PropertiesUtils.class.getResource(filePath).getPath(), false);
			Iterator<?> entries = map.entrySet().iterator();
			while (entries.hasNext()) {
				@SuppressWarnings("rawtypes")
                Map.Entry entry = (Map.Entry) entries.next();
				String key = (String) entry.getKey();
				String value = (String) entry.getValue();
				property.setProperty(key, value);
			}
			property.store(fos, null);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			this.log.error("[package]common-[class]PropertiesUtils-[function]getProperty.FileNotFoundException:"
					+ e.toString());
		} catch (IOException e) {
			e.printStackTrace();
			this.log.error("[package]common-[class]PropertiesUtils-[function]getProperty.IOException:" + e.toString());
		}
		return property;
	}

	public boolean appendProperty(String filePath, Map<String, Object> map) {
		boolean flag = true;

		InputStream is = PropertiesUtils.class.getResourceAsStream(filePath);
		Properties prop = new Properties();
		try {
			prop.load(is);
			is.close();
			OutputStream fos = new FileOutputStream(PropertiesUtils.class.getResource(filePath).getPath(), false);
			Iterator<?> entries = map.entrySet().iterator();
			while (entries.hasNext()) {
				@SuppressWarnings("rawtypes")
                Map.Entry entry = (Map.Entry) entries.next();
				if(entry != null && entry.getKey() != null && entry.getValue() != null ){
				    String key = (String) entry.getKey();
	                String value = entry.getValue().toString();
	                prop.setProperty(key, value);    
				}
			}
			prop.store(fos, null);
			prop.clear();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			flag = false;
		} catch (IOException e) {
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
}