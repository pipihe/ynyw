/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.huawei.ynyw.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

public class BaseLog {
	private Logger log;

	public static BaseLog getBaseLog(Class<?> clazz) {
		BaseLog x = new BaseLog();
		x.log = Logger.getLogger(clazz);
		return x;
	}

	public Properties getProperty(String filePath) {
		Properties property = new Properties();
		InputStream is = PropertiesUtils.class.getResourceAsStream(filePath);
		try {
			property.load(is);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return property;
	}

	public Properties getProp() {
		return getProperty("/setting.properties");
	}

	public void error(Object message) {
		if ("2".equals(getProp().getProperty("errorLogSwitch")))
			return;
		this.log.error(message);
	}

	public void info(Object message) {
		if ("2".equals(getProp().getProperty("requestLogSwitch")))
			return;
		this.log.info(message);
	}

	public void debug(Object message) {
		if ("2".equals(getProp().getProperty("testLogSwitch")))
			return;
		this.log.debug(message);
	}
}