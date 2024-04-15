package com.cos.alttmoa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Bean
	BCryptPasswordEncoder encode() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain filterchain(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
			 .antMatchers("/user/**","/image/**").authenticated()
			 .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
			 .anyRequest().permitAll()
			 .and()
			 .formLogin()
			 .loginPage("/auth/loginForm")
			 .loginProcessingUrl("/auth/login")
			 .defaultSuccessUrl("/image/story"); //여기만 경로 변경해주기
		return http.build();
	}
	
	
}
