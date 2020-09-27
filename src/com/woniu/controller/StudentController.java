package com.woniu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.eneity.Student;
import com.woniu.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/param.do")
	public ModelAndView handleRequest(Student student) throws Exception {
		System.out.println(student);
		studentService.insertStudent(student);
		return new ModelAndView("/a.jsp");
	}
	
	//同步void
	@RequestMapping("/void1.do")
	public void voidRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/void.jsp").forward(request, response);
	}
	
	//同步string
	@RequestMapping("/string1.do")
	public String stringRequest() {
		return "/string.jsp";
	}
	
	//异步void
	@RequestMapping("/asyVoid.do")
	public void asyVoidRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//异步void需要自己json
		ObjectMapper om = new ObjectMapper();
		om.writeValue(response.getOutputStream(), new Student(1, "zs"));
	}
	

	//异步的Integer
	@ResponseBody
	@RequestMapping("/asyInteger.do")
	public Integer integerRequest() {
		return 40;
	}
	
	//异步的String
	@ResponseBody
	@RequestMapping("/asyString.do")
	public String stringRequest2() {
		return "aaa";
	}
	
	//异步Student
	@ResponseBody
	@RequestMapping("/asyStudent.do")
	public Student studentRequest() {
		return new Student(1, "zz");
	}
}
