package kh.lcalss.db1.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.lcalss.db1.member.model.service.MemberService;

@Controller 
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;	//앞에서 만들어진 걸(객체) 쓰고싶으면 @붙이고 선언만 해주면 끌어다가 쓸 수 있다.
	
	@GetMapping("/list")
	public String list(Model model) {
		//request.setAttribute("memberList", volist);
		model.addAttribute("memberList", memberService.selectList()); //memberList라고 이름 정해줌
		return "member/list";
	}
	@GetMapping("/get")
	public String get(Model model
			, String pk
			) {
		model.addAttribute("memberVo", memberService.selectOne(pk));
		return "member/get";
	}
}
