/***
 * Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao
 * (cnfree2000@hotmail.com)
 ***/
package com.huawei.ynyw.common;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelDownLoadUtil
{
    public static Workbook createWorkBook(List<Map<String, Object>> list, String[] keys, String[] columnNames)
    {
        Workbook wb = new HSSFWorkbook();
        
        String title = ((Map<?, ?>) list.get(Constant.FOR_START_ZERO.intValue())).get("sheetName").toString();
        
        Sheet sheet = wb.createSheet(title);
        
        for (int i = Constant.FOR_START_ZERO.intValue(); i < keys.length; ++i)
        {
            sheet.setColumnWidth((short) i, 5355);
        }
        
        Row row = sheet.createRow(Constant.FOR_START_ZERO.intValue());
        
        CellStyle cs = wb.createCellStyle();
        CellStyle cs2 = wb.createCellStyle();
        
        Font f = wb.createFont();
        Font f2 = wb.createFont();
        
        f.setFontHeightInPoints((short) 10);
        f.setColor(IndexedColors.BLACK.getIndex());
        f.setBoldweight((short) 700);
        
        f2.setFontHeightInPoints((short) 10);
        f2.setColor(IndexedColors.BLACK.getIndex());
        
        cs.setFont(f);
        cs.setBorderLeft((short) 1);
        cs.setBorderRight((short) 1);
        cs.setBorderTop((short) 1);
        cs.setBorderBottom((short) 1);
        cs.setAlignment((short) 2);
        
        cs2.setFont(f2);
        cs2.setBorderLeft((short) 1);
        cs2.setBorderRight((short) 1);
        cs2.setBorderTop((short) 1);
        cs2.setBorderBottom((short) 1);
        cs2.setAlignment((short) 2);
        
        for (int i = Constant.FOR_START_ZERO.intValue(); i < columnNames.length; ++i)
        {
            Cell cell = row.createCell(i);
            cell.setCellValue(columnNames[i]);
            cell.setCellStyle(cs);
        }
        
        for (int i = 1; i < list.size(); i =  (i + 1))
        {
            Row row1 = sheet.createRow(i);
            
            for (int j = Constant.FOR_START_ZERO.intValue(); j < keys.length; ++j)
            {
                Cell cell = row1.createCell(j);
                cell.setCellValue((((Map<?, ?>) list.get(i)).get(keys[j]) == null) ? " "
                        : ((Map<?, ?>) list.get(i)).get(keys[j]).toString());
                cell.setCellStyle(cs2);
            }
        }
        return wb;
    }
    
    
    public static boolean exportCommon(HttpServletResponse response,String keys[],String columns[],List<Map<String, Object>> list,String fileName){
        // 设置response参数，可以打开下载页面
        boolean falg = false;
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        try
        {
            // 响应头信息
            String excelName = new String((fileName + ".xls").getBytes(), "iso-8859-1");
            // 设置响应头信息
            response.setHeader("Content-Disposition",
                    new StringBuffer("attachment;filename=").append(excelName).toString());
        } catch (UnsupportedEncodingException e1)
        {
            e1.printStackTrace();
        }

        ServletOutputStream out = null;

        try
        {
            out = response.getOutputStream();
            // 生成excel并输出到页面
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("sheetName", "sheet1");
            list.add(0, map);
            ExcelDownLoadUtil.createWorkBook(list, keys, columns).write(out);
        } catch (IOException e)
        {
            e.printStackTrace();
            falg = false;
        } finally
        {
            if (null != out)
            {
                try
                {
                    out.close();
                    falg = true;
                } catch (IOException e)
                {
                    e.printStackTrace();
                    falg = false;
                }
            }
        }
        return falg;
    }
}
