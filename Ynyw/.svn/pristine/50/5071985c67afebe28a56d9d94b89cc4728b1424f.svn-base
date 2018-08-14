package com.huawei.ynyw.common.exception;

/**
 * service 异常捕获
 * 
 * @author Administrator
 */
public class ServiceException extends RuntimeException
{
    private static final long serialVersionUID = 1803020421148171793L;
    /**
     * 错误码
     */
    private int errorCode;
    
    /***
     * service 构造方法
     * @param errorCode 错误码
     * @param msg 错误信息
     * @param e 异常信息
     */
    public ServiceException(int errorCode, String msg, Throwable e)
    {
        super(msg, e);
        this.errorCode = errorCode;
    }
    /**
     * service 构造方法
     * @param errorCode 错误码
     * @param msg 错误信息
     */
    public ServiceException(int errorCode, String msg)
    {
        super(msg);
        this.errorCode = errorCode;
    }
    
    public int getErrorCode()
    {
        return this.errorCode;
    }
}
