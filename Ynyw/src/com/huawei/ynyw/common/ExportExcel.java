package com.huawei.ynyw.common;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huawei.ynyw.dto.common.FieldMap;


public class ExportExcel {
	/**
	 * 导出excel
	 * @param req
	 * @param res
	 * @param data 需导出的数据
	 * @param journeyId 场景id
	 * @param metrics 指标
	 */
	public void downloadExcel(HttpServletRequest req, HttpServletResponse res, List<Map<String, Object>> data, Integer journeyId, String metrics)
    {
        String file = "IMPACTED_USER_LIST";
        
        //查询真实的数据
        List<Map<String, Object>> list = data;
        
        Map<String, Object> map = new HashMap<>();
        map.put("sheetName", "IMPACTED_USER_LIST");
        // 此行不能删除 ，为了保证第一行只有表头
        list.add(0, map);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try
        {
        	 String key = "";
             String column = "";
        	// 获取表头部
            ExportExcelTable table = new ExportExcelTable();
            // 循环添加并查询
            for (FieldMap m : table.getColumns())
            {
            	  column = column + m.getCname()+ ",";
                  key = key + m.getCname() + ",";
            }
            String keys[] = key.substring(0, key.lastIndexOf(",")).split(",");
            String columns[] = column.substring(0, column.lastIndexOf(",")).split(",");
            ExcelDownLoadUtil.createWorkBook(list, columns, keys).write(os);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数，可以打开下载页面
        res.reset();
        res.setContentType("application/vnd.ms-excel;charset=utf-8");
        try
        {
            res.setHeader("Content-Disposition",
                    "attachment;filename=" + new String((file + ".xls").getBytes(), "iso-8859-1"));
        }
        catch (UnsupportedEncodingException e1)
        {
            e1.printStackTrace();
        }
        ServletOutputStream out = null;
        try
        {
            out = res.getOutputStream();
        }
        catch (IOException e1)
        {
            e1.printStackTrace();
        }
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try
        {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[Constant.BYTE_ARRAY];
            int bytesRead;
            while (Constant.READ_FLAG != (bytesRead = bis.read(buff, Constant.FOR_START_ZERO, buff.length)))
            {
                bos.write(buff, Constant.FOR_START_ZERO, bytesRead);
            }
        }
        catch (final IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (bis != null)
                try
                {
                    bis.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            if (bos != null)
                try
                {
                    bos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
        }
    }
}
