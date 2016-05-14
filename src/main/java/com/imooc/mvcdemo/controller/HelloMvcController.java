package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//����DispatcherServlet��ص������� ����һ��Controller�� ��������beanŶ
@Controller
//�༶���RequestMapping������DispatcherServlet������ฺ�����Ը�URL��
//HandlerMapping���������ǩ������
@RequestMapping("/hello")
public class HelloMvcController {
	
	//���������RequestMapping�� ���Ʋ���С��URL·��ƥ�䣬ͬ�༶��ı�ǩЭͬ����������ȷ�����ص���URL���Ǹ���������
	//响应 host：8080/hello/mvc 下
	@RequestMapping("/mvc")
	public String helloMvc() {
		
		//��ͼ��Ⱦ��/WEB-INF/jsps/home.jsp
		return "home";
	}

}
