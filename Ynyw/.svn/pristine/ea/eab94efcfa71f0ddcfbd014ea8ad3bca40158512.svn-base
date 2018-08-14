package com.huawei.ynyw.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.huawei.ynyw.service.FailureCauseAnalysisService;

@Controller
public class FailureCauseAnalysisController {

	@Resource
	FailureCauseAnalysisService failureCauseAnalysisService;
	
	@RequestMapping(value="/failureCause.action",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView failureCauseAnalysis() {
		ModelAndView modle=new ModelAndView("/successAnalyse");
		return modle;
	}
}
