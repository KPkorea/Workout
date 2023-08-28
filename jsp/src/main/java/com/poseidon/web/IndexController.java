package com.poseidon.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.poseidon.web.dto.BoardDTO;
import com.poseidon.web.service.IndexService;
//commit
@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		int totalSize = indexService.totalSize();
		mv.addObject("totalSize", totalSize);
		mv.addObject("test", "테스트");
		
		return mv;
	}
	
	@GetMapping("/board")
	public ModelAndView board() {
		ModelAndView mv = new ModelAndView("board");
		List<BoardDTO> boardlist = indexService.boardList();
		mv.addObject("list", boardlist);
		return mv;
	}
}
