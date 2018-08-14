package com.huawei.ynyw.dao;

import java.util.List;
import java.util.Map;

import com.huawei.smartcare.dac.sdk.api.ColumnBuilder;
import com.huawei.smartcare.dac.sdk.api.ConditionBuilder;
import com.huawei.smartcare.dac.sdk.api.DataQuery;
import com.huawei.smartcare.dac.sdk.bean.DataResult;
import com.huawei.ynyw.common.BaseDAO;
import com.huawei.ynyw.dto.BaseParam;

public class OwnBusiessMonitorDao extends BaseDAO {

	/**
	 * 获取云南省下属所有地市
	 * 
	 * @return 格式为[{"L2REGIONID":692,"L2REGIONNAME":"瑞丽"},
	 *         {"L2REGIONID":691,"L2REGIONNAME":"景洪"}]
	 **/
	public List<Map<String, Object>> getRegion() {
		String sql = "select  l2regionid,l2regionname from PMS.dim_region   WHERE l1regionname LIKE '%云南%'";
		DataResult dr = getSqlQuery(BaseDAO.DatabaseType.PT, sql);
		List<Map<String, Object>> list = dr.getData();
		return list;
	}

	/**
	 * 查询表格中数据
	 * 
	 * @param param
	 * 
	 **/
	public List<Map<String, Object>> getTabInfo(BaseParam param) {
		DataQuery dq=getSdrQuery();
		//设置表名
		dq.setTable("");
		//创建查询字段对象
		ColumnBuilder col = dq.createColumns();
		//创建查询条件对象
		ConditionBuilder cb = dq.createCondition();
		return null;

	}

}
