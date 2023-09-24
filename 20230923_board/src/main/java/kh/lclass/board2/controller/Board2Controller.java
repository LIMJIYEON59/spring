package kh.lclass.board2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Board2Controller {
	
	@GetMapping("/board")
	public ModelAndView selectList(ModelAndView mv) {
		mv.setViewName("/board");
		return mv;
	}

}
