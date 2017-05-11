package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.User;
import domain.Users;

@Controller
public class UsersXMLController {

	@RequestMapping(value="/serlist.do", produces="application/xml")
	public @ResponseBody Users getUsersToXML(HttpServletRequest req, HttpSession session){
		
		List<User> list = new ArrayList<>();
		Users users = new Users();
		
		User u1 = new User();
		u1.setNo(1);
		u1.setName("Kim");
		u1.setImgUrl(req.getContextPath() + "/images/v_01.jpg");
		
		list.add(u1);
		
		User u2 = new User();
		u2.setNo(2);
		u2.setName("Lee");
		u2.setImgUrl(req.getContextPath() + "/images/v_02.jpg");
		
		list.add(u2);
		
		users.setUsers(list);
		return users;
	}
	
}
