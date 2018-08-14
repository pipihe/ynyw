/***
 * Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao
 * (cnfree2000@hotmail.com)
 ***/
package com.huawei.ynyw.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huawei.ynyw.common.exception.ControllerException;
import com.huawei.ynyw.common.exception.DaoException;
import com.huawei.ynyw.common.exception.ServiceException;
import com.huawei.ynyw.dto.common.ParamsEntity;
import com.huawei.ynyw.dto.common.ResultEntity;

/**
 * 异常捕获基础类
 * @author Administrator
 */
public class BaseController
{
    /**
     * log
     */
    protected Logger log;
    /**
     * session key
     */
    private final String PARAMS_ENTITY_SESSION_KEY = "paramsEntity";
    
    public BaseController()
    {
        this.log = Logger.getLogger(super.getClass());
    }
    
    /**
     * 异常处理器
     * @param e 异常信息
     * @param req HttpServletRequest
     * @return String错误信息
     */
    @ExceptionHandler(
    {Exception.class})
    public String exceptionHandler(Exception e, HttpServletRequest req)
    {
        req.setAttribute("err", e);
        this.log.warn("未捕获的异常，赶紧自己看看代码。", e);
        return "/exception";
    }
    
    @ExceptionHandler(
    {ControllerException.class})
    @ResponseBody
    public ResultEntity controllerExceptionHandler(ControllerException e, HttpServletRequest req)
    {
        return new ResultEntity(Integer.valueOf(e.getErrorCode()), e.getMessage());
    }
    
    @ExceptionHandler(
    {ServiceException.class})
    @ResponseBody
    public ResultEntity serviceExceptionHandler(ServiceException e, HttpServletRequest req)
    {
        return new ResultEntity(Integer.valueOf(e.getErrorCode()), e.getMessage());
    }
    
    @ExceptionHandler(
    {DaoException.class})
    @ResponseBody
    public ResultEntity daoExceptionHandler(DaoException e, HttpServletRequest req)
    {
        return new ResultEntity(Integer.valueOf(e.getErrorCode()), e.getMessage());
    }
    
    protected void setSessionParamsEntity(HttpServletRequest req, ParamsEntity pe)
    {
        req.getSession().setAttribute(PARAMS_ENTITY_SESSION_KEY, pe);
    }
    
    protected ParamsEntity getSessionParamsEntity(HttpServletRequest req)
    {
        return ((ParamsEntity) req.getSession().getAttribute(PARAMS_ENTITY_SESSION_KEY));
    }
    
    protected void setSessionParamsEntity(HttpSession ss, ParamsEntity pe)
    {
        ss.setAttribute(PARAMS_ENTITY_SESSION_KEY, pe);
    }
    
    protected ParamsEntity getSessionParamsEntity(HttpSession ss)
    {
        return ((ParamsEntity) ss.getAttribute(PARAMS_ENTITY_SESSION_KEY));
    }
}
