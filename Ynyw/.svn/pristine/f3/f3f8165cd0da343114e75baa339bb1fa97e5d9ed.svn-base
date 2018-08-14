package com.huawei.ynyw.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.huawei.ynyw.dto.BaseParam;
import com.huawei.ynyw.dto.common.ResultEntity;
import com.huawei.ynyw.service.OwnBusiessMonitorService;

@Controller
public class OwnBusiessMonitorController {
	
	@Resource
	OwnBusiessMonitorService ownBusiessMonitorService;
	
	@RequestMapping(value="/ownBusiessMonitor.action",method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView getRegion() {
		ModelAndView model = new ModelAndView("/monitor");//页面地址未填
		List<Map<String, Object>>list=ownBusiessMonitorService.getRegion();
		model.addObject("Region", JSONObject.toJSON(list));
		return model;
	}
	
	/**查询表格数据，参数未填
	 ****/
	@RequestMapping(value="/monitorTab.action",method={ RequestMethod.POST, RequestMethod.GET })
	public ResultEntity getTabInfo(BaseParam param) {
		ResultEntity result=new ResultEntity();
		return result;
	}

}
