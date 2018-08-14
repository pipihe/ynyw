/**
 * 
 */
package com.huawei.ynyw.common;
/**
 * 
 */

import java.util.Comparator;
import java.util.Map;

import org.apache.commons.lang.math.NumberUtils;

/**
 * map 排序  从小到大
 * 
 * @author rwp
 */

public class ComparatorForSp implements Comparator<Map<String, Object>>
{
    @Override
    public int compare(Map<String, Object> o1, Map<String, Object> o2)
    {
        // 流量 排序
        String b1 = o1.get("total") != null ? o1.get("total").toString() : "";
        String b2 = o2.get("total") != null ? o2.get("total").toString() : "";
        Double data1 = NumberUtils.isNumber(b1) ? Double.parseDouble(b1) : 0;
        Double data2 = NumberUtils.isNumber(b2) ? Double.parseDouble(b2) : 0;
        
        if (data1 > data2)
        {
            return 1;
        }
        else if (data1 == data2)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}