/***
 * Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao
 * (cnfree2000@hotmail.com)
 ***/
package com.huawei.ynyw.common;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.log4j.Logger;

import com.huawei.ynyw.common.exception.DaoException;
import com.huawei.smartcare.dac.sdk.QueryFactory;
import com.huawei.smartcare.dac.sdk.api.DataQuery;
import com.huawei.smartcare.dac.sdk.bean.ActionType;
import com.huawei.smartcare.dac.sdk.bean.DataRequest;
import com.huawei.smartcare.dac.sdk.bean.DataResult;

/**
 * 
 * @author Administrator
 *
 */
public class BaseDAO extends BaseLog
{
//    static final String URL = "https://10.110.212.37:8443/dac/external";
//    static final String USER = "admin";
//    static final String PWD = "hua9Fwei!";
    
    
    static final String URL = "https://222.90.69.7:65101/dac/external";
    static final String USER = "admin";
    static final String PWD = "Admin135!";
    
    static
    {
        QueryFactory.setURL(URL, USER, PWD);
    }
    
    private final int timeOut = 300000000;
    protected Logger log;
    
    /**
     * 构造方法
     */
    public BaseDAO()
    {
        
        this.log = Logger.getLogger(super.getClass());
    }
    
    /**
     *  时间转化
     * @param d 时间
     * @return 返回值
     */
    protected String getDateSecString(Date d)
    {
        Long l = Long.valueOf(d.getTime() / 1000L);
        return l.toString();
    }
    
    protected DataQuery getSdrQuery()
    {
        DataQuery dq = QueryFactory.newDataQuery();
        ((DataRequest) dq.getRequest()).setAction(ActionType.AGGRE_SDR);
        dq.setLocale(Locale.CHINA);
        super.getClass();
        dq.setTimeout(timeOut);
        
        return dq;
    }
    
    protected DataQuery getXdrQuery()
    {
        DataQuery dq = QueryFactory.newDataQuery();
        ((DataRequest) dq.getRequest()).setAction(ActionType.QUERY);
        
        dq.setLocale(Locale.CHINA);
        super.getClass();
        dq.setTimeout(timeOut);
        
        return dq;
    }
    
    protected DataResult getSqlQuery(DatabaseType dbType, String sql)
    {
        this.log.debug("获取SQL查询器");
        this.log.debug(dbType);
        this.log.info(sql);
        
        DataQuery dq = QueryFactory.newDataQuery();
        dq.setTimeout(timeOut);
        
        DataRequest dr = (DataRequest) dq.getRequest();
        
        dr.setSql(sql);
        
        if (dbType == DatabaseType.PT)
            dr.setDataSource("PT");
        else if (dbType == DatabaseType.IQ)
            dr.setDataSource("IQ_SDR");
        else if (dbType == DatabaseType.HADOOP)
            dr.setDataSource("SDW_SDR");
        else
            throw new RuntimeException("设置DAC使用SQL进行查询的数据库类型设置错误。");
        dq.setRequest(dr);
        
        return ((DataResult) dq.query());
    }
    
    protected List<Map<String, Object>> getDataBySQL(String sql)
    {
        DataResult ds = getSqlQuery(DatabaseType.IQ, sql);
        if (null == ds)
        {
            throw new DaoException("查询结果集为空！", 40001);
        }
        return ds.getData();
    }
    
    protected DataQuery getDataDrillDown()
    {
        DataQuery dq = QueryFactory.newDataDrillDown();
        dq.setLocale(Locale.CHINA);
        super.getClass();
        dq.setTimeout(timeOut);
        
        return dq;
    }
    
    protected DataQuery getDimensionDataQuery()
    {
        DataQuery dq = QueryFactory.newDimensionDataQuery();
        dq.setLocale(Locale.CHINA);
        super.getClass();
        dq.setTimeout(timeOut);
        return dq;
    }
    
    protected static enum DatabaseType
    {
        PT, IQ, HADOOP;
    }
}
