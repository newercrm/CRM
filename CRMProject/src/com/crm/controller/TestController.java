package com.crm.controller;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.crm.dao.AreaMapper;
import com.crm.pojo.Area;
import com.crm.pojo.Client;
import com.crm.pojo.Emp;
import com.crm.pojo.Log;
import com.crm.service.EmpService;
import com.crm.service.LogService;

@Controller
public class TestController {

	private static Logger logm = LogManager.getLogger();
	@Autowired
	private LogService logService;
	/*
	 *添加日志信息 
	 */
	@RequestMapping(path="/findClientId")
	public ModelAndView findClientId(HttpServletRequest request, HttpServletResponse response) throws ParseException {
		ModelAndView modelAndView = new ModelAndView();
		String logmessage = request.getParameter("logmessage");
		String starttime = request.getParameter("starttime");
		String endtime =  request.getParameter("endtime");
		String logtime = request.getParameter("logtime");
		String cname = request.getParameter("cname");
		String ctel = request.getParameter("ctel");
		String leid = request.getParameter("lEid");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		Timestamp timestamp1 = new Timestamp(format.parse(starttime).getTime());
		Timestamp timestamp2 = new Timestamp(format.parse(endtime).getTime());
		Timestamp timestamp3 = new Timestamp(format.parse(logtime).getTime());
		
		long eid = Integer.valueOf(leid);
		Map<String,String> map = new HashMap<String,String>();
		map.put("cname", cname);
		map.put("ctel", ctel);
		int cid = logService.findClientId(map);
		long lcid = (int)cid;
		Log log = new Log(null,logmessage, eid, timestamp3, timestamp1, timestamp2,
				null, lcid, null, null);
		int num = logService.addAllLog(log);
		modelAndView.addObject("num", num);
		modelAndView.setViewName("testData.jsp");
		return modelAndView;
	}


}
