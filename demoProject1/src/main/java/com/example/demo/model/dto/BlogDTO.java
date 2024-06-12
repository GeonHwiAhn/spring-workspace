package com.example.demo.model.dto;

import lombok.*;

//@어노테이션 활용해서 constructor, getter, setter, toString
@Getter
@Setter
@NoArgsConstructor
@ToString
public class BlogDTO {
	private String commentName;
	private String commentOpinion;
}
