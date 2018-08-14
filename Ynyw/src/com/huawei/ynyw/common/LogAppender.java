/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.huawei.ynyw.common;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;

public class LogAppender extends DailyRollingFileAppender {
	public boolean isAsSevereAsThreshold(Priority priority) {
		return getThreshold().equals(priority);
	}
}