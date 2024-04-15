package com.cos.alttmoa.config.userlogin;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cos.alttmoa.entity.User;
import com.cos.alttmoa.repository.userrepository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PrincipalDetailsService implements UserDetailsService {

	private final UserRepository repository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User userEntity = repository.findByUsername(username);

		if (userEntity == null) {
			return null;
		}else {
			return new PrincipalDatails(userEntity); 
		}
		
	}

	
}
