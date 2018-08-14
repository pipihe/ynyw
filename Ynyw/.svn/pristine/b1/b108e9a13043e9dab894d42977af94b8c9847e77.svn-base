package com.huawei.ynyw.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.huawei.ynyw.service.IndexTrendsService;

@Controller
public class IndexTrendsController {

	@Resource
	IndexTrendsService indexTrendsService;
	
	@RequestMapping(value="/indexTrends.action",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView indexTrends() {
		ModelAndView modle=new ModelAndView("/IndexTrends");
		return modle;
	}
}
