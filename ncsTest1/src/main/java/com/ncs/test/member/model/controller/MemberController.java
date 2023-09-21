package com.ncs.test.member.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ncs.test.member.model.service.MemberService;
import com.ncs.test.member.model.vo.Member;

public class MemberController {
	@Autowired
	private MemberService memberServiceImpl;
	
	
	// 로그인 요청 URL을 매핑하여 서비스 호출 및 뷰 연결처리를 하는 메소드
	@GetMapping("/") //문제 잘 읽어보면 이렇게 적어줘야함 (따로x)
	public String index() {
		// 1) 로그인 요청 URL을 매핑하여 서비스 호출 및 뷰 연결처리를 하는 메소드
		return "index";
	}
	
	@PostMapping("/login")
	public String memberLogin(Member vo)  {
		Member result = memberServiceImpl.loginMember(vo);
		// 2)로그인 실패시 "로그인 실패 메시지" 출력
		return "redirect:/";
	}
}
