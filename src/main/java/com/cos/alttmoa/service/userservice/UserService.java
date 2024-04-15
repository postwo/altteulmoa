package com.cos.alttmoa.service.userservice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.alttmoa.entity.User;
import com.cos.alttmoa.repository.userrepository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository repository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Transactional() //insert update delete 할때는 걸어준다 //함수가 실행되고 종료될때가지 트랜잭션 관리를 해준다
	public User join(User user) {
	 String rowpassword = user.getPassword();
	 String encodepw = bCryptPasswordEncoder.encode(rowpassword);
	 user.setPassword(encodepw);
	 user.setRole("ROLE_USER");
	 User userEntity =repository.save(user); //컨트롤러에서 재사용하기 위해 변수를 생성
	 return userEntity;
	}
}
