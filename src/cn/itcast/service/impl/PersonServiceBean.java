package cn.itcast.service.impl;

import cn.itcast.service.PersonService;

public class PersonServiceBean implements PersonService {
	private String user = null;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public PersonServiceBean(String user){
		this.user = user;
	}
	@Override
	public void satve(String name) {
		System.out.println("我是save()方法");
	}

	@Override
	public void update(String name, Integer personid) {
		System.out.println("我是update()方法！");
	}

	@Override
	public String getPersonName(Integer personid) {
		System.out.println("我是getPersonName方法！");
		return "xxx";
	}

}
