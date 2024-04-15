package com.cos.alttmoa.dto;

import java.util.Map;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CMRespDTO<T> {
	private int code; // 1은 성공 ,-1은 실패
	private String messgae;
	private T data;
}
