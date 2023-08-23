package kh.lcalss.db1.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kh.lcalss.db1.member.model.service.MemberService;

@Controller 
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/member/list")
	public String list(Model model) {
		model.addAttribute("memberList", memberService.selectList()); //memberList라고 이름 정해줌
		
		return "member/list";
	}
}
