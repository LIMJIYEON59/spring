package kh.lclass.board2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kh.lclass.board2.service.Board2Service;
import kh.lclass.board2.vo.Board2Vo;

@Controller
public class Board2Controller {
	
	@Autowired
	private Board2Service boardservice;
	
	@GetMapping("/board")
	public ModelAndView board2(ModelAndView mv) {
		mv.setViewName("board");
		return mv;
	}
	
	@PostMapping("/insertboard2")
	public String insert(Model model, Board2Vo boardvo) {
		System.out.println("bbb :" + boardvo );
		boardservice.insert(boardvo);
		return "redirect:board?BNO=" +boardvo.getBno();
	}

}
