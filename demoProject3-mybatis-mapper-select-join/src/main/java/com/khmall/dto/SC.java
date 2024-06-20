package com.khmall.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SC {
	private int snack_id;
	private String Snack_name;
	private int price;
	
	//mappers 폴더 안에 있는 xml에 작성한 join문에서 
	//Snacks 테이블에 있는 company_id와 Company테이블에 있는 company_id가
	//서로 의미하는 바와 값이 일치할 경우 Company테이블에 있는 
	//company_name 과 company_phone 가져오겠다.
	private int company_id;
	private String company_name;
	private String company_phone;
	private String company_address;
}
