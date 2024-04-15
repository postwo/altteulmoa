package com.cos.alttmoa.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true,length = 20)
	private String userId;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String nickname;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String age;
	
	@Column(nullable = false)
	private int hintNo;
	
	@Column(nullable = false)
	private String hintanswer;
	
	@Column(nullable = false)
	private String streetAddress;
	
	@Column(nullable = false)
	private String streetDetailAddress;
	
	@Column(nullable = false)
	private String detailAddress;
	
	
	private String profileImageUrl;
	private String role;
	
	private LocalDateTime createDate;
	
	@PrePersist
	public void createDate() {
		this.createDate= LocalDateTime.now();
	}

	
	
	
	
}
