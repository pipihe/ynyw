/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.huawei.ynyw.dto;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class SweetRS {
	private Object model;
	private Boolean success;
	private String message;
	private String error;
	private List<?> data;
	private SweetPage page;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<?> getData() {
		return this.data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public SweetPage getPage() {
		return this.page;
	}

	public void setPage(SweetPage page) {
		this.page = page;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Object getModel() {
		return this.model;
	}

	public void setModel(Object model) {
		this.model = model;
	}
}