package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.dto.CafeDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping
@Slf4j
public class CafeController {
	/*
	// @어노테이션 PostMapping(만남의주소)
	// 메서드 cafeMainComment
	@PostMapping("/cafe/comment")
	public String cafeMainComment(@RequestParam("cafeCommentName") String cafeCommentName,
								  @RequestParam("cafeCommentOpinion") String cafeCommentOpinion
			) {
		log.info("카페 메인으로 이동하기");
		
		log.debug("cafeCommentName" + cafeCommentName);
		log.debug("cafeCommentOpinion" + cafeCommentOpinion);
		
		return "redirect:/cafe/cafe_index";
	}
	// @어노테이션 RequestParam cafeCommentName cafeCommentOpinion
		//log.info로 들어왔는지 확인
		//log.debug로 cafeCommentName cafeCommentOpinion 넣기
	//return redirect cafe_index로 돌아가기
	*/
	
	
	//CafeDTO cafe_board
	
	//-> @PostMapping("cafe_index") ModelAttribute 받아오기
	@PostMapping("/cafe/comment")
	public String cafeIndexComment(CafeDTO cafeDTo) {
		CafeDTO cd = new CafeDTO();
		cd.getCafeCommentName();
		cd.getCafeCommentOpinion();
		
		cd.setCafeCommentName("넣어줄 값 = 나중에 db연결해서 전달해줄 값 넣어줄 것");
		cd.setCafeCommentOpinion("넣어줄 값 = 나중에 db연결해서 전달해줄 값 넣어줄 것");
		
		return "redirect:/cafe/cafe_index";
	}
}
