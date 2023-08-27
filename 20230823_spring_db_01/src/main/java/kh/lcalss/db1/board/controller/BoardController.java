package kh.lcalss.db1.board.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kh.lcalss.db1.board.model.vo.BoardVo;
import kh.lclass.db1.board.model.service.BoardService;

@Controller
@RequestMapping("/board") //<-이렇게 적으면 @GetMapping("/board/get") 앞에 board 안 적어도됨(소문자)
public class BoardController {
	  @Autowired 
	  private BoardService boardService; //앞에서 만들어진 걸(객체) 쓰고싶으면 @붙이고 선언만 해주면 끌어다가 쓸 수 있다.
	  
	  @GetMapping("/list") 
	  public ModelAndView list(
//			  RedirectAttributes rttr, 이렇게 하면 안
			  String msg2,
			  String msg3,
			  String n1,
			  
			  //Controller -> JSP(View) 데이터 전달
			  ModelAndView mv
			  ) throws Exception{
	
		  // 여기서 꺼내봤자 의미없음. JSP에서 데이터가 꺼내진다.(JSP에서 해야함)
//		  System.out.println(rttr.getAttribute("msg2"));
//		  Map<String, Object> map =  (Map<String, Object>)rttr.getFlashAttributes();
//		  System.out.println("msg"); 
		  System.out.println(msg2);
		  System.out.println(msg3);
		  System.out.println(n1);
		  
		  // Controller --> JSP(View) 데이터 전달
		  //model.addAttribute("boardList", boardService.selectList());
		  // Controller --> JSP(View) 선택 forward
		  //return "board/list";
		  
		  mv.addObject("boardList", boardService.selectList()); //memberList라고 이름 정해줌
		  mv.setViewName("board/list");
		  return mv; 
		 
	  }
	  
	  @GetMapping("/get") 
	  public String get(
			  Model model
			  // JSP -> Controller 데이터
			  //방법 1  ,HttpServletRequest request
			  , int bno // 방법 2
			  , String a
			  ) throws Exception {
		   
		  	   // JSP -> Controller 데이터
		  	  //방법 1   int bno = Integer.parseInt(request.getParameter("bno")); //형변환
		
		  // Controller -> JSP(View) 데이터 전달
		  model.addAttribute("boardvo", boardService.selectOne(bno)); //memberList라고 이름 정해줌
		// Controller -> JSP(View) 선책 forward
		  return "board/get"; 
	  }
	  //이 코드에서 할 것은 아무것도 없음!!
	  @GetMapping("/insert")
	  public String insert() {
		  // FlashAttribute를 위해 작성할 거 없음 JSP에서 하는 것임(JSP에서 전달 set으로)
		  return "board/insert";
	  }
	  
	  @PostMapping("/insert")
	  public String insertDo(
			  //메세지 전달하려고 Redirect할 때 전달 
			RedirectAttributes redirectAttr, // redirect:/url 상황에서 url --> jsp 데이터를 전달하기 위해 추가된 자료형(딱 한 번만 사용되고 더이상 뜨지 않음)
			BoardVo vo
			, String btitle
			  ) {
		  
		  String viewPage = "redirect:/";	//메인페이지?
		  
		  // 방법 1
//		  String btitle = request.getParameter("btitle");
//		  String bcontent = request.getParameter("bcontent");
//		  BoardVo vo = new BoardVo();
//		  vo.setBcontent(bcontent);
//		  vo.setBtitle(btitle);
		  System.out.println(vo);
		  System.out.println(btitle);
		  
		  vo.setMid("kh1");
		  
		  int result;
		  try {
			  result = boardService.insert(vo);	
			  result = 1;
			  // 1: 글등록 성공, 0: 글등록 실패
			  if(result < 1) {
				  //add어쩌구 1회성
				  redirectAttr.addAttribute("msg2", "msg2");
				  redirectAttr.addFlashAttribute("msg", "글 등록 실패했습니다. 다시 입력하고 등록해주세요.");//addFlashAttribute 1회성으로 뿌려짐
				  viewPage = "redirect:/board/insert";
			  } else {
				  redirectAttr.addAttribute("msg2", "msg2");
				  redirectAttr.addAttribute("m3", "m3");
				  redirectAttr.addFlashAttribute("msg", "글 등록 되었습니다");
				  viewPage = "redirect:/board/list?n1=v1&n2=v2";
			  }
		  } catch (Exception e) {
			//오류 발생시
			  redirectAttr.addAttribute("msg2", "msg2");
			  redirectAttr.addFlashAttribute("msg", "예기치 못한 상황으로 글 등록에 실패했습니다. 다시 시도해 주세요.");
			  viewPage = "redirect:/board/list";
		  }
		  return viewPage;
	  }
	  @ExceptionHandler
	  public void e() {
		  
	  }
	
}
