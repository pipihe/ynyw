package com.huawei.ynyw.common.exception;

/**
 * controller 异常捕获类
 * 
 * @author Administrator
 */
public class ControllerException extends RuntimeException
{
    private static final long serialVersionUID = 1803020421148171792L;
    /**
     * 错误码 
     */
    private int errorCode;
    
    /***
     * controller 构造方法
     * @param errorCode 错误码
     * @param msg 错误信息
     * @param e  异常信息
     */
    public ControllerException(int errorCode, String msg, Throwable e)
    {
        super(msg, e);
        this.errorCode = errorCode;
    }
    
    /***
     * 构造方法
     * @param errorCode 错误
     * @param msg 错误信息
     */
    public ControllerException(int errorCode, String msg)
    {
        super(msg);
        this.errorCode = errorCode;
    }
    
    public int getErrorCode()
    {
        return this.errorCode;
    }
}
