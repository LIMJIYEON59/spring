package kh.lcalss.db1.board.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.lcalss.db1.board.model.vo.BoardVo;
import kh.lclass.db1.board.model.service.BoardService;

@Controller
@RequestMapping("/board") //<-이렇게 적으면 @GetMapping("/board/get") 앞에 board 안 적어도됨(소문자)
public class BoardController {
	  @Autowired 
	  private BoardService boardService; //앞에서 만들어진 걸(객체) 쓰고싶으면 @붙이고 선언만 해주면 끌어다가 쓸 수 있다.
	  
	  @GetMapping("/list") 
	  public String list(Model model) {
		  model.addAttribute("boardList", boardService.selectList()); //memberList라고 이름 정해줌
		  return "board/list"; 
	  }
	  
	  @GetMapping("/get") 
	  public String get(Model model
			  //방법 1  ,HttpServletRequest request
			  , int bno // 방법 2
			  , String a
			  ) {
		  	  //방법 1   int bno = Integer.parseInt(request.getParameter("bno")); //형변환
		  model.addAttribute("boardvo", boardService.selectOne(bno)); //memberList라고 이름 정해줌
		  return "board/get"; 
	  }
	  @GetMapping("/insert")
	  public String insert(
			  
			  ) {
		  return "board/insert";
	  }
	  
	  @PostMapping("/insert")
	  public String insertDo(
			BoardVo vo
			, String btitle
			  ) {
		  return "board/insert";
	  }
	
}
