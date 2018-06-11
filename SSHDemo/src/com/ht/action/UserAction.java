package com.ht.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ht.model.User;
import com.ht.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = -3796779227002235446L;
	
	@Resource(name = "userServiceImpl")
	private IUserService userService;
	
	public String list() {
		
		List<User> userList = userService.list();
		
		System.out.println(userList);
		
		return "userList";
	}

}
