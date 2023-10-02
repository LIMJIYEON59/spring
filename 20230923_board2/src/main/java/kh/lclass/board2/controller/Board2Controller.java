package kh.lclass.board2.controller;

import java.util.List;

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
		mv.setViewName("/board");
		return mv;
	}
	
	@PostMapping("/insertboard2")
	public String insert(Model model, Board2Vo boardvo) {
		System.out.println("bbb :" + boardvo );
		boardservice.insert(boardvo);
		return "redirect:board?BNO=" +boardvo.getBno();
	}
	
	/*
	 * @GetMapping("/selectListboard2")
	 * 
	 * @ResponseBody //데이터를 반환할 떄 public List<Board2Vo> selectList(){
	 * System.out.println("selectListboard2 들어옴요"); List<Board2Vo> list =
	 * boardservice.selectList(); return list; }
	 */
	//게시판 목록
	@GetMapping("/list")
	public String selectList(Model model) {
		List<Board2Vo> list = boardservice.selectList();
		model.addAttribute("bno");
		model.addAttribute("list", list);
		return "list";
	}
	//게시판 상세정보
	@GetMapping("/read")
	public String read(Model model, String bno) {
		Board2Vo read = boardservice.read(bno);
		System.out.println("[read]" + bno);
		model.addAttribute("bno", bno);
		model.addAttribute("read", read);
		return "read";
	}
	//게시판 수정
	@PostMapping("/update")
	@ResponseBody
	public String update(Board2Vo boardvo) {
		boardservice.update(boardvo);
		return "redirect:list";
	}
	
	//게시판 삭제
	@PostMapping("/delete")
	@ResponseBody
	public String delete(Board2Vo boardvo, String bno) {
		boardservice.delete(boardvo.getBno());
		return "redirect:list";
		
	}
	

}
