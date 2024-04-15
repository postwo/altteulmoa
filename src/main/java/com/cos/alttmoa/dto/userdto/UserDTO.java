package com.cos.alttmoa.dto.userdto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.aspectj.lang.annotation.DeclareAnnotation;

import com.cos.alttmoa.entity.User;
import com.sun.istack.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class UserDTO { 
	
	@NotBlank
	private String userId;
	
	@NotBlank
    @Size(min = 4, max = 15)
	private String password;
	
	@NotBlank
	private String email;
	
	@NotBlank
    @Size(min = 2, max = 10)
	private String name;
	
	@NotBlank
    @Size(min = 2, max = 10)
	private String nickname;
	
	@NotBlank
	private String age;
	
	@NotNull //int 값일때 사용
	private int hintNo;
	
	@NotBlank
	private String hintanswer;
	
	@NotBlank
	private String streetAddress;
	
	@NotBlank
	private String streetDetailAddress;
	
	@NotBlank(message = "상세주소를 입력해주세요.")
	private String detailAddress;
	
	public User ToEntity() {
		return User.builder()
				.userId(userId)
				.password(password)
				.email(email)
				.nickname(nickname)
				.name(name)
				.age(age)
				.hintNo(hintNo)
				.hintanswer(hintanswer)
				.streetAddress(streetAddress)
				.streetDetailAddress(streetDetailAddress)
				.detailAddress(detailAddress)
				.build();
	}
	
	
	
}
