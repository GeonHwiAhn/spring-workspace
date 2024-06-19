package com.khmall.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Companys {
	private int company_id;
	private String company_name;
	private String company_address;
	private String company_phone;
	//핸드폰번호는 0으로 시작하기떄문에 String으로 해줌
	//int는 맨 앞 0을 자동으로 없애주기 때문
	//만약에 01011112222 작성했을 때 String은 그대로 들어가지만
	//int로 01011112222 작성했을 떄 db에 저장되는 값은 1011112222이다.
}
