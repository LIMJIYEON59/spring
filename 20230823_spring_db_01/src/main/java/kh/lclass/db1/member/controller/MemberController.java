package kh.lclass.db1.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.lclass.db1.member.model.service.MemberService;
import kh.lclass.db1.member.model.vo.MemberVo;

@Controller 
public class MemberController {
	@Autowired
	private MemberService memberService;	//앞에서 만들어진 걸(객체) 쓰고싶으면 @붙이고 선언만 해주면 끌어다가 쓸 수 있다.
	
	@GetMapping("/member/list")
	public String list(Model model
			//,HttpSetAttribute("memberList",volist);
			){
		List<MemberVo> volist = memberService.selectList();
		//request.setAttribute("memberList", volist);
		model.addAttribute("memberList", volist);//memberList라고 이름 정해줌
		return "member/list";
	}
	@GetMapping("/member/get")
	public String get(Model model) {
		//TODO: model.addAttribute("memberVo", memberService.selectOne());
		return "member/get";
	}
}

