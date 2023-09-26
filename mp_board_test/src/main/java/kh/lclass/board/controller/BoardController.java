package kh.lclass.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import kh.lclass.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public ModelAndView selectList(ModelAndView mv) {
		mv.setViewName("/board"); //setViewName라는 메서드를 이용해서 어떤 뷰를 보여줄지 설정한다.
		return mv;
	}
}
