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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.crm.pojo.Emp;
import com.crm.pojo.Log;
import com.crm.service.LogService;

@Controller
@SessionAttributes(names = { "logMess1", "logMess2", "updatemess" })
public class LogController {
	@Autowired
	private LogService logService;

	/*
	 * 经理查看日志信息
	 */
	@RequestMapping(path = "/fingLog")
	public ModelAndView fingLog() {
		ModelAndView modelAndView = new ModelAndView();
		List<Log> list = logService.findAllLog();
		modelAndView.addObject("logMess1", list);
		modelAndView.setViewName("redirect:/log_jsp/superLog.jsp");
		return modelAndView;
	}

	/*
	 * 员工查看日志信息
	 */
	@RequestMapping(path = "/findLogById")
	public ModelAndView findLogById() {
		Log log = new Log();
		log.setlEid(2L);
		ModelAndView modelAndView = new ModelAndView();
		List<Log> list = logService.findLogById(log);
		modelAndView.addObject("logMess2", list);
		modelAndView.setViewName("redirect:/log_jsp/log.jsp");
		return modelAndView;
	}

	/*
	 * 按照客户姓名，员工姓名，概要，日志状态搜索
	 */
	@RequestMapping(path = "/findLogByClass")
	public ModelAndView findLogByClass(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		String cname = request.getParameter("cname");
		String ename = request.getParameter("ename");
		String logmessage = request.getParameter("logmessage");
		String lstate = request.getParameter("lstate");
		Log log = new Log();
		if (cname != "") {
			int cid = logService.findLogByClientName(cname);
			long lcid = (int) cid;
			log.setlCid(lcid);
		}
		if (ename != "") {
			int eid = logService.findLogByEmpName(ename);
			long leid = (int) eid;
			log.setlEid(leid);
		}
		if (lstate != "") {
			int ls = Integer.parseInt(lstate);
			log.setLstate(ls);
		}
		log.setLogmessage(logmessage);
		List<Log> list = logService.findLogByClass(log);
		modelAndView.addObject("updatemess", list);
		modelAndView.setViewName("redirect:/testData.jsp");
		return modelAndView;
	}

	/*
	 * 
	 * 添加日志信息
	 */
	@RequestMapping(path = "/findClientId")
	public ModelAndView findClientId(HttpServletRequest request, HttpServletResponse response) throws ParseException {
		ModelAndView modelAndView = new ModelAndView();
		String logmessage = request.getParameter("logmessage");
		String starttime = request.getParameter("starttime");
		String endtime = request.getParameter("endtime");
		String logtime = request.getParameter("logtime");
		String cname = request.getParameter("cname");
		String ctel = request.getParameter("ctel");
		String leid = request.getParameter("lEid");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		Timestamp timestamp1 = new Timestamp(format.parse(starttime).getTime());
		Timestamp timestamp2 = new Timestamp(format.parse(endtime).getTime());
		Timestamp timestamp3 = new Timestamp(format.parse(logtime).getTime());

		long eid = Integer.valueOf(leid);
		Map<String, String> map = new HashMap<String, String>();
		map.put("cname", cname);
		map.put("ctel", ctel);
		int cid = logService.findClientId(map);
		long lcid = (int) cid;
		Log log = new Log(null, logmessage, eid, timestamp3, timestamp1, timestamp2, null, lcid, null, null);
		int num = logService.addAllLog(log);
		modelAndView.addObject("num", num);
		modelAndView.setViewName("testData.jsp");
		return modelAndView;
	}

	/*
	 * 修改
	 */
	@RequestMapping(path = "/updateLogByClientAndEmp")
	public ModelAndView updateLogByClientAndEmp(HttpServletRequest request, HttpServletResponse response)
			throws ParseException {
		ModelAndView modelAndView = new ModelAndView();
		String logmessage = request.getParameter("logmessage");
		String starttime = request.getParameter("starttime");
		String endtime = request.getParameter("endtime");
		String cname = request.getParameter("cname");
		String ctel = request.getParameter("ctel");
		String ename = request.getParameter("ename");
		String etel = request.getParameter("etel");
		String lid = request.getParameter("lid");
		String lstate = request.getParameter("lstate");
		Integer lState = Integer.parseInt(lstate);
		long Lid = (int) Integer.parseInt(lid);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Timestamp timestamp1 = new Timestamp(format.parse(starttime).getTime());
		Timestamp timestamp2 = new Timestamp(format.parse(endtime).getTime());
		Log log = new Log(Lid, logmessage, null, null, timestamp1, timestamp2, lState, null, null, null);
		if (cname != null || ctel != null) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("cname", cname);
			map.put("ctel", ctel);
			int cid = logService.findClientId(map);
			long lcid = (int) cid;
			log.setlCid(lcid);
		}

		if (ename != null || etel != null) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("ename", ename);
			map.put("etel", etel);
			int eid = logService.findEmpId(map);
			long leid = (int) eid;
			log.setlEid(leid);
		}
		int num = logService.updateLogByClientAndSuper(log);
		modelAndView.addObject("num", num);
		modelAndView.setViewName("testData.jsp");
		return modelAndView;
	}

	/*
	 * 删除
	 */
	@RequestMapping(path = "/deleteLogByid")
	@ResponseBody
	public int deleteLogByid(@RequestBody Log log) {
		int num = logService.deleteLogByLid(log);
		return num;
	}
}
