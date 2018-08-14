package com.huawei.ynyw.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.huawei.ynyw.service.OwnBusiessAnalysisService;

@Controller
public class OwnBusiessAnalysisController {

	@Resource
	OwnBusiessAnalysisService ownBusiessAnalysisService;
	
	
	@RequestMapping(value="/ownBusiessAnalysis.action",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView ownBusiessAnalysis() {
		ModelAndView modle=new ModelAndView("/analyse");
		return modle;
	}
}
