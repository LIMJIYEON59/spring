package kh.lclass.cal.calendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalendarController {
	@GetMapping("/pcal")
	public ModelAndView selectList(ModelAndView mv) {
		mv.setViewName("calendar/calendar");
		return mv;
	}

}
