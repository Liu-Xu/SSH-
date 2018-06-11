package com.ht.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.ht.model.Page;
import com.ht.model.User;
import com.ht.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = -3796779227002235446L;

	@Resource(name = "userServiceImpl")
	private IUserService userService;

	private List<User> userList;

	private User user;

	private Page page = new Page();

	public String list() {
		int count = userService.getCount();
		
		page.setCountData(count); // 查询总记录数
		page.setCountPage((int)Math.ceil((double)page.getCountData()/page.getPageSize())); // 计算总页数
		
		// 如果访问页数大于总页数
		if (page.getCurrentPage() > page.getCountPage()) {
			page.setCurrentPage(page.getCountPage());
		}
		// 如果访问页数小于第一页
		if (page.getCurrentPage() < 1) {
			page.setCurrentPage(1);
		}
		
		userList = userService.list(page);

		return "userList";
	}

	// 新增
	public String insert() {
		userService.insert(user);

		return "list";
	}

	// 跳转到修改页面
	public String toEdit() {
		user = userService.get(user.getId());

		return "userEdit";
	}

	// 修改
	public String update() {
		userService.update(user);

		return "list";
	}

	// 删除
	public String delete() {
		userService.delete(user.getId());

		return "list";
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

}
