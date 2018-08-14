/***
 * Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao
 * (cnfree2000@hotmail.com)
 ***/
package com.huawei.ynyw.common.exception;

/***
 * 异常捕获类
 * 
 * @author Administrator
 */
public class DaoException extends RuntimeException
{
    private static final long serialVersionUID = 1803020421148171794L;
    /**
     * 错误码
     */
    private int errorCode;
    
    /***
     * dao层异常捕获
     * 
     * @param errorCode
     *            错误码
     * @param msg
     *            错误信息
     */
    public DaoException(String msg, int errorCode)
    {
        super(msg);
        this.errorCode = errorCode;
    }
    
    /***
     * dao 层异常捕获
     * 
     * @param errorCode
     *            错误码
     * @param msg
     *            错误信息
     * @param e
     *            异常
     */
    public DaoException(String msg, Throwable e, int errorCode)
    {
        super(msg, e);
        this.errorCode = errorCode;
    }
    
    public int getErrorCode()
    {
        return this.errorCode;
    }
    
}
