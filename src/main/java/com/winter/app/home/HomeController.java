package com.winter.app.home;

import java.security.Principal;
import java.util.Enumeration;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.winter.app.users.UserDTO;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

    private final HomeController HomeController;

    HomeController(HomeController homeController) {
        this.HomeController = homeController;
    }

	@GetMapping("/")
	public String index(HttpSession session)throws Exception{
		// 1.
		Enumeration<String> en = session.getAttributeNames();
		
		while(en.hasMoreElements()) {
			String k = en.nextElement();
			System.out.println(k);
			return "index";
		}
	
	public String index4(Principal principal)throws Exception{
		UserDTO userDTO = (UserDTO)principal;
		System.out.println(userDTO.getUsername());
		return "index4";
		
	
		
		
	}
}
