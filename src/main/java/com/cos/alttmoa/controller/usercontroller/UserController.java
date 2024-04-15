package com.cos.alttmoa.controller.usercontroller;

import java.util.HashMap;
import java.util.Map;

import javax.management.RuntimeErrorException;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.alttmoa.dto.userdto.UserDTO;
import com.cos.alttmoa.entity.User;
import com.cos.alttmoa.handler.CustomValidationExcption;
import com.cos.alttmoa.repository.userrepository.UserRepository;
import com.cos.alttmoa.service.userservice.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	private final UserService service;


	@GetMapping({"","/"})
	public String loginForm() {
		return "auth/loginForm";
	}
	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "auth/joinForm";
	}
	
	@PostMapping("/auth/join")
	public  String join(@Valid UserDTO userdto,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			Map<String, String> errormap = new HashMap<>();
			for(FieldError error : bindingResult.getFieldErrors()) {
				errormap.put(error.getField(), error.getDefaultMessage());
			}
			throw new CustomValidationExcption("유효성검사 실패함",errormap);
		}else {
			User user = userdto.ToEntity();
			User userEntity = service.join(user);
			return "auth/loginForm";	
		}
		
	}
}
