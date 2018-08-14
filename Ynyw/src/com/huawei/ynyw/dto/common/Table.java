/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.huawei.ynyw.dto.common;

import com.alibaba.fastjson.JSONObject;
import java.util.List;

public class Table {
	protected String tableName;
	protected List<FieldMap> columns;

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<FieldMap> getColumns() {
		return this.columns;
	}

	public void setColumns(List<FieldMap> columns) {
		this.columns = columns;
	}

	public String toString() {
		return JSONObject.toJSONString(this);
	}
}