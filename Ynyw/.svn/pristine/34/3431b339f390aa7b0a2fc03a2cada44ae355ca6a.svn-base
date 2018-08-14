/***
 * Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao
 * (cnfree2000@hotmail.com)
 ***/
package com.huawei.ynyw.dto.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ResultEntity
{
    private String rtnMsg;
    private Integer rtnCode;
    private Object rtnData;
    
    public ResultEntity(Integer rtnCode, String rtnMsg)
    {
        this.rtnCode = rtnCode;
        this.rtnMsg = rtnMsg;
    }
    
    public ResultEntity(Object data)
    {
        this.rtnCode = Integer.valueOf(0);
        this.rtnData = data;
    }
    
    public ResultEntity()
    {
        this.rtnCode = Integer.valueOf(0);
    }
    
    public String getRtnMsg()
    {
        return this.rtnMsg;
    }
    
    public void setRtnMsg(String rtnMsg)
    {
        this.rtnMsg = rtnMsg;
    }
    
    public Integer getRtnCode()
    {
        return this.rtnCode;
    }
    
    public void setRtnCode(Integer rtnCode)
    {
        this.rtnCode = rtnCode;
    }
    
    public Object getRtnData()
    {
        return this.rtnData;
    }
    
    public void setRtnData(Object rtnData)
    {
        this.rtnData = rtnData;
    }
}
