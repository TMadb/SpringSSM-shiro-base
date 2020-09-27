package com.woniu.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/user/login.do")
	public ModelAndView login(String username, String password, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		try {
			subject.login(token);
			System.out.println("登录chengg");
			session.setAttribute("user", username);
			mv.setViewName("/index.jsp");
			return mv;
		} catch (UnknownAccountException e) {
			mv.addObject("msg", "用户名不正确");
		} catch (IncorrectCredentialsException e) {
			mv.addObject("msg", "密码不正确");
		} catch (RuntimeException e) {
			mv.addObject("msg", "未知错误");
		}
		mv.setViewName("/login.jsp");
		return mv;
	}
	
	@RequestMapping("/user/add.do")
	public ModelAndView addUser() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "添加成功");
		mv.setViewName("/index.jsp");
		return mv;
	}

	@RequestMapping("/user/delete.do")
	public ModelAndView deleteUser() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "删除成功");
		mv.setViewName("/index.jsp");
		return mv;
	}
	
	@RequestMapping("/user/select.do")
	public ModelAndView selectUser() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "查找成功");
		mv.setViewName("/index.jsp");
		return mv;
	}
	
	@RequestMapping("/user/update.do")
	public ModelAndView updateUser() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "修改成功");
		mv.setViewName("/index.jsp");
		return mv;
	}
}
