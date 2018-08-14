/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.huawei.ynyw.dto.common;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ParamsEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer domainType;
	private String domainName;
	private Integer journeyFamily;
	private String journeyFamilyName;
	private String customerType;
	private String customerTypeName;
	private Integer journeyId;
	private Integer timeInterval;
	private String timeIntervalName;
	private String channel;
	private String channelName;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date startTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date endTime;
	private String customerGroup;
	private String customerGroupName;
	private String servicePlan;
	private String servicePlanName;
	private String service;
	private String serviceName;
	private String metrics;

	public String getStartTimeString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(getStartTime());
	}

	@JsonIgnore
	public void setStartTimeString(String str) {
	}

	public String getEndTimeString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(getEndTime());
	}

	@JsonIgnore
	public void setEndTimeString(String str) {
	}

	public Integer getDomainType() {
		return this.domainType;
	}

	public void setDomainType(Integer domainType) {
		this.domainType = domainType;
	}

	public Integer getJourneyFamily() {
		return this.journeyFamily;
	}

	public void setJourneyFamily(Integer journeyFamily) {
		this.journeyFamily = journeyFamily;
	}

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Integer getJourneyId() {
		return this.journeyId;
	}

	public void setJourneyId(Integer journeyId) {
		this.journeyId = journeyId;
	}

	public Integer getTimeInterval() {
		return this.timeInterval;
	}

	public void setTimeInterval(Integer timeInterval) {
		this.timeInterval = timeInterval;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getCustomerGroup() {
		return this.customerGroup;
	}

	public void setCustomerGroup(String customerGroup) {
		this.customerGroup = customerGroup;
	}

	public String getServicePlan() {
		return this.servicePlan;
	}

	public void setServicePlan(String servicePlan) {
		this.servicePlan = servicePlan;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getMetrics() {
		return this.metrics;
	}

	public void setMetrics(String metrics) {
		this.metrics = metrics;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getCustomerTypeName() {
		return this.customerTypeName;
	}

	public void setCustomerTypeName(String customerTypeName) {
		this.customerTypeName = customerTypeName;
	}

	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getCustomerGroupName() {
		return this.customerGroupName;
	}

	public void setCustomerGroupName(String customerGroupName) {
		this.customerGroupName = customerGroupName;
	}

	public String getServicePlanName() {
		return this.servicePlanName;
	}

	public void setServicePlanName(String servicePlanName) {
		this.servicePlanName = servicePlanName;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getJourneyFamilyName() {
		return this.journeyFamilyName;
	}

	public void setJourneyFamilyName(String journeyFamilyName) {
		this.journeyFamilyName = journeyFamilyName;
	}

	public String getTimeIntervalName() {
		return this.timeIntervalName;
	}

	public void setTimeIntervalName(String timeIntervalName) {
		this.timeIntervalName = timeIntervalName;
	}
}