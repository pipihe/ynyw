package com.huawei.ynyw.common;

import java.util.ArrayList;

import com.huawei.smartcare.dac.sdk.bean.ColumnType;
import com.huawei.smartcare.dac.sdk.bean.Style;
import com.huawei.ynyw.dto.common.FieldMap;
import com.huawei.ynyw.dto.common.Table;

/**
 * 
 * @author caiyu
 *
 */

public class ExportExcelTable extends Table{
	
	public ExportExcelTable(){
		
		this.columns = new ArrayList<FieldMap>();
	    //流水号 
		this.columns.add(new FieldMap("流水号", "SERIAL_NO", ColumnType.XDR, Style.IDENTIFIER));
		//告警类型
		this.columns.add(new FieldMap("告警类型 ", "ALARM_TYPE", ColumnType.XDR, Style.IDENTIFIER));
		//告警名称
		this.columns.add(new FieldMap("告警名称", "ALARM_NAME", ColumnType.XDR, Style.IDENTIFIER));
		//对象类型
		this.columns.add(new FieldMap("对象类型", "TASK_OBJECT_TYPE", ColumnType.XDR, Style.IDENTIFIER));
		//对象
		this.columns.add(new FieldMap("对象", "TASK_OBJECT", ColumnType.XDR, Style.IDENTIFIER));
		//告警级别
		this.columns.add(new FieldMap("告警级别", "ALARM_LEVEL", ColumnType.XDR, Style.IDENTIFIER));
		//失败次数
		this.columns.add(new FieldMap("失败次数", "INDICATORS_COUN", ColumnType.XDR, Style.IDENTIFIER));
		//周期
		this.columns.add(new FieldMap("周期", "PERIOD", ColumnType.XDR, Style.IDENTIFIER));
		//故障首次发生时间
		this.columns.add(new FieldMap("故障首次发生时间", "FIRST_OCCURENCE", ColumnType.XDR, Style.IDENTIFIER));
		//故障最后发生时间
		this.columns.add(new FieldMap("故障最后发生时间", "LAST_UPDATED", ColumnType.XDR, Style.IDENTIFIER));
		//首次生成时间 
		this.columns.add(new FieldMap("首次生成时间 ", "FIRST_CREATE_TIME", ColumnType.XDR, Style.IDENTIFIER));
		//影响用户数 
		this.columns.add(new FieldMap("影响用户数 ", "EFFECT_USERS", ColumnType.XDR, Style.IDENTIFIER));
		//告警信息
		this.columns.add(new FieldMap("告警信息 ", "LOC_INFO_ZH", ColumnType.XDR, Style.IDENTIFIER));
		//恢复时间,
		this.columns.add(new FieldMap("恢复时间", "CLEAR_NUM", ColumnType.XDR, Style.IDENTIFIER));
		//回复类型RETURN_TYPE
		this.columns.add(new FieldMap("恢复类型", "CLEARED_TYPE", ColumnType.XDR, Style.IDENTIFIER));
		//确认时间
		this.columns.add(new FieldMap("确认时间", "CONFIRMED_TIME", ColumnType.XDR, Style.IDENTIFIER));
		//确认用户
		this.columns.add(new FieldMap("确认用户", "USER_IDENTITY", ColumnType.XDR, Style.IDENTIFIER));
	
	}

}
